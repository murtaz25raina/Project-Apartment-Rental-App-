package apartmentpackage;

import java.io.IOException;
import java.util.Properties;
import java.util.UUID;
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

@WebServlet(name = "OtpServlet", urlPatterns = {"/OtpServlet"})
public class OtpServlet extends HttpServlet {

   @Override
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException ,ServletException
    {
        String name = req.getParameter("Name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String mobile = req.getParameter("phone");
        String address = req.getParameter("address");  
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
        message.addRecipient(Message.RecipientType.TO,new InternetAddress(email));  
        //message.setSubject(subject);  
        msg=UUID.randomUUID().toString();
        message.setText(msg);  
   
        //3rd step)send message  
       Transport.send(message);  
  
       System.out.println("Done");  
         }
        catch (MessagingException e) {
            System.out.println(e);
       //throw new RuntimeException(e);  
       }  
        HttpSession session1 = req.getSession(true); // reuse existing
        session1.setMaxInactiveInterval(3000); // 30 seconds
	
        session1.setAttribute("OTP", msg);
        session1.setAttribute("NameT", name);
        session1.setAttribute("EmailT", email);
        session1.setAttribute("PasswordT", password);
        session1.setAttribute("MobileT", mobile);
        session1.setAttribute("AddressT", address);
        req.getRequestDispatcher("/OtpPage.jsp").forward(req, res);
    }
}
