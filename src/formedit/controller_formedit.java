/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formedit;

import tambah_buku.*;
import Home.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author asus
 */
public class controller_formedit {
    model_formedit mf;
    view_formedit vf;
    view_home vh;
    
    public controller_formedit(view_formedit vf,model_formedit mf){
        this.vf = vf;
        this.mf = mf;
        
        if (mf.getBanyakData()!= 0){
            String dataMahasiswa[][] = mf.readData();
            //hview.tabel.setModel((new JTable(dataMahasiswa, hview.NKolom)).getModel());
        }
        
        vf.bCari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String cari = vf.getTanya();
              String datacari[][] = mf.searchData(cari);
              String JudulBuku = mf.JudulBuku;     
              String GenreBuku = mf.GenreBuku;
              String Penulis = mf.Penulis;
              String Penerbit = mf.Penerbit;
              String Lokasi = mf.Lokasi;
              String Stok = mf.Stok;
              
              vf.fJudulBuku.setText(JudulBuku);
              vf.fGenreBuku.setText(GenreBuku);
              vf.fPenulis.setText(Penulis);
              vf.fPenerbit.setText(Penerbit);
              vf.fLokasi.setText(Lokasi);
              vf.fStok.setText(Stok);
            }
        });
        
       vf.bUbah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String JudulBuku = vf.getJudulBuku();
                String GenreBuku = vf.getGenreBuku();
                String Penulis = vf.getPenulis();
                String Penerbit = vf.getPenerbit();
                String Lokasi = vf.getLokasi();
                String Stok = vf.getStok();
                mf.updateData(JudulBuku,GenreBuku,Penulis,Penerbit,Lokasi,Stok);
                
                String dataMahasiswa[][] = mf.readData();
                vf.setVisible(false);
                new MVC_home();
            }
        });
    }
}


