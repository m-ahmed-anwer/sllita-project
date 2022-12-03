package DatabaseLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseConnect {
    
    public static Connection connect(){
        Connection conn=null;
    
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/ueats","root","");
            System.out.println("Database Connected Successfully");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
    
}

