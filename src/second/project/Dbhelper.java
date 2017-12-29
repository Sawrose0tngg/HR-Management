
package second.project;


import java.sql.*;

public class Dbhelper {
     private static Connection conn = null; 
    Statement stmt = null;
    
    public Dbhelper() throws ClassNotFoundException, SQLException
    {
       if(conn == null){            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobchaiyo", "root", "");
        }
        stmt = conn.createStatement();      
    }   
    
    public int executeUpdate(String sql) throws SQLException
    {          
        return stmt.executeUpdate(sql);            
    }        
                
    public ResultSet executeQuery(String sql) throws SQLException
    {
        return stmt.executeQuery(sql);                
    }
    
    public void closeConnection() throws SQLException
    {
        conn.close();
    }
}