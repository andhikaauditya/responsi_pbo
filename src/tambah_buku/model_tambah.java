/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tambah_buku;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author asus
 */
public class model_tambah {
        String DBurl = "jdbc:mysql://localhost/responsiperpus12";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;
    
    public model_tambah(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(DBurl,DBusername,DBpassword);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            System.out.println("Koneksi gagal");
        }
    }
    
    public void insertData(String JudulBuku, String GenreBuku, String Penulis, String Penerbit, String Lokasi, String Stok){
        int JData=0;
        try{
            String query = "Select * from data_buku WHERE JudulBuku='"+JudulBuku+"'"; 
            statement = (Statement) koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                JData++;
            }
           
            if (JData==0) {
                query = "INSERT INTO data_buku(JudulBuku, GenreBuku, Penulis, Penerbit, Lokasi, Stok) VALUES ('"+JudulBuku+"','"+GenreBuku+"','"+Penulis+"','"+Penerbit+"','"+Lokasi+"','"+Stok+"')";
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil Menambahkan Data");
                JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Data");
            }
            else {
                JOptionPane.showMessageDialog(null, "Maaf, Data Sudah Ada");
            }
        }catch (Exception sql){
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public String[][] readData(){
        try{
            int JData = 0;
            
            String data[][] = new String[getBanyakData()][7];
            
            String query = "Select * from data_buku"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[JData][0] = resultSet.getString("ID");
                data[JData][1] = resultSet.getString("JudulBuku");     
                data[JData][2] = resultSet.getString("GenreBuku");
                data[JData][3] = resultSet.getString("Penulis");
                data[JData][4] = resultSet.getString("Penerbit");
                data[JData][5] = resultSet.getString("Lokasi");
                data[JData][6] = resultSet.getString("Stok");
                JData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public int getBanyakData(){
        int JData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from data_buku";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                JData++;
            }
            return JData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
}

