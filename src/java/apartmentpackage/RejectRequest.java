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

@WebServlet(name = "RejectRequest", urlPatterns = {"/RejectRequest"})
public class RejectRequest extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          try{
           Connection N = DBConnection.getConnection();
          String Idd0=request.getParameter("lol");
          System.out.println(Idd0);
          String query19="update Apdata set RequestedBy=(?),Requestdetail=(?) where ApId=(?)" ;
          PreparedStatement st22 = N.prepareStatement(query19);
          String ab="No Requests";
          String ab11="Request pending";
          st22.setString(1, ab);
          st22.setString(2,ab11);
          st22.setString(3, Idd0);
          int i = st22.executeUpdate();
          if(i!=0)
          {
              response.sendRedirect("FirstPage.jsp");
          }
        }
        catch(IOException | ClassNotFoundException | SQLException e){
            e.printStackTrace();}
    
    }
}
