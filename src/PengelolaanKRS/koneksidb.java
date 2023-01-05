package PengelolaanKRS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author achma
 */
public class koneksidb {
    
    private static Connection mysqlkoneksi;
    
    public static Connection databaseDB() throws SQLException{
        try{
        String url = "jdbc:mysql://localhost:3306/pbo_uas_database";
        String user = "root";
        String pass = "";
           
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        mysqlkoneksi = DriverManager.getConnection(url, user, pass);
        
     }catch(SQLException e){
        System.out.println("Koneksi ke Database Gagal " + e.getMessage());
     }
    return mysqlkoneksi;
    }
    
}
