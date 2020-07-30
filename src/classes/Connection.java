
package classes;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author root
 */
public class Connection {
    
    public static java.sql.Connection connexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","");
            
                    if(conn!=null){
                        //System.out.println("Connected");
                    }
                    else{
                          System.out.println(" Connection Failed");   
                    }
            
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
             System.out.println("---------> SQL exception :"+e);
        }
    return null;
    }
    
}
