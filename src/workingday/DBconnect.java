
package workingday;

import java.sql.Connection;
import java.sql.DriverManager;



public class DBconnect {
    
    public static Connection connect()
    {
       Connection conn = null;
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
             conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable","root","root");
        
        }
        catch  (Exception e)
        {
        
            System.out.println("e");
            
        }
        
        return conn;
    }

    
}
