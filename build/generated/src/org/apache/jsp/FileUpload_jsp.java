package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FileUpload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("           <style>\n");
      out.write("body, html {\n");
      out.write("  height: 100%;\n");
      out.write("  margin: 0;\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bg-image {\n");
      out.write("  /* The image used */\n");
      out.write("  background-image: url(\"SourceFiles/Backimage/onee.jpg\");\n");
      out.write("  \n");
      out.write("  /* Add the blur effect */\n");
      out.write("  filter: blur(20px);\n");
      out.write("  filter: blur(8px);\n");
      out.write("  \n");
      out.write("  /* Full height */\n");
      out.write("  height: 100%; \n");
      out.write("  \n");
      out.write("  /* Center and scale the image nicely */\n");
      out.write("  background-position: center;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-size: cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Position text in the middle of the page/image */\n");
      out.write(".bg-text {\n");
      out.write("  background-color: rgb(0,0,0); /* Fallback color */\n");
      out.write("  background-color: rgba(0,0,0, 0.4); /* Black w/opacity/see-through */\n");
      out.write("  color: white;\n");
      out.write("  font-weight: bold;\n");
      out.write("  border: 3px solid #f1f1f1;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 50%;\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("  z-index: 2;\n");
      out.write("  width: 80%;\n");
      out.write("  padding: 20px;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"bg-image\"><h1>Ongoing Reasearches</h1></div>\n");
      out.write("        <div  class=\"bg-text\">\n");
      out.write("    <p>Upload your problem here</p>\n");
      out.write("    <form method=\"post\" action=\"UploadServlet\" enctype=\"multipart/form-data\">\n");
      out.write("        <Table a>\n");
      out.write("            <tr>\n");
      out.write("                <td align=\"left\">University</td>\n");
      out.write("                <td  align=\"left\" ><input type=\"text\" name=\"University\" size=\"50\"/></td>\n");
      out.write("            </tr>\n");
      out.write("                        \n");
      out.write("             <tr>  \n");
      out.write("                 <td align=\"left\">Student ID</td>\n");
      out.write("                <td  align=\"left\"><input type=\"text\" name=\"StudentID\" size=\"50\"/></td>\n");
      out.write("             </tr> \n");
      out.write("             \n");
      out.write("             <tr>\n");
      out.write("                <td align=\"left\">Year</td>\n");
      out.write("                <td  align=\"left\"><input type=\"text\" name=\"Year\" size=\"50\"></td>\n");
      out.write("             </tr> \n");
      out.write("             \n");
      out.write("              <tr> \n");
      out.write("                <td align=\"left\">Select your file</td>\n");
      out.write("                <td  align=\"left\"><input type=\"file\" name=\"uploads\"></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                  <td colspan=\"2\">\n");
      out.write("                      \n");
      out.write("                  </td><td> <input type=\"submit\"> </td> \n");
      out.write("                 \n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("        </Table>\n");
      out.write("    </form>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
