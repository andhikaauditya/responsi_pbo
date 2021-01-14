/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import java.awt.Font;
/**
 *
 * @author asus
 */

    public class view_home extends JFrame{
        int Jperpus;
    public JLabel lJudul;
    
    public JButton bTambah, bHapus, bEdit, bCari, bTampil, bKeluar;
    String data[][] = new String[500][7];
    
    DefaultTableModel TModel;
    JScrollPane SPane;
    public Object NKolom[] = {"ID","Judul Buku","Genre Buku","Penulis","Penerbit","Lokasi","Stok"};
    public JTable tabel = new JTable(data,NKolom);
    
    public view_home(){
        setTitle("PERPUSTAKAAN UMUM YOGYAKARTA");
        SPane = new JScrollPane(tabel);
        add(SPane);
        SPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setSize(900,500);
        add(SPane);
        SPane.setBounds(20, 70, 500, 350);
            
        lJudul = new JLabel("PERPUSTAKAAN UMUM YOGYAKARTA");
            lJudul.setFont(new Font("SansSerif", Font.ITALIC, 24));
        
        bTambah = new JButton("Tambah");
        bHapus= new JButton("Hapus");
        bEdit = new JButton("Edit");
        bCari = new JButton("Cari");
        bTampil = new JButton("Tampil");
        bKeluar = new JButton("Keluar");
        
        //LABEL
        lJudul.setBounds(50, 10, 700, 70);
        
        //ADD COMPONENT
        add(lJudul);
        add(bTambah);
        add(bHapus);
        add(bEdit);
        add(bCari);
        add(bTampil);
        add(bKeluar);
        
        //BUTTON
        bTambah.setBounds(700, 70, 150, 50);
            bTambah.setFont(new Font("SansSerif", Font.BOLD, 10));
        bHapus.setBounds(700, 130, 150, 50);
            bHapus.setFont(new Font("SansSerif", Font.BOLD, 10));
        bEdit.setBounds(700, 190, 150, 50);
            bEdit.setFont(new Font("SansSerif", Font.BOLD, 10));
        bCari.setBounds(700, 250, 150, 50);
            bCari.setFont(new Font("SansSerif", Font.BOLD, 10));
        bTampil.setBounds(700, 310, 150, 50);
            bTampil.setFont(new Font("SansSerif", Font.BOLD, 10));
        bKeluar.setBounds(700, 370, 150, 50);
            bKeluar.setFont(new Font("SansSerif", Font.BOLD, 10));
    }
}