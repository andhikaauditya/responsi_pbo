/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hapus_buku;

import Home.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author asus
 */
public class controller_hapus {

    model_hapus mh;
    view_hapus vh;
    
    public controller_hapus(view_hapus vh, model_hapus mh){
        this.vh= vh;
        this.mh = mh;
        
        if (mh.getBanyakData()!= 0){
            String dataMahasiswa[][] = mh.readData();
            //hpview.tabel.setModel((new JTable(dataMahasiswa, hpview.NKolom)).getModel());
        }

        vh.bOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               String cari = vh.getTanya();
               int input = JOptionPane.showConfirmDialog(null,"Menghapus Buku dengan ID " + cari + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

               if (input == 0) {
                   String data [][] = mh.searchData(cari);
                   mh.deleteData(cari);
                   String dataMahasiswa[][] = mh.readData();
               }else{
               JOptionPane.showMessageDialog(null, "Hapus Gagal!");
               }
               vh.setVisible(false);
               new MVC_home();
            }
        });
        
        vh.bBatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               vh.setVisible(false);
                new MVC_home();
            }
        });
    }
}

    

