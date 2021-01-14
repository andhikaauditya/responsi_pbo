/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

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

public class model_home {
    
String DBurl = "jdbc:mysql://localhost/responsiperpus12";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;
    
    view_home vh;
    
    public model_home(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(DBurl,DBusername,DBpassword);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            System.out.println("Koneksi gagal");
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

