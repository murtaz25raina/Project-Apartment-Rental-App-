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
import javax.servlet.http.HttpSession;

@WebServlet(name = "BuyingRequest", urlPatterns = {"/BuyingRequest"})
public class BuyingRequest extends HttpServlet {
      @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        try{
           Connection N = DBConnection.getConnection();
           HttpSession session = request.getSession();
          String ab=(String) session.getAttribute("Email");
          String Idd1=request.getParameter("APD");
          System.out.println(Idd1);
          String query111="update Apdata set RequestedBy=(?) where ApId=(?)";
          PreparedStatement st2 = N.prepareStatement(query111);
          st2.setString(1, ab);
          st2.setString(2, Idd1);
          int i = st2.executeUpdate();
          if(i!=0)
          {
             request.getRequestDispatcher("/ListOforderz").forward(request, response);
             // response.sendRedirect("FirstPage.jsp");
          }
        }
        catch(IOException | ClassNotFoundException | SQLException e){
            e.printStackTrace();}
    }
}
