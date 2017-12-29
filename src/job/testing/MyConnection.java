/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job.testing;

import front.desk.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class MyConnection {
    
        public static Connection getConnect(){
      try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jobchaiyo","root","");
            return conn;
        }
        catch(Exception e){
            e.printStackTrace();
        }
    
      return null;
    }
}
