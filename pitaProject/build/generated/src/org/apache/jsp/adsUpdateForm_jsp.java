package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import OKANE.DatabaseOKANE;
import OKANE.advertisementBean;
import OKANE.uploadDAO;
import java.util.StringTokenizer;

public final class adsUpdateForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Update Record</title>\n");
      out.write("        <style>                         \n");
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
      out.write("                                }      \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, true);
      out.write(" \n");
      out.write("        \n");
      out.write("          <h1 style=\"  color: white;\">Please Complete This Details</h1>\n");
      out.write(" \n");
      out.write("    <form action=\"adsUpdate.jsp\" id=\"updateFrm\" method=\"post\" style=\"font-weight:bold; width:800px; \" >                               \n");
      out.write("                   ");
                                                       //DaRi for
                         int lastAdsID = Integer.parseInt(request.getParameter("adsID"));
                    
                          advertisementBean myAds = new advertisementBean();
                    
                             uploadDAO myUploadDAO = new uploadDAO();
                    
                             myAds  = myUploadDAO.getSpecificAdsInfo(lastAdsID);
            
                    
      out.write("                  \n");
      out.write("\n");
      out.write(" <fieldset   style=\"width:800px; align-content: center;\">\n");
      out.write("\t\t\t<legend style=\"color:#ffcc00; font-size: 20px;\">Advertisement Details</legend>\n");
      out.write("\t\t   \t\n");
      out.write("                        <label for=\"adsID\" >Advertisement ID</label> \n");
      out.write("                        <input type=\"text\" id=\"adsID\" size=\"50\"  name=\"ads_ID\" readonly=\"readonly\" value=\"");
      out.print(myAds.getAdsID());
      out.write("\" ><br>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                       ");

                            int lastCategory = myAds.getCategory();
                             System.out.println("last punya "+lastCategory);
                       
      out.write("\n");
      out.write("     \n");
      out.write("\t\t\t<label for=\"category\" >Category</label>\n");
      out.write("                            <select id=\"category\" name=\"category\"  >\n");
      out.write("                                 ");

                                    if(lastCategory == 1)
                                { 
      out.write("\n");
      out.write("                                 <option value=\"1\" select=\"selected\">Item</option>\n");
      out.write("                                  ");
  
                                }
                            else     
                                    if(lastCategory == 2)
                                {
                                  
      out.write(" \n");
      out.write("                                  <option value=\"2\" select=\"selected\">Transports</option>\n");
      out.write("                                  ");
 }
                             else
                                             if(lastCategory == 3)
                                    { 
      out.write("\n");
      out.write("                                     <option value=\"3\" select=\"selected\">Daily Service</option> \n");
      out.write("                              ");
    } 
      out.write("\n");
      out.write("                                       \n");
      out.write("\t\t\t      \t      \n");
      out.write("                            </select>\n");
      out.write("\t\t\t<br/>                           \t\t\t\t\t\t\t\t\n");
      out.write("                        <label for=\"image\">Image</label>\n");
      out.write("                        <input type=\"file\" name=\"photo\" ><br>\n");
      out.write("                        \n");
      out.write("                         <label for=\"adstitle\">Ads Title</label>\n");
      out.write("                         <input type=\"text\"  size=\"50\"  name=\"adsTitle\" value=\"");
      out.print(myAds.getAdsTitle());
      out.write("\" required ><br>\n");
      out.write("                      \n");
      out.write("                         <label for=\"description\">Description</label><br>\n");
      out.write("                         <br>\n");
      out.write("                         <textarea rows=\"4\" cols=\"50\" name=\"desc\" value=\"");
      out.print(myAds.getAdsDesc());
      out.write("\">\n");
      out.write("                             \n");
      out.write("                         </textarea> <br>\n");
      out.write("                         \n");
      out.write("                         <label for=\"name\">Name</label>\n");
      out.write("                         <input type=\"text\" value=\"");
      out.print(myAds.getName() );
      out.write("\" name=\"name\" required><br>\n");
      out.write("                         \n");
      out.write("                         <label for=\"email\">Contact Email</label>\n");
      out.write("                         <input type=\"email\" value=\"");
      out.print(myAds.getEmail());
      out.write("\" name=\"email\" required><br>\n");
      out.write("                         \n");
      out.write("                         <label for=\"phoneno\">Contact No.</label>\n");
      out.write("                         <input type=\"text\" value=\"");
      out.print(myAds.getPhoneno() );
      out.write("\" name=\"phoneno\" required><br>\n");
      out.write("                         \n");
      out.write("                         <label for=\"price\">Charge Rate / price</label>\n");
      out.write("                         <input type=\"text\" value=\"");
      out.print(myAds.getPrice() );
      out.write("\" name=\"price\" required><br>\n");
      out.write("\n");
      out.write("                         <br><p><input type=\"submit\" value=\"Submit\">&nbsp;&nbsp;<input type=\"reset\" value=\"reset\"/></p>\n");
      out.write(" \n");
      out.write(" </fieldset>\n");
      out.write("                                   \n");
      out.write("</form>\n");
      out.write("     \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("           ");
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
