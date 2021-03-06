package apartmentpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
   @Override
   public void service (HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
   {
       String Email =req.getParameter("email");
       String Password = req.getParameter("password");
       LoginBean LB = new LoginBean();
       LB.setEmail(Email);
       LB.setPassword(Password);
       loginDao LDD = new loginDao();
       boolean check=LDD.getLogIn(LB);
        if(check==true){
            HttpSession session = req.getSession(true); // reuse existing
			session.setAttribute("Email", Email);
			session.setMaxInactiveInterval(3000); // 30 seconds
			res.sendRedirect("FirstPage.jsp");
        }
            //req.getRequestDispatcher("/FirstPage.jsp").forward(req, res);}
        else
        {
            PrintWriter out = res.getWriter();
         
                 out.println("<script type=\"text/javascript\">");
                 out.println("alert('UserEmail or password incorrect');");
                 out.println("location='LogIn.jsp';");
                 out.println("</script>");
                  //  req.getRequestDispatcher("/SignUp.jsp").include(req, res);
        }
   }
}
