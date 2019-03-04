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

public final class displayAdstransport_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        \n");
      out.write("        <title>Advertisements view</title>\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("   \n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, true);
      out.write("  \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            \n");
      out.write("           <script>\n");
      out.write("                function myFunction() {\n");
      out.write("                 var input, filter, table, tr, td, i;\n");
      out.write("                     input = document.getElementById(\"myInput\");\n");
      out.write("                     filter = input.value.toUpperCase();\n");
      out.write("                     table = document.getElementById(\"myTable\");\n");
      out.write("                     tr = table.getElementsByTagName(\"tr\");\n");
      out.write("                for (i = 0; i < tr.length; i++) {\n");
      out.write("                     td = tr[i].getElementsByTagName(\"td\")[1];\n");
      out.write("                     if (td) {\n");
      out.write("                       if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {\n");
      out.write("                           tr[i].style.display = \"\";\n");
      out.write("                      } else {\n");
      out.write("                                    tr[i].style.display = \"none\";\n");
      out.write("                             }\n");
      out.write("                            }\n");
      out.write("                         }\n");
      out.write("                                        }\n");
      out.write("            </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"itemForm\">\n");
      out.write("                    \n");
      out.write("            \n");
      out.write("            \n");
      out.write("  <input class=\"w3-input w3-border w3-padding\" type=\"text\" placeholder=\"Search for names..\" id=\"myInput\" onkeyup=\"myFunction()\" style=\"width:35%;align-items: center; width: 80%;height:35%; margin: 0 auto; \">\n");
      out.write("            \n");
      out.write("                <table  id=\"myTable\" class=\"w3-table-all w3-hoverable\" style=\"table-layout: fixed;width: 80%;height:35%; margin: 0 auto; \" >\n");
      out.write("                    <tr class=\"w3-light-grey\">\n");
      out.write("\n");
      out.write("                        <th><b>Image</b></th>\n");
      out.write("\n");
      out.write("                        <th><b>Description</b></th>\n");
      out.write("                        <th><b>owner name /price</b></th>\n");
      out.write("                       \n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        uploadDAO myItemDAO=new  uploadDAO();

                        advertisementBean[] allItems = myItemDAO. getAllAdsTrans();
                        if(allItems !=null)
                        {
                            for(int i=0;i<allItems.length;i++)
                            {
                    
      out.write("\n");
      out.write("                                <tr id=\"myUL\" onClick=\"window.location='itemDetails.jsp?itemId=");
      out.print( allItems[i].getAdsID());
      out.write("'\">           ");
      out.write("                        \n");
      out.write("                                    <td >\n");
      out.write("                                         <div Style=\"height:200px; width:200px;  background-size: cover;\">\n");
      out.write("                                            <img src=\"adsImages1/");
      out.print( allItems[i].getPhoto());
      out.write("\" style=\"max-height:100%; max-width:100%;  \">\n");
      out.write("                                         </div>   \n");
      out.write("                                    </td> \n");
      out.write("                                    <td >\n");
      out.write("                                        <b><p style=\"font-size: 25px;\">");
      out.print( allItems[i].getAdsTitle());
      out.write("<input type=\"hidden\" value=\"");
      out.print( allItems[i].getAdsDesc());
      out.write("\" name=\"adsTitle\"/></p></b>\n");
      out.write("                                        \n");
      out.write("                                        </br></br><p>Category : Transportations </p>\n");
      out.write("                                    </td>\n");
      out.write("                                   \n");
      out.write("                                        <td>");
      out.print( allItems[i].getName());
      out.write("<input type=\"hidden\" value=\"");
      out.print( allItems[i].getName());
      out.write("\" name=\"adsName\"/></br>\n");
      out.write("                                             </br><p>Price / Rate :</p><p style=\"font-size:15px; font-weight: bold; color: red;\"> ");
      out.print( allItems[i].getPrice());
      out.write("<input type=\"hidden\" value=\"");
      out.print( allItems[i].getPrice());
      out.write("\" name=\"itemPrice\"/></p>\n");
      out.write("                                        </td>\n");
      out.write("                        \n");
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
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, true);
      out.write(" \n");
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
