package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class uploadFRM_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write(" <head>\n");
      out.write("\t\t       <meta charset=\"UTF-8\">\n");
      out.write("                       <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("                       <title>Post Advertisements</title>\n");
      out.write("\t\t       \n");
      out.write("                        <style>\t\n");
      out.write("                            \n");
      out.write("                            body{\n");
      out.write("                                margin: 0 auto;\n");
      out.write("                                background-image: url(pop.jpg);\n");
      out.write("                                background-repeat: no-repeat;\n");
      out.write("                                background-size: 100%;\n");
      out.write("                            }\n");
      out.write("                            .container {\n");
      out.write("                                padding: 50px;\n");
      out.write("                               \n");
      out.write("                                width:1000px;\n");
      out.write("                                heigth: 800px;\n");
      out.write("    \n");
      out.write("                                border-radius: 4px;\n");
      out.write("                                margin: 0 auto;\n");
      out.write("                                margin-top: 90px;\n");
      out.write("                                margin-left: 100px;                              \n");
      out.write("\n");
      out.write("                            }\n");
      out.write("                                label { display: inline-block; \n");
      out.write("\t\t\t\t        width: 140px; \n");
      out.write("\t\t\t\t\ttext-align: left; \n");
      out.write("\t\t\t\t        padding-top: 10px;\n");
      out.write("                                        color:white;\n");
      out.write("                                        font-size:15px;\n");
      out.write("                               input{\n");
      out.write("                                    \n");
      out.write("                                   height: 50px;\n");
      out.write("                                   \n");
      out.write("                                }  \n");
      out.write("\t\t\t</style>\t\n");
      out.write("       <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("       <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Lobster\">\n");
      out.write("                </head>\t \n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, true);
      out.write("   \n");
      out.write("    <h1 div class=\"w3-container w3-white\">Please Complete This Details</h1>\n");
      out.write(" <div class=\"container\" >\n");
      out.write("    <form action=\"notifyUpload.jsp\" id=\"uploadFrm\" method=\"post\" style=\"justify-content:center;font-weight:bold;width:800px;\"  >\n");
      out.write("                                    \n");
      out.write("                                   \n");
      out.write("\n");
      out.write(" <fieldset   style=\"width:800px; align-content:center;\">\n");
      out.write("\t\t\t<legend style=\"color:#ffcc00; font-size: 20px;\">Advertisement Details</legend>\n");
      out.write("\t\t   \t  \t\t    \n");
      out.write("\t\t\t<label for=\"category\" >Category</label>\n");
      out.write("                            <select class=\"w3-input w3-border w3-round,w3-input w3-hover-green\" id=\"category\" name=\"category\">\n");
      out.write("\t\t\t      <option value=\"1\">Item</option>\n");
      out.write("\t\t\t      <option value=\"2\">Transports</option>\n");
      out.write("\t\t\t      <option value=\"3\">Daily Service</option>\n");
      out.write("                            </select>\n");
      out.write("\t\t\t<br/>                           \t\t\t\t\t\t\t\t\n");
      out.write("                        <label for=\"photo\">Photo</label>\n");
      out.write("                        <input class=\"w3-input w3-border w3-round,w3-input w3-hover-red\" type=\"file\" name=\"photo\" id=\"photo\"   size=\"50\" placeholder=\"upload photo\" required /><br>\n");
      out.write("                        \n");
      out.write("                         <label for=\"adstitle\">Ads Title</label>\n");
      out.write("                         <input class=\"w3-input w3-border w3-round,w3-input w3-hover-aqua\" type=\"text\" placeholder=\"Ads Title\" size=\"50\"  name=\"adsTitle\" required ><br>\n");
      out.write("                      \n");
      out.write("                         <label for=\"description\">Description</label><br>\n");
      out.write("                         <br>\n");
      out.write("                         <textarea class=\"w3-input w3-border w3-round,w3-input w3-hover-yellow\" rows=\"4\" cols=\"50\" name=\"desc\"  style=\"width: 167px;\" >\n");
      out.write("                             \n");
      out.write("                         </textarea> <br>\n");
      out.write("                         \n");
      out.write("                         <label for=\"name\">Name</label>\n");
      out.write("                         <input class=\"w3-input w3-border w3-round,w3-input w3-hover-green\" type=\"text\" placeholder=\"Enter Your Name\" name=\"name\" required><br>\n");
      out.write("                         \n");
      out.write("                         <label for=\"email\">Contact Email</label>\n");
      out.write("                         <input  class=\"w3-input w3-border w3-round,w3-input w3-hover-red\" type=\"email\" placeholder=\"Enter Your Email\" name=\"email\" required><br>\n");
      out.write("                         \n");
      out.write("                         <label for=\"phoneno\">Contact No.</label>\n");
      out.write("                         <input class=\"w3-input w3-border w3-round,w3-input w3-hover-aqua\" type=\"text\" placeholder=\"Enter Your Phone Number\" name=\"phoneno\" required><br>\n");
      out.write("                         \n");
      out.write("                         <label for=\"price\">Charge Rate / price</label>\n");
      out.write("                         <input class=\"w3-input w3-border w3-round,w3-input w3-hover-yellow\" type=\"text\" placeholder=\"Enter rate of charge\" name=\"price\" required><br>\n");
      out.write("\n");
      out.write("                         <br><input class=\"w3-button w3-white w3-border w3-border-red w3-round-large\" type=\"submit\" value=\"Proceed\">\n");
      out.write(" \n");
      out.write(" </fieldset>\n");
      out.write("                                   \n");
      out.write("</form>\n");
      out.write("     </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("     <footer style=\"position:relative;top:800px;margin:0px;width:100%;height:35px;background-color:#404040;text-align:left;vertical-align: middle;font-size: 13px;display: flex;align-items: center;color:#D3D3D3;\">\n");
      out.write("\t\t\t <div id=\"content_footer\"></div>\n");
      out.write("    <div id=\"footer\">\n");
      out.write("      <p><a href=\"homepage2.jsp\">Home</a> | <a href=\"#\">Items</a> | <a href=\"#\">Daily Services</a> | <a href=\"#\">Need a Ride?</a> | <a href=\"#\">Sign Up</a> | <a href=\"\">Contact Us</a></p>\n");
      out.write("      <p>Copyright &copy; OKANE(ahmdwafy)</p>\n");
      out.write("    </div>\n");
      out.write("\t\t</footer>\n");
      out.write("    \n");
      out.write("</body>\n");
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
