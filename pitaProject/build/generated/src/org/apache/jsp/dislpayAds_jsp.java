package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import OKANE.DatabaseOKANE;
import OKANE.advertisementBean;
import OKANE.uploadDAO;
import OKANE.signupBean;
import OKANE.signupDAO;

public final class dislpayAds_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Advertisements view</title>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"itemForm\">\n");
      out.write("                <table style=\"table-layout: fixed;width: 80%;height:40%; margin: 0 auto; \" border=\"1\" >\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <th><b>Item Name</b></th>\n");
      out.write("\n");
      out.write("                        <th><b>Item Price</b></th>\n");
      out.write("                        <th><b>Item Image</b></th>\n");
      out.write("                       \n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        uploadDAO myItemDAO=new  uploadDAO();

                        advertisementBean[] allItems = myItemDAO. getAllAdsItem();
                        if(allItems !=null)
                        {
                            for(int i=0;i<allItems.length;i++)
                            {
                    
      out.write("\n");
      out.write("                                <tr>           ");
      out.write("                        \n");
      out.write("                                    <td onClick=\"window.location='itemDetails.jsp?itemId=");
      out.print( allItems[i].getAdsID());
      out.write("'\">");
      out.print( allItems[i].getName());
      out.write("<input type=\"hidden\" value=\"");
      out.print( allItems[i].getName());
      out.write("\" name=\"adsName\"/></td>\n");
      out.write("                                    <td>");
      out.print( allItems[i].getPrice());
      out.write("<input type=\"hidden\" value=\"");
      out.print( allItems[i].getPrice());
      out.write("\" name=\"itemPrice\"/></td>\n");
      out.write("                                    <td><img src=\"itemsImg/");
      out.print( allItems[i].getPhoto());
      out.write("\"style=\"max-height:200px; max-width:100%\"></td> \n");
      out.write("          \n");
      out.write("                                   \n");
      out.write("                                   \n");
      out.write("                                </tr>\n");
      out.write("                    ");

                            }
                       }
                    
      out.write("\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("                    ");

                    DatabaseOKANE.closeConnection();
                    
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
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
