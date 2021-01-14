/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

/**
 *
 * @author asus
 */
import formedit.MVC_formedit;
import hapus_buku.MVC_hapus;
import Home.*;
import tambah_buku.MVC_tambah;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class controller_home {
    model_home m;
    view_home vh;
    JFrame f;

    public controller_home(view_home vh,model_home m) {
        this.vh = vh;
        this.m = m;
        
        if (m.getBanyakData() != 0) {
            String dataMahasiswa[][] = m.readData();
            vh.tabel.setModel((new JTable(dataMahasiswa, vh.NKolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }

        vh.bTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vh.setVisible(false);
                new MVC_tambah();
            }
        });
        
        vh.bCari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                
            }
        });
        
        vh.bEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                vh.setVisible(false);
                new MVC_formedit();
            }
        });
        
        vh.bHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                vh.setVisible(false);
                 new MVC_hapus();
            }
        });
        
        vh.bTampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vh.setVisible(false);
                 new MVC_home();
            }
        });
        
        vh.bKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 int input = JOptionPane.showConfirmDialog(null,"Apa anda ingin Keluar?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                    vh.setVisible(false);
                    System.exit(0);
                }
                else{
                JOptionPane.showMessageDialog(null, "Tidak Keluar");
                }
            }
        });
    }
}