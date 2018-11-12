package apartmentpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ApproveRequest", urlPatterns = {"/ApproveRequest"})
public class ApproveRequest extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          try{
           Connection N = DBConnection.getConnection();
          String Idd01=request.getParameter("APD");
          System.out.println(Idd01);
          String query109="update Apdata set Requestdetail=(?) where ApId=(?)" ;
          PreparedStatement st220 = N.prepareStatement(query109);
          String abd="Approved";
          st220.setString(1, abd);
          st220.setString(2, Idd01);
          int i = st220.executeUpdate();
          if(i!=0)
          {
              response.sendRedirect("FirstPage.jsp");
          }
        }
        catch(IOException | ClassNotFoundException | SQLException e){
            e.printStackTrace();}
    
    }
}
