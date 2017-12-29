package front.desk;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static Connection getconnect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jobchaiyo","root","");
			return con;
			
		} catch (ClassNotFoundException | SQLException e) {
		}
		return null;
		}
    public static void main(String[] args) {
        MyConnection myconn = new MyConnection();
        
        
    }
}
