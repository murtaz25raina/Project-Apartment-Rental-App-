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
@WebServlet(urlPatterns = {"/Fback"})
public class Fback extends HttpServlet {

   @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          try
          {
             Connection conn = DBConnection.getConnection();
             String q="select * from feedback2019;";
             PreparedStatement stmt20 = conn.prepareStatement(q);
             ResultSet resultSet = stmt20.executeQuery();
             ArrayList<FeedbackBean> Arr3 = new ArrayList<FeedbackBean>(); 
             while(resultSet.next()){
                Arr3.add(new FeedbackBean(resultSet.getString("Email"),resultSet.getString("Message")));
             }
             request.setAttribute("Apt", Arr3);
           
             request.getRequestDispatcher("/Feedback.jsp").forward(request, response);
          } 
       
           
          catch(IOException | ClassNotFoundException | SQLException | ServletException e)
          {
              
       }
        
    }
}
