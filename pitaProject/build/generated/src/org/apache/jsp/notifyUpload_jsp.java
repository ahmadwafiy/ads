package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import OKANE.DatabaseOKANE;
import OKANE.advertisementBean;
import OKANE.uploadDAO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class notifyUpload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Notify Saved</title>\n");
      out.write("         <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("           <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("         <style>\n");
      out.write("            \n");
      out.write("             h1{\n");
      out.write("                 font-weight: bold;\n");
      out.write("                 color: black;\n");
      out.write("                 text-align:justify;\n");
      out.write("                text-justify: auto;\n");
      out.write("             }   \n");
      out.write("                  #displayBox{\n");
      out.write("                 \n");
      out.write("                      font-family:arial,sans-serif,white;\n");
      out.write("                 font-weight:bold;\n");
      out.write("                 background-color: white;\n");
      out.write("                 align-content: center;\n");
      out.write("              \n");
      out.write("                 width: 60%;\n");
      out.write("                 height: 80%;\n");
      out.write("                 \n");
      out.write("                  margin-left: 300px;\n");
      out.write("                 margin-top: 50px;\n");
      out.write("                 padding-left:30px; \n");
      out.write("                \n");
      out.write("                  background-size: cover;\n");
      out.write("                  \n");
      out.write("                  position: absolute;\n");
      out.write("                  top: 50%;\n");
      out.write("                  left: 50%;\n");
      out.write("                  top: 50%;\n");
      out.write("                  left: 50%;\n");
      out.write("                  margin: -100px 0 0 -150px;\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("             }\n");
      out.write("             \n");
      out.write("           \n");
      out.write("             p, h1{\n");
      out.write("                 \n");
      out.write("                 color: white;\n");
      out.write("             }\n");
      out.write("             \n");
      out.write("      \n");
      out.write("           \n");
      out.write("         </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, true);
      out.write("   \n");
      out.write("       \n");
      out.write("        <div  style=\" align-content: center; margin:0 auto;\">\n");
      out.write("       <h1  class=\"w3-text-yellow\" style=\"text-shadow:1px 1px 0 #444\">Preview of advertisements</h1>\n");
      out.write("      ");

                int result = 0;
          
                //get info (parse) from form 
                String Name = request.getParameter("name");
                    System.out.println("Name  = "+Name);
                    
                  
                File adsPhoto = new File("C:/Users/User/Desktop/pitaProject/pitaProject/adsImages/"+request.getParameter("photo"));   
                    System.out.println("adsPhoto = "+adsPhoto);
                
                 String email = request.getParameter("email");
                    System.out.println("email  = "+email);
                        
                 String phoneNumber = request.getParameter("phoneno");      
                 System.out.println("phone number = "+ phoneNumber);
       
                 
                 String desc = request.getParameter("desc");
                  System.out.println("Ads decs = "+desc);
                  
                 int category = Integer.parseInt(request.getParameter("category"));
                 System.out.println("ads category : "+ category);     
                 
                 String price = request.getParameter("price");
                 System.out.println("price : "+ price);         
                  
                  
                 String adsTitle = request.getParameter("adsTitle");
                  System.out.println("Ads Title = "+adsTitle);
                  
                  
                  //Section for storing parameters into SQL
                  //images skkiped
                  //assign information into beans
                   advertisementBean adsCreate =new advertisementBean();
                    adsCreate.setCategory(category);
                    adsCreate.setPhoto(adsPhoto);
                    adsCreate.setAdsTitle(adsTitle);
                    adsCreate.setAdsDesc(desc);
                    adsCreate.setName(Name);
                    adsCreate.setEmail(email);
                    adsCreate.setPhoneno(phoneNumber);
                    adsCreate.setPrice(price);
                  
                   //adsCreate.setAd_images(ad_images);
                   
                       //STEP 3 - Call bookingDAO object to store booking information into booking's table
                        //Instatiate bookingDAO objec
                   uploadDAO myUploadDAO = new uploadDAO(); 
                  
                   result = myUploadDAO.addAds(adsCreate);

                   
                   if(result > 0)
            {
                System.out.println("Record successfully added into advertisement Table...!");
                
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("        <div class=\"container3\">\n");
      out.write("                 \n");
      out.write("              <div class=\"notifyBox1\">  \n");
      out.write("                ");

                    adsCreate = null;
                    String adscategory = "";
                    adsCreate = myUploadDAO.getLatestAdsInfo();
                    
                    
                    //print dlm details
                    //display data
                    out.println("<p><b>Advertisements ID : "+ adsCreate.getAdsID()+"</b></p>");
                    out.println("<p><b>Advetisements Title :"+adsCreate.getAdsTitle()+"</b></p>");
                    out.println("<p><b>Advertiser Name : "+adsCreate.getName()+"</b></p>");
                    out.println("<p><b>Contact Number : "+adsCreate.getPhoneno()+"</b></p>");
                    out.println("<p><b>Ads Email : "+adsCreate.getEmail()+"</b></p>");
                    
                   
                    
                    
                   
          
                    
                    if (adsCreate.getCategory() == 1)
                         adscategory = "Items";
                    if (adsCreate.getCategory() == 2)
                        adscategory = "Daily Services";
                    if (adsCreate.getCategory() == 3)      
                        adscategory = "Transportation";
                    
                    
                   
                    
                    out.println("<b><p>Advertisements Category :" + adscategory +"</b></p>");
                    out.println("<p><b>Advertisements Description : </b></p>");
                    out.println("<p><b>"+adsCreate.getAdsDesc()+"</b></p>");
                    out.println("<p><b>Rate of charge  : "+adsCreate.getPrice()+"</b></p>");
                


                 
      out.write(" \n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"notifyBox2\">   \n");
      out.write("                  ");
  out.println("<img width=400 height=300 src=adsImages1/out.jpeg >");
                   
                  
            }
             else
            {
            
      out.write("\n");
      out.write("                <p>Advertisement  Failed to be save</p>\n");
      out.write("            ");

                
               
            }
            
      out.write("  \n");
      out.write("           <h3><strong>\n");
      out.write("                You have successfully added item.\n");
      out.write("                </strong>\n");
      out.write("           </h3>\n");
      out.write("       \n");
      out.write("             <input type=\"button\" value=\"Record List\" onClick=\"window.location='AdsRecord.jsp'\"/>\n");
      out.write("                \n");
      out.write("                 </div>\n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("               <footer style=\"position:relative;top:800px;margin:0px;width:100%;height:35px;background-color:#404040;text-align:left;vertical-align: middle;font-size: 13px;display: flex;align-items: center;color:#D3D3D3;\">\n");
      out.write("\t\t\t <div id=\"content_footer\"></div>\n");
      out.write("    <div id=\"footer\">\n");
      out.write("      <p><a href=\"homepage2.jsp\">Home</a> | <a href=\"#\">Items</a> | <a href=\"#\">Daily Services</a> | <a href=\"#\">Need a Ride?</a> | <a href=\"#\">Sign Up</a> | <a href=\"\">Contact Us</a></p>\n");
      out.write("      <p>Copyright &copy; OKANE(ahmdwafy)</p>\n");
      out.write("    </div>\n");
      out.write("\t\t</footer>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
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
