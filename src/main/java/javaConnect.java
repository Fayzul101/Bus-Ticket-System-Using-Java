
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alohomora
 */
public class javaConnect {
    Connection conn;
    public static Connection ConnectDB(){
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/BusTicketSystem", "root", "ict1");
          return conn;
    }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
          return null;
      }
  
    }
}
