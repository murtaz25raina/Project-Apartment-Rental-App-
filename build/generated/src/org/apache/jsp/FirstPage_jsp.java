package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FirstPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

 String spot=(String)session.getAttribute("Email");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Welcome to MyHome</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("      p{color :black;\n");
      out.write("      font-size: 15px;\n");
      out.write("      }\n");
      out.write("      body {\n");
      out.write("  background: url(hol.jpg) no-repeat;\n");
      out.write("  background-size: 100%;\n");
      out.write("  background-size: cover;\n");
      out.write("  background-position: 100% top;\n");
      out.write("    background-attachment: fixed;\n");
      out.write("      }\n");
      out.write("      .rainbow {\n");
      out.write("  \n");
      out.write("   /* Font options */\n");
      out.write("  font-family: 'Pacifico', cursive;\n");
      out.write("  text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;\n");
      out.write("  \n");
      out.write("   /* Chrome, Safari, Opera */\n");
      out.write("  -webkit-animation: rainbow 3s infinite; \n");
      out.write("  \n");
      out.write("  /* Internet Explorer */\n");
      out.write("  -ms-animation: rainbow 3s infinite;\n");
      out.write("  \n");
      out.write("  /* Standar Syntax */\n");
      out.write("  animation: rainbow 3s infinite; \n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Chrome, Safari, Opera */\n");
      out.write("@-webkit-keyframes rainbow{\n");
      out.write("  0%{color: orange;}\t\n");
      out.write("  10%{color: purple;}\t\n");
      out.write("\t20%{color: red;}\n");
      out.write("\t40%{color: yellow;}\n");
      out.write("\t60%{color: green;}\n");
      out.write("\t100%{color: blue;}\n");
      out.write("\t100%{color: orange;}\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Internet Explorer */\n");
      out.write("@-ms-keyframes rainbow{\n");
      out.write("  0%{color: orange;}\t\n");
      out.write("  10%{color: purple;}\t\n");
      out.write("\t20%{color: red;}\n");
      out.write("\t40%{color: yellow;}\n");
      out.write("\t60%{color: green;}\n");
      out.write("\t100%{color: blue;}\n");
      out.write("\t100%{color: orange;}\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Standar Syntax */\n");
      out.write("@keyframes rainbow{\n");
      out.write("  0%{color: orange;}\t\n");
      out.write("  10%{color: purple;}\t\n");
      out.write("\t20%{color: red;}\n");
      out.write("\t40%{color: yellow;}\n");
      out.write("\t60%{color: green;}\n");
      out.write("\t100%{color: blue;}\n");
      out.write("\t100%{color: orange;}\n");
      out.write("}\n");
      out.write("\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"FirstPage.jsp\">MyHOME</a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li class=\"active\"><a href=\"userApart.jsp\">Upload Apartment</a></li>\n");
      out.write("      <li>|</li>\n");
      out.write("      <li class=\"active\"><a href=\"MyOrders\">My Apartments</a></li>\n");
      out.write("      <li>|</li>\n");
      out.write("      <li class=\"active\"><a href=\"ListOforderz\">My Orders</a></li>\n");
      out.write("      <li>|</li>\n");
      out.write("      <li class=\"active\"><a href=\"Fback\">Feedback</a></li>\n");
      out.write("    </ul>\n");
      out.write("      <form class=\"navbar-form navbar-right\" method=\"post\" action=\"LogoutController\">\n");
      out.write("     <input class=\"btn btn-default\" type=\"submit\" value=\"LogOut\">\n");
      out.write("     </form>\n");
      out.write("      <form class=\"navbar-form navbar-right\" method=\"post\" action=\"SearchForAparts\" >\n");
      out.write("      <div class=\"input-group\">\n");
      out.write("        <input type=\"text\" class=\"form-control\" placeholder=\"Enter the state\" name=\"ste\" required>\n");
      out.write("        <div class=\"input-group-btn\">\n");
      out.write("          <button class=\"btn btn-default\" type=\"submit\">\n");
      out.write("            <i class=\"glyphicon glyphicon-search\"></i>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("    <div> \n");
      out.write("<div class=\"container\">\n");
      out.write("     <h4><b>");

		if (session != null) {
			if (session.getAttribute("Email") != null) {
				String name = (String) session.getAttribute("Email");
				out.print("Hello, " + name);
			} else {
				response.sendRedirect("LogIn.jsp");
			}
		}
	
      out.write("</b></h4>\n");
      out.write("    <h2 class=\"rainbow\">About Us</h2><br>\n");
      out.write("  <p><b>There are millions of homes out there. Let's find the one that's perfect for you.</b></p>\n");
      out.write("  <br>\n");
      out.write("  <b><p>At MyHOME, our mission is to find you a home and our method is trust and transparency.</p>\n");
      out.write("      <p>With tons of homes and apartments for rent in almost every state, city, and neighborhood across</p>\n");
      out.write("      <p>the nation, we are here to help you find your next home.</p>\n");
      out.write("  <br><br><br><br>\n");
      out.write("  <p>Here is how it works: first, we get to know you. You will answer a </p>\n");
      out.write("  <p>few simple questions and we will find the best matches ,just for you.</p>\n");
      out.write("  <p>Then, we mix and match your personalized results,making it easy to</p>\n");
      out.write("  <p>discover places with the perfect combination of price, location and</p> \n");
      out.write("  <p>amenities.From there, we help you figure out which listings are best</p>\n");
      out.write("  <p>to visit and eventually lease, showing you up-to-date pricing and</p>\n");
      out.write("  <p>availability, rent specials, and much more. After all, everyone deserves</p> \n");
      out.write("  <p>a home they love <3 .</p></b>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
