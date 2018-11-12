package apartmentpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author get it
 */
@WebServlet(urlPatterns = {"/Insertfeedback"})
public class Insertfeedback extends HttpServlet {

   @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          try
          {
          HttpSession session = request.getSession();
          String ab=(String) session.getAttribute("Email");
          String fck =request.getParameter("cmnt");
          Connection conn = DBConnection.getConnection();
             String quet="insert into feedback2019 values(?,?)";
             PreparedStatement stmt = conn.prepareStatement(quet);
             stmt.setString(1, ab);
             stmt.setString(2, fck);
             stmt.executeUpdate();
             request.getRequestDispatcher("/Fback").forward(request, response);
          } 
       
           
          catch(IOException | ClassNotFoundException | SQLException | ServletException e)
          {
              
       }
        
    }
}
