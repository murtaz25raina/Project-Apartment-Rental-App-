package apartmentpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/InfoAdd"})
public class InfoAdd extends HttpServlet {

    @Override
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException ,ServletException
    {
        String name = req.getParameter("Name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String mobile = req.getParameter("phone");
        String address = req.getParameter("address");
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
        }
    }
    
}
