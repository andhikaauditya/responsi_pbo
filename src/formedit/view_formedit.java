/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formedit;
import java.awt.Font;
import all.allclass;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author asus
 */
public class view_formedit extends JFrame implements allclass {
    
    int Jperpus;
    public String Tanya, JudulBuku, GenreBuku, Penulis, Penerbit, Lokasi, Stok;
    public JLabel lTanya, lJudulBuku, lGenreBuku, lPenulis, lPenerbit, lLokasi, lStok;
    public JTextField fTanya, fJudulBuku, fGenreBuku, fPenulis, fPenerbit, fLokasi, fStok;
    public JButton bUbah, bCari;
    
    public view_formedit(){
        setTitle("PERPUSTAKAAN UMUM YOGYAKARTA");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setSize(400,520);
            
        fTanya = new JTextField();
            lTanya = new JLabel("ID data Diubah ");
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
        bUbah = new JButton("Ubah");
        bCari = new JButton("Cari");
        
        //ADD COMPONENT
        add(fTanya);
        add(lTanya);
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
        add(bUbah);
        add(bCari);
        
        //LABEL
        lTanya.setBounds(15, 20, 140, 40);
            lTanya.setFont(new Font("SansSerif", Font.BOLD, 14));
        lJudulBuku.setBounds(15, 120, 140, 40);
            lJudulBuku.setFont(new Font("SansSerif", Font.BOLD, 14));
        lGenreBuku.setBounds(15, 170, 140, 40);
            lGenreBuku.setFont(new Font("SansSerif", Font.BOLD, 14));
        lPenulis.setBounds(15, 220, 140, 40);
            lPenulis.setFont(new Font("SansSerif", Font.BOLD, 14));
        lPenerbit.setBounds(15, 270, 140, 40);
            lPenerbit.setFont(new Font("SansSerif", Font.BOLD, 14));
        lLokasi.setBounds(15, 320, 140, 40);
            lLokasi.setFont(new Font("SansSerif", Font.BOLD, 14));
        lStok.setBounds(15, 370, 140, 40);
            lStok.setFont(new Font("SansSerif", Font.BOLD, 14));
            
        //TEXTFIELD
        fTanya.setBounds(140, 20, 230, 40);
            fTanya.setFont(new Font("SansSerif", Font.BOLD, 14));
        fJudulBuku.setBounds(140, 120, 230, 40);
            fJudulBuku.setFont(new Font("SansSerif", Font.BOLD, 14));
        fGenreBuku.setBounds(140, 170, 230, 40);
            fGenreBuku.setFont(new Font("SansSerif", Font.BOLD, 14));
        fPenulis.setBounds(140, 220, 230, 40);
            fPenulis.setFont(new Font("SansSerif", Font.BOLD, 14));
        fPenerbit.setBounds(140, 270, 230, 40);
            fPenerbit.setFont(new Font("SansSerif", Font.BOLD, 14));
        fLokasi.setBounds(140, 320, 230, 40);
            fLokasi.setFont(new Font("SansSerif", Font.BOLD, 14));
        fStok.setBounds(140, 370, 230, 40);
            fStok.setFont(new Font("SansSerif", Font.BOLD, 14));
        
        //BUTTON
        bCari.setBounds(15, 70, 350, 40);
            bCari.setFont(new Font("SansSerif", Font.BOLD, 18));
        bUbah.setBounds(15, 420, 350, 40);
            bUbah.setFont(new Font("SansSerif", Font.BOLD, 18));
    }
    
    public String getTanya(){
        return fTanya.getText();
    }


    @Override
    public String getJudulBuku() {
        return fJudulBuku.getText();
    }


    @Override
    public String getGenreBuku() {
        return fGenreBuku.getText();
    }

 
    @Override
    public String getPenulis() {
        return fPenulis.getText();
    }

 
    @Override
    public String getPenerbit() {
        return fPenerbit.getText();
    }


    @Override
    public String getLokasi() {
        return fLokasi.getText();
    }


    @Override
    public String getStok() {
        return fStok.getText();
    }
    
}
