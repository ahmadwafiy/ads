package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import OKANE.DatabaseOKANE;
import OKANE.advertisementBean;
import OKANE.uploadDAO;

public final class AdsRecord_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Advertisement Record</title>\n");
      out.write("       <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, true);
      out.write(" \n");
      out.write("        \n");
      out.write("         ");
      out.write("\n");
      out.write("        \n");
      out.write("        <table border=\"0\" class=\"w3-table-all\" id=\"table\">\n");
      out.write("            <tr class=\"w3-red\">\n");
      out.write("                <th><b>Advertisement ID</b></th>\n");
      out.write("                <th><b>Category</b></th>\n");
      out.write("                <th><b>Advertisement Title</b></th>\n");
      out.write("                <th><b>Advertisement Description</b></th>\n");
      out.write("                <th><b>Name </b></th>\n");
      out.write("\t\t<th><b>Pricing</b></th>\n");
      out.write("\t\t<th><b>Email</b></th>\n");
      out.write("                <th><b>Phone No</b></th>\n");
      out.write("                <th><b>Option</b></th>\t\t\t\t\n");
      out.write("            </tr>\n");
      out.write("            ");

                uploadDAO myadsDAO = new uploadDAO();
                                                       //to be add later in DAO
               advertisementBean [] allAds = myadsDAO.getAllAdsInfo();
                
                if( allAds != null)
                {
                    for(int x = 0;x <  allAds.length;x++)
                    {              
             
      out.write("       \n");
      out.write("                    <tr  class=\"w3-hover-text-blue\">\n");
      out.write("                        <td>");
      out.print(  allAds[x].getAdsID());
      out.write("</td>");

                       
                            
                         if(allAds[x].getCategory() == 1)
                         
      out.write("<td>Items</td> ");

                         if(allAds[x].getCategory() == 2)
                         
      out.write("<td>Transports</td>");

                         if(allAds[x].getCategory() == 3)
                         
      out.write("<td>Daily Services</td>\n");
      out.write("                       \n");
      out.write("                      ");
System.out.println("category test :"+allAds[x].getCategory());
      out.write("\n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                        <td>");
      out.print(  allAds[x].getAdsTitle());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(  allAds[x].getAdsDesc());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(  allAds[x].getName());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(  allAds[x].getPrice());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(  allAds[x].getEmail());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(  allAds[x].getPhoneno());
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                                     \n");
      out.write("                         \n");
      out.write("                       <td>\n");
      out.write("                            <input type=\"button\" value=\"Update\" onClick=\"window.location='adsUpdateForm.jsp?adsID=");
      out.print(allAds[x].getAdsID());
      out.write("'\"/>\n");
      out.write("                            <input type=\"button\" value=\"Delete\" onClick=\"window.location='DeleteRecordAds.jsp?adsID=");
      out.print(allAds[x].getAdsID());
      out.write("'\"/>\n");
      out.write("                       </td>  \n");
      out.write("                         \n");
      out.write("                    </tr> \n");
      out.write("                        \n");
      out.write("                ");
             
                    }
                        
                }
                    DatabaseOKANE.closeConnection();
                 
      out.write("   \n");
      out.write("           </table></br></br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, true);
      out.write(" \n");
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
