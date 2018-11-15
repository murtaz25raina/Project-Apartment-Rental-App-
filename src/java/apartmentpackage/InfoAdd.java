package apartmentpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.*;  
import javax.mail.internet.InternetAddress;  
import javax.mail.internet.MimeMessage;  
import java.util.*; 
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/InfoAdd"})
public class InfoAdd extends HttpServlet {

    @Override
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException ,ServletException
    {
             HttpSession session1110 = req.getSession();
          
        String name = (String) session1110.getAttribute("NameT");//req.getParameter("Name");
        String email = (String) session1110.getAttribute("EmailT");//req.getParameter("email");
        String password =(String) session1110.getAttribute("PasswordT");// req.getParameter("password");
        String mobile = (String) session1110.getAttribute("MobileT");//req.getParameter("phone");
        String address =(String) session1110.getAttribute("AddressT");// req.getParameter("address");
        String mess=(String) session1110.getAttribute("OTP");
        String oootp=req.getParameter("otp1");
        HttpSession session20 = req.getSession(false);
		session20.removeAttribute("EmailT");
                session20.removeAttribute("NameT");
                session20.removeAttribute("PasswordT");
                session20.removeAttribute("MobileT");
                session20.removeAttribute("AddressT");
                session20.removeAttribute("OTP");
        if(oootp.equals(mess)){
        RegisterBean Reg = new RegisterBean();
        Reg.setName(name);
        Reg.setEmail(email);
        Reg.setPassword(password);
        Reg.setMobile(mobile);
        Reg.setAddress(address);
        RegisterDao rDao = new RegisterDao();
        String check=rDao.getRegistered(Reg);
        if(check.equals("true"))
            req.getRequestDispatcher("/LogIn.jsp").forward(req, res);
        else if(check.equals("Exists"))
        {
            System.out.println("exists");
            req.getRequestDispatcher("/SignUp.jsp").include(req, res);
            PrintWriter out = res.getWriter();  
             res.setContentType("text/html");  
             out.println("<script type=\"text/javascript\">");  
             out.println("function ABC(){alert('Email already Exists');}");
             out.println("ABC();");
             out.println("</script>"); 
        }
        else
        {
            req.setAttribute("errMessage", check);
            req.getRequestDispatcher("/SignUp.jsp").include(req, res);
        }}
        else
        {
          PrintWriter out = res.getWriter();
         
                 out.println("<script type=\"text/javascript\">");
                 out.println("alert('Wrong OTP');");
                 out.println("location='SignUp.jsp';");
                 out.println("</script>");
              
        }
    }
    
}
