package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("        <title>Home page Okane</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, true);
      out.write("   \n");
      out.write("    \n");
      out.write("          \n");
      out.write("          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "mainbody.jsp", out, true);
      out.write("\n");
      out.write("            \n");
      out.write("        \n");
      out.write("          <div id=\"bottomSpacer\" style=\" margin-top: 3% ; \">\n");
      out.write("             \n");
      out.write("              \n");
      out.write("              <div style=\"position:absolute;left:200px;width:250px;height:280px;background-color:#F5F5F5;  margin-left:20px;\">\n");
      out.write("\t\t\t\t<img src=\"Okane.jpg\" style=\"width:250px;height:80px;\">\n");
      out.write("                              \n");
      out.write("\t\t\t\t<br/><br/><a style=\"position:absolute;left:20px;color:#48D1CC;font-size:20px;font-weight:100;\">&nbsp;&nbsp;&nbsp;Free For All</a>\n");
      out.write("\t\t\t\t<br/><p>Its our goals to help Students of University Malaysia Terengganu and nearby resident to embrace the culture of interprenuership</p>\n");
      out.write("\t\t\t\t<br/>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div style=\"position:absolute;left:500px;width:250px;height:280px;background-color:#F5F5F5; margin-left:20px;\">\n");
      out.write("\t\t\t\t<img src=\"sell.jpg\" style=\"width:250px;height:80px;\">\n");
      out.write("\t\t\t\t<br/><br/><a style=\"position:absolute;left:20px;color:#48D1CC;font-size:20px;font-weight:100;\">Sell Anything</a>\n");
      out.write("\t\t\t\t<br/><p>Snap, upload and start earning now. Always feel free to use our service to make money.</p>\n");
      out.write("\t\t\t\t<br/>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<div style=\"position:absolute;left:800px;width:250px;height:280px;background-color:#F5F5F5; margin-left:20px;\">\n");
      out.write("\t\t\t\t<br/><a style=\"position:absolute;left:20px;color:#48D1CC;font-size:24px;font-weight:100;\">Why Choose us?</a>\n");
      out.write("\t\t\t\t<br/><br/><br/>\n");
      out.write("\t\t\t\t<div style=\"position:absolute;top:65px;\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;<img src=\"tick.png\" style=\"width:20px;height:20px;\"><a style=\"color:#7D7D7D;\">&nbsp;We have our own rules that &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t&nbsp;&nbsp;we must follow.</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div style=\"position:absolute;top:125px;\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;<img src=\"tick.png\" style=\"width:20px;height:20px;\"><a style=\"color:#7D7D7D;\">&nbsp;We have not failed in our &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;project so far.</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div style=\"position:absolute;top:185px;\">\n");
      out.write("\t\t\t\t&nbsp;&nbsp;<img src=\"tick.png\" style=\"width:20px;height:20px;\"><a style=\"color:#7D7D7D;\">&nbsp;We are the most trusted  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; company in this country.</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div style=\"position:absolute;left:1100px;width:250px;height:280px;background-color:#00C78C;text-align:center; padding-right: 13px;padding-left: 13px; margin-left:20px;\">\n");
      out.write("\t\t\t\t<br/><br/><em style=\"font-family: Times New Roman, Times, serif;position:absolute;left:20px;color:#F5F5F5;font-size:28px;font-weight:200;\">&nbsp;&nbsp;&nbsp;&nbsp;Who we are?</em>\n");
      out.write("\t\t\t\t<br/>\n");
      out.write("\t\t\t\t<br/><br/>\n");
      out.write("\t\t\t\t<br/>\n");
      out.write("\t\t\t\t<p style=\"color:#EAEAEA;\">WE ARE THE TEAM WHO LOVES TO SEE OUR CLIENT'S HAPPINESS</p>\n");
      out.write("\t\t\t\t<br/><br/>\n");
      out.write("\t\t\t\t<em style=\"font-family: Times New Roman, Times, serif;color:#F5F5F5;font-size:20px;font-weight:200;\">-Read More-</em>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              <footer style=\"position:relative;top:800px;margin:0px;width:100%;height:35px;background-color:#404040;text-align:left;vertical-align: middle;font-size: 13px;display: flex;align-items: center;color:#D3D3D3;\">\n");
      out.write("\t\t\t&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\n");
      out.write("\t\t\t&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\n");
      out.write("\t\t\tCopyright &copy;<p> 2017  ahmdwafy</p>\n");
      out.write("\t\t</footer>\n");
      out.write("          </div>\n");
      out.write("     \n");
      out.write("\t\t\n");
      out.write("     </body>\n");
      out.write("</html>     ");
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
