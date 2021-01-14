/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tambah_buku;

/**
 *
 * @author asus
 */ 
import javax.swing.JButton;
import all.allclass;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;

  
public class view_tambah extends JFrame implements allclass{
    int Jperpus;
    public String JudulBuku, GenreBuku, Penulis, Penerbit, Lokasi, Stok;
    public JLabel lJudul, lJudulBuku, lGenreBuku, lPenulis, lPenerbit, lLokasi, lStok;
    public JTextField fJudulBuku, fGenreBuku, fPenulis, fPenerbit, fLokasi, fStok;
    public JButton bTambah;
    
    public view_tambah(){
        setTitle("PERPUSTAKAAN UMUM YOGYAKARTA");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setSize(400,420);
            
        fJudulBuku = new JTextField();
            lJudulBuku = new JLabel("Judul Buku ");
        fGenreBuku = new JTextField();
            lGenreBuku = new JLabel("Genre Buku "); 
        fPenulis = new JTextField();
            lPenulis = new JLabel("Penulis ");
        fPenerbit = new JTextField();
            lPenerbit = new JLabel("Penerbit ");
        fLokasi = new JTextField();
            lLokasi = new JLabel("Lokasi "); 
        fStok = new JTextField();
            lStok = new JLabel("Stok ");    
        bTambah = new JButton("Tambah");
        
        //ADD COMPONENT
        add(fJudulBuku);
        add(lJudulBuku);
        add(fGenreBuku);
        add(lGenreBuku);
        add(lPenulis);
        add(fPenulis);
        add(fPenerbit);
        add(lPenerbit);
        add(fLokasi);
        add(lLokasi);
        add(lStok);
        add(fStok);
        add(bTambah);
        
        //LABEL
        lJudulBuku.setBounds(15, 20, 140, 40);
            lJudulBuku.setFont(new Font("SansSerif", Font.BOLD, 14));
        lGenreBuku.setBounds(15, 70, 140, 40);
            lGenreBuku.setFont(new Font("SansSerif", Font.BOLD, 14));
        lPenulis.setBounds(15, 120, 140, 40);
            lPenulis.setFont(new Font("SansSerif", Font.BOLD, 14));
        lPenerbit.setBounds(15, 170, 140, 40);
            lPenerbit.setFont(new Font("SansSerif", Font.BOLD, 14));
        lLokasi.setBounds(15, 220, 140, 40);
            lLokasi.setFont(new Font("SansSerif", Font.BOLD, 14));
        lStok.setBounds(15, 270, 140, 40);
            lStok.setFont(new Font("SansSerif", Font.BOLD, 14));
            
        //TEXTFIELD
        fJudulBuku.setBounds(140, 20, 230, 40);
            fJudulBuku.setFont(new Font("SansSerif", Font.BOLD, 14));
        fGenreBuku.setBounds(140, 70, 230, 40);
            fGenreBuku.setFont(new Font("SansSerif", Font.BOLD, 14));
        fPenulis.setBounds(140, 120, 230, 40);
            fPenulis.setFont(new Font("SansSerif", Font.BOLD, 14));
        fPenerbit.setBounds(140, 170, 230, 40);
            fPenerbit.setFont(new Font("SansSerif", Font.BOLD, 14));
        fLokasi.setBounds(140, 220, 230, 40);
            fLokasi.setFont(new Font("SansSerif", Font.BOLD, 14));
        fStok.setBounds(140, 270, 230, 40);
            fStok.setFont(new Font("SansSerif", Font.BOLD, 14));
        
        //BUTTON
        bTambah.setBounds(15, 320, 350, 40);
            bTambah.setFont(new Font("SansSerif", Font.BOLD, 18));
    }

   
    public String getJudulBuku() {
        return fJudulBuku.getText();
    }

 
    public String getGenreBuku() {
        return fGenreBuku.getText();
    }

   
    public String getPenulis() {
        return fPenulis.getText();
    }


    public String getPenerbit() {
        return fPenerbit.getText();
    }

    public String getLokasi() {
        return fLokasi.getText();
    }

    public String getStok() {
        return fStok.getText();
    }
    
}

