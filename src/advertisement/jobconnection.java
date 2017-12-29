
package advertisement;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class jobconnection {
    public static Connection ConnectDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobchaiyo","root","");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to connect database");
                    
        }
        return null;
        
        
    
    
    }
}
