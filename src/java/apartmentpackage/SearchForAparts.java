package apartmentpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SearchForAparts", urlPatterns = {"/SearchForAparts"})
public class SearchForAparts extends HttpServlet {
     @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String State10 = request.getParameter("ste");
     HttpSession session111 = request.getSession();
          String abo=(String) session111.getAttribute("Email");
         try
         {
             Connection conn = DBConnection.getConnection();
             String que="select * from Apdata where state=(?) AND RequestedBy=(?) AND UserEmail!=(?)";
             PreparedStatement stmt = conn.prepareStatement(que);
             stmt.setString(1, State10);
             stmt.setString(2, "No Requests");
             stmt.setString(3, abo);
              ResultSet resultSet = stmt.executeQuery();
              response.setContentType("text/html");
              PrintWriter out = response.getWriter();
              ArrayList<ListingBean> Arr = new ArrayList<ListingBean>(); 
             while(resultSet.next()){
               //  String z=resultSet.getString("UserEmail");
                Arr.add(new ListingBean(resultSet.getString("Imglink"),resultSet.getString("ApId"),resultSet.getString("UserEmail"),resultSet.getString("state"),resultSet.getString("Address"),resultSet.getString("Bedroom"),resultSet.getString("RequestDetail"),resultSet.getString("RequestedBy")));
            /*out.println("<p><img src="+resultSet.getString("Imglink")+" width=200 height=200 style="+"float:left;margin:0 20px 20px 0;>"+
                    "<p>&nbsp&nbsp&nbsp&nbsp Room ID :"+resultSet.getString("ApId")+"</p>"
                      + "<p>&nbsp&nbsp&nbsp&nbsp Owner Email :"+resultSet.getString("UserEmail")+"</p>"
                      + "<p> &nbsp&nbsp&nbsp&nbsp State :"+resultSet.getString("state")+"</p>"
                              + "<p>&nbsp&nbsp&nbsp&nbsp Address :"+resultSet.getString("Address")+"</p>"
                      + "<p>&nbsp&nbsp&nbsp No. of Bedrooms"+resultSet.getString("Bedroom")+"</p>"     
                              +"<p><form method="+"post"+" action="+"BuyingRequest"+" +>"
                              +"<input type="+"hidden"+" name="+"APD" +" value="+resultSet.getString("ApId")+" >"
                              + "<input type="+"submit" +" value="+"Select an Appartment"+"><form></p>"
                    +"<br><br><hr></p>"
              );*/
               }
             // out.println("");
              request.setAttribute("Lord", Arr);
              request.getRequestDispatcher("/ListingofAparts.jsp").include(request, response);
          } 
          
         catch (IOException | ClassNotFoundException | SQLException | ServletException ex) {
             System.out.print(ex);
         }
    }

}
