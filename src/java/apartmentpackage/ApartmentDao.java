package apartmentpackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.*;

public class ApartmentDao {
      public boolean addApp(AppartMentBean A)
      {
          String RoomId10=A.getRoomId();
          String Address10=A.getAddress();
          String state=A.getState();
          String bedrooms10 =A.getBedrooms();
          String Email10=A.getEmail();
          InputStream img = A.getImage();
          try
          {
              Connection conn= DBConnection.getConnection();
              String query2="insert into Apdata values(?,?,?,?,?,?,?,?)";
              PreparedStatement psmt = conn.prepareStatement(query2);
              String query3="insert into Image values(?)";
              PreparedStatement psmt2 = conn.prepareStatement(query3);
              psmt2.setBlob(1, img);
              int j =(int)psmt2.executeLargeUpdate();
              PreparedStatement stmt3 = conn.prepareStatement("select img from Image");
              ResultSet rs = stmt3.executeQuery();
              rs.next();
              Blob b = rs.getBlob(1);
              byte[] by = b.getBytes(1, (int)b.length());
              String js ="C:\\Users\\get it\\Documents\\NetBeansProjects\\ProjectApartment\\web\\"+RoomId10+".jpg";
              String tryy=RoomId10+".jpg";
               FileOutputStream fout = new FileOutputStream(js);
              fout.write(by);
              fout.close();
              String query4="truncate table Image";
              PreparedStatement psmt5 = conn.prepareStatement(query4);
              int s=psmt5.executeUpdate();
              psmt.setString(1, RoomId10);
              psmt.setString(2, Email10);
              psmt.setString(3, state);
              psmt.setString(4, Address10);
              psmt.setString(5, bedrooms10);
              psmt.setString(6, tryy);
              psmt.setString(7, "No Requests");
              psmt.setString(8, "Request Pending");
              int i= (int)psmt.executeLargeUpdate();
         conn.close();
              System.out.println("hello"+s);
         if(i!=0 && j!=0 && s==0)
             return true;
         else
             return false;
          }
          catch(Exception e)
          {
              e.printStackTrace();
          }
          return false;
      }
}
