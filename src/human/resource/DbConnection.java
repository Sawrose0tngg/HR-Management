/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human.resource;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DbConnection {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jobchaiyo", "root", "");
            
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to connect Database");
        }
        return null;
    }

}
