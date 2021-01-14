/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hapus_buku;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author asus
 */
public class view_hapus extends JFrame{
    int Jperpus;
    public JLabel lTanya;
    public JTextField fTanya;
    public JButton bOK, bBatal;
    
    public view_hapus(){
        setTitle("PERPUSTAKAAN UMUM YOGYAKARTA");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setSize(250,200);
        
        fTanya = new JTextField();
            lTanya = new JLabel("Input ID Buku Yang Akan Dihapus ");
        bOK = new JButton("OK");
        bBatal= new JButton("Batal");
        
        //ADD COMPONENT
        add(lTanya);
        add(fTanya);
        add(bOK);
        add(bBatal);
        
        //LABEL
        lTanya.setBounds(15, 10, 200, 40);
            lTanya.setFont(new Font("SansSerif", Font.BOLD, 12));
            
        //TEXTFIELD
        fTanya.setBounds(15, 50, 200, 40);
            fTanya.setFont(new Font("SansSerif", Font.BOLD, 12));
        
        
        //BUTTON
        bOK.setBounds(30, 100, 70, 30);
            bOK.setFont(new Font("SansSerif", Font.BOLD, 12));
        bBatal.setBounds(130, 100, 70, 30);
            bBatal.setFont(new Font("SansSerif", Font.BOLD, 12));
    }
    
    public String getTanya(){
        return fTanya.getText();
    }
}
