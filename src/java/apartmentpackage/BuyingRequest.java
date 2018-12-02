package apartmentpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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
           HttpSession session12 = request.getSession();
          String ab=(String) session12.getAttribute("Email");
          String Idd1=request.getParameter("APD");
          System.out.println(Idd1);
          String EmailReq=request.getParameter("AP20");
          String query111="update Apdata set RequestedBy=(?) where ApId=(?)";
          PreparedStatement st2 = N.prepareStatement(query111);
          st2.setString(1, ab);
          st2.setString(2, Idd1);
          int i = st2.executeUpdate();
          if(i!=0)
          {
             String msg="";
          final String user="myhomeotp@gmail.com";//change accordingly  
          final String pass="murtaz22";  
  
       //1st step) Get the session object    
        Properties props = new Properties();  
        
         props.setProperty("mail.transport.protocol", "smtp");     
         props.setProperty("mail.host", "smtp.gmail.com");  
         props.put("mail.smtp.auth", "true");  
         props.put("mail.smtp.port", "465");  
         props.put("mail.debug", "true");  
         props.put("mail.smtp.socketFactory.port", "465");  
         props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");  
         props.put("mail.smtp.socketFactory.fallback", "false");
  
        Session session = Session.getDefaultInstance(props,  
        new javax.mail.Authenticator() {  
        protected PasswordAuthentication getPasswordAuthentication() {  
        return new PasswordAuthentication(user,pass);  
        }  
         });  
        //2nd step)compose message  
        try {  
        MimeMessage message = new MimeMessage(session);  
        message.setFrom(new InternetAddress(user));  
        message.addRecipient(Message.RecipientType.TO,new InternetAddress(EmailReq));  
        message.setSubject("NOTIFICATION FROM MYHOME");  
        msg="Your Apartment Has been Requested by "+ab+", visit the Website and Check MYApartments";  
        message.setText(msg);
        //3rd step)send message  
       Transport.send(message);  
  
       System.out.println("Done");  
         }
        catch (MessagingException e) {
            System.out.println(e);
       //throw new RuntimeException(e);  
       } 
             request.getRequestDispatcher("/ListOforderz").forward(request, response);
             // response.sendRedirect("FirstPage.jsp");
          }
        }
        catch(IOException | ClassNotFoundException | SQLException e){
            e.printStackTrace();}
    }
}
