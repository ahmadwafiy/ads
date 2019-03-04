<%-- 
    Document   : notifyUpload
    Created on : 10-Dec-2017, 02:47:08
    Author     : ahmdwafy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="OKANE.DatabaseOKANE"%>
<%@page import="OKANE.advertisementBean"%>
<%@page import="OKANE.uploadDAO"%>

<%@page import="java.io.File" %>
<%@page import="java.io.FileInputStream" %>
<%@page import="java.io.FileOutputStream" %>
<%@page import="java.awt.Image"%>
<%@page import="java.awt.Toolkit"%>
<%@page import="java.io.ByteArrayOutputStream"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.nio.file.Path"%>
<%@page import="java.nio.file.Paths"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Notify Saved</title>
         <link href="style.css" rel="stylesheet" type="text/css"/>
           <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
         <style>
            
             h1{
                 font-weight: bold;
                 color: black;
                 text-align:justify;
                text-justify: auto;
             }   
                  #displayBox{
                 
                      font-family:arial,sans-serif,white;
                 font-weight:bold;
                 background-color: white;
                 align-content: center;
              
                 width: 60%;
                 height: 80%;
                 
                  margin-left: 300px;
                 margin-top: 50px;
                 padding-left:30px; 
                
                  background-size: cover;
                  
                  position: absolute;
                  top: 50%;
                  left: 50%;
                  top: 50%;
                  left: 50%;
                  margin: -100px 0 0 -150px;
                  
                  
             }
             
           
             p, h1{
                 
                 color: white;
             }
             
      
           
         </style>
       <%   
            session.getAttribute("username");
            String username = (String)session.getAttribute("username");
            
            int userId = (int)session.getAttribute("userId");
          
        %>    
        
    </head>
    <body>
        
        <jsp:include page="header.jsp" flush="true"/>   
       
        <div  style=" align-content: center; margin:0 auto;">
       <h1  class="w3-text-yellow" style="text-shadow:1px 1px 0 #444">Preview of advertisements</h1>
      <%
                int result = 0;
          
                //get info (parse) from form 
                String Name = request.getParameter("name");
                    System.out.println("Name  = "+Name);
                    
                  
                File adsPhoto = new File("C:/Users/User/Desktop/pitaProject/pitaProject/web/adsImages1/"+request.getParameter("photo"));   
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
                    adsCreate.setUserID(userId);
                   //adsCreate.setAd_images(ad_images);
                   
                       //STEP 3 - Call bookingDAO object to store booking information into booking's table
                        //Instatiate bookingDAO objec
                   uploadDAO myUploadDAO = new uploadDAO(); 
                  
                   result = myUploadDAO.addAds(adsCreate);

                   
                   if(result > 0)
            {
                System.out.println("Record successfully added into advertisement Table...!");
                %>
                
                
        <div class="container3">
                
              <div class="notifyBox1">  
                <%
                    adsCreate = null;
                    String adscategory = "";
                    adsCreate = myUploadDAO.getLatestAdsInfo();
                    
                    
                    //print dlm details
                    //display data
                    out.println("<p>Details of your advertisement:</p>");
                    out.println("<p><b>Advertisements ID : "+ adsCreate.getAdsID()+"</b></p>");
                    out.println("<p><b>Advetisements Title :"+adsCreate.getAdsTitle()+"</b></p>");
                    out.println("<p><b>Advertiser Name : "+adsCreate.getName()+"</b></p>");
                    out.println("<p><b>Contact Number : "+adsCreate.getPhoneno()+"</b></p>");
                    out.println("<p><b>Contact Email : "+adsCreate.getEmail()+"</b></p>");
                    
                   
        
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
                


                 %> 
                 </div>
                 <div class="notifyBox2">   
                     
                    <%-- <c:set var ="ctx" value="${pageContext.request.contexPath}"/> --%>
                     
                  <%  out.println("<img width=400 height=300 src='adsImages1/"+adsCreate.getAdsID()+".jpeg'>");
                   
                  
            }
             else
            {
            %>
                <p>Advertisement  Failed to be save</p>
            <%
                
               
            }
            %>  
           <h3><strong>
                You have successfully added item.
                </strong>
           </h3>
       
             <input type="button" value="Record List" onClick="window.location='AdsRecord.jsp'"/>
                
                 </div>
        </div>
          
        </div>
               <jsp:include page="footer.jsp" flush="true"/> 
    
    
    
    </body>
</html>
