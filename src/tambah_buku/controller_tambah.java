/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tambah_buku;

import Home.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author asus
 */
public class controller_tambah {
    
    
    view_tambah vt;
    model_tambah mt;
  
    
    public controller_tambah(view_tambah vt, model_tambah mt){
        this.vt = vt;
        this.mt = mt;
        
        if (mt.getBanyakData()!= 0){
            String dataMahasiswa[][] = mt.readData();
            
        }

        vt.bTambah.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String JudulBuku = vt.getJudulBuku();
                String GenreBuku = vt.getGenreBuku();
                String Penulis = vt.getPenulis();
                String Penerbit = vt.getPenerbit();
                String Lokasi = vt.getLokasi();
                String Stok = vt.getStok();
                mt.insertData(JudulBuku,GenreBuku,Penulis,Penerbit,Lokasi,Stok);
                
                vt.fJudulBuku.setText("");
                vt.fGenreBuku.setText("");
                vt.fPenulis.setText("");
                vt.fPenerbit.setText("");
                vt.fLokasi.setText("");
                vt.fStok.setText("");
                
                String dataMahasiswa[][] = mt.readData();
                vt.setVisible(false);
                new MVC_home();
            }
        });
    }
}

