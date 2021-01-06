/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpro;
import java.awt.Cursor;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Widi
 */
public class koneksi {
    static Connection conn;
    static Statement st;
    static ResultSet rs;
    public koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "");
            st = conn.createStatement();
        }catch(Exception ex){
            System.out.println("Eror");
        }
    }
    public void tutupKoneksi() throws SQLException{
        conn.close();
        st.close();
        rs.close();
    }
}
