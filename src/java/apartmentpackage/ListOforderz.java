package apartmentpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ListOforderz", urlPatterns = {"/ListOforderz"})
public class ListOforderz extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             HttpSession session = request.getSession();
          String ab=(String) session.getAttribute("Email");
          try{
          Connection conn = DBConnection.getConnection();
             String quet="select * from Apdata where RequestedBy=(?)";
             PreparedStatement stmt = conn.prepareStatement(quet);
             stmt.setString(1, ab);
              ResultSet resultSet = stmt.executeQuery();
              ArrayList<ListingBean> Arr2 = new ArrayList<ListingBean>(); 
             while(resultSet.next()){
                Arr2.add(new ListingBean(resultSet.getString("Imglink"),resultSet.getString("ApId"),resultSet.getString("UserEmail"),resultSet.getString("state"),resultSet.getString("Address"),resultSet.getString("Bedroom"),resultSet.getString("RequestDetail"),resultSet.getString("RequestedBy")));
              }
              request.setAttribute("LordOne", Arr2);
              request.getRequestDispatcher("/listofOrders.jsp").include(request, response);
          } 
          
         catch (IOException | ClassNotFoundException | SQLException | ServletException ex) {
             System.out.print(ex);
         }
        
    }
}
