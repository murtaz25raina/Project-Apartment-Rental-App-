package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <script>\n");
      out.write("  function validate()\n");
      out.write("            {\n");
      out.write("                var Pwd = document.form.password.value;\n");
      out.write("                var Cpwd = document.form.confirm.value;\n");
      out.write("                 if (Pwd != Cpwd)\n");
      out.write("                {\n");
      out.write("                    alert(\"Confirm Password should match with the Password\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("  $(function(){\n");
      out.write("    $('.button-checkbox').each(function(){\n");
      out.write("\t\tvar $widget = $(this),\n");
      out.write("\t\t\t$button = $widget.find('button'),\n");
      out.write("\t\t\t$checkbox = $widget.find('input:checkbox'),\n");
      out.write("\t\t\tcolor = $button.data('color'),\n");
      out.write("\t\t\tsettings = {\n");
      out.write("\t\t\t\t\ton: {\n");
      out.write("\t\t\t\t\t\ticon: 'glyphicon glyphicon-check'\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\toff: {\n");
      out.write("\t\t\t\t\t\ticon: 'glyphicon glyphicon-unchecked'\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t};\n");
      out.write("\n");
      out.write("\t\t$button.on('click', function () {\n");
      out.write("\t\t\t$checkbox.prop('checked', !$checkbox.is(':checked'));\n");
      out.write("\t\t\t$checkbox.triggerHandler('change');\n");
      out.write("\t\t\tupdateDisplay();\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$checkbox.on('change', function () {\n");
      out.write("\t\t\tupdateDisplay();\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\tfunction updateDisplay() {\n");
      out.write("\t\t\tvar isChecked = $checkbox.is(':checked');\n");
      out.write("\t\t\t// Set the button's state\n");
      out.write("\t\t\t$button.data('state', (isChecked) ? \"on\" : \"off\");\n");
      out.write("\n");
      out.write("\t\t\t// Set the button's icon\n");
      out.write("\t\t\t$button.find('.state-icon')\n");
      out.write("\t\t\t\t.removeClass()\n");
      out.write("\t\t\t\t.addClass('state-icon ' + settings[$button.data('state')].icon);\n");
      out.write("\n");
      out.write("\t\t\t// Update the button's color\n");
      out.write("\t\t\tif (isChecked) {\n");
      out.write("\t\t\t\t$button\n");
      out.write("\t\t\t\t\t.removeClass('btn-default')\n");
      out.write("\t\t\t\t\t.addClass('btn-' + color + ' active');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\telse\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\t$button\n");
      out.write("\t\t\t\t\t.removeClass('btn-' + color + ' active')\n");
      out.write("\t\t\t\t\t.addClass('btn-default');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction init() {\n");
      out.write("\t\t\tupdateDisplay();\n");
      out.write("\t\t\t// Inject the icon if applicable\n");
      out.write("\t\t\tif ($button.find('.state-icon').length == 0) {\n");
      out.write("\t\t\t\t$button.prepend('<i class=\"state-icon ' + settings[$button.data('state')].icon + '\"></i> ');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tinit();\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("  </script>\n");
      out.write("  <style>\n");
      out.write("  .colorgraph {\n");
      out.write("  height: 5px;\n");
      out.write("  border-top: 0;\n");
      out.write("  background: #c4e17f;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  background-image: -webkit-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);\n");
      out.write("  background-image: -moz-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);\n");
      out.write("  background-image: -o-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);\n");
      out.write("  background-image: linear-gradient(to right, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);\n");
      out.write("}\n");
      out.write(" </style>\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("</head>\n");
      out.write("<body><center>\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("<div class=\"row\" style=\"margin-top:20px\">\n");
      out.write("    <div class=\"col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3\">\n");
      out.write("\t\t<form role=\"form\" name=\"form\" method=\"post\" action=\"InfoAdd\" onsubmit=\"return validate()\">\n");
      out.write("\t\t\t<fieldset>\n");
      out.write("\t\t\t\t<h2>Please Sign In</h2>\n");
      out.write("\t\t\t\t<hr class=\"colorgraph\">\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"Name\" class=\"form-control input-lg\" placeholder=\"Enter Your Name\" minlength=4 required>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("                    <input type=\"email\" name=\"email\" class=\"form-control input-lg\" placeholder=\"Email Address\" required>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("                    <input type=\"Password\" name=\"password\" class=\"form-control input-lg\" placeholder=\"Password\" minlength=6 required>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("                    <input type=\"password\" name=\"confirm\" class=\"form-control input-lg\" placeholder=\"Confirm Password\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("                    <input type=\"tel\" name=\"phone\" class=\"form-control input-lg\" placeholder=\"Phone Number\" minlength=10 maxlength=10 required>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" name=\"address\" class=\"form-control input-lg\" placeholder=\"Address\" required>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<hr class=\"colorgraph\">\n");
      out.write("\t\t\t\t<br>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-6 col-sm-6 col-md-6\">\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-lg btn-success btn-block\" value=\"Register\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-6 col-sm-6 col-md-6\">\n");
      out.write("\t\t\t\t\t\t<a href=\"LogIn.jsp\" class=\"btn btn-lg btn-primary btn-block\">Log In</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</fieldset>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div></center>\n");
      out.write("</body></html>");
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
