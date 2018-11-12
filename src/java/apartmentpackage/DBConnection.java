package apartmentpackage;
import java.sql.*;
public class DBConnection {
 static String url = "jdbc:mysql://localhost:3306/Apartment2019"; 
 private static final String username = "root"; 
 private static final String password = "murtaz22";
 
   public static Connection getConnection() throws ClassNotFoundException
   {
       Connection con =null;
        Class.forName("com.mysql.cj.jdbc.Driver");
       try{
           con = DriverManager.getConnection(url,username,password);
       }
       catch(SQLException e)
       {
           System.out.println(e);
       }
       return con;
   }
}
