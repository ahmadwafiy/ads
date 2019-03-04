<%-- 
    Document   : adsUpdate2
    Created on : 15-May-2018, 09:53:29
    Author     : User
--%>

<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
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
        <title>Update Notification</title>
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <style>
             
          
          
             h1{
                 font-weight: bold;
                 color: white;
                 text-align:justify;
                text-justify: auto;
             }   
                  #displayBox{
                 
                      font-family:arial,sans-serif,white;
                 font-weight:bold;
                 background-color: white;
                 align-content: center;
                 background-image: url(kayu2.jpg);
                 width: 60%;
                 margin-left: 300px;
                 margin-top: 50px;
                 padding-left:30px; 
                  background-size: cover;
                  
             }
             
           
             p, h1{
                 
                 color: white;
             }
             
      
           
         </style>
    </head>
    <body>
        
        <jsp:include page="header.jsp" flush="true"/> 
        
        
        <div id="displayBox">
        <h1 style="color:white;">Record Update Notification</h1>
        <%
             int result = 0;
        
          int ads_ID = Integer.parseInt(request.getParameter("ads_ID"));
            System.out.println("ads ID = "+ads_ID); 
            
           int category = Integer.parseInt(request.getParameter("category"));
              System.out.println("category = "+category);
            
              String ad_title = request.getParameter("adsTitle");
              System.out.println("Title = "+ad_title);
            
              String ad_desc = request.getParameter("desc");
              System.out.println("Desc = "+ad_desc);
            
              String user_Name = request.getParameter("name");
              System.out.println("Name = "+user_Name);
            
              String ad_price = request.getParameter("price");
              System.out.println("price = "+ad_price);
            
              String ad_email = request.getParameter("email");
              System.out.println("Email = "+ad_email);
            
              String ad_phNo = request.getParameter("phoneno");
              System.out.println("Phone no = "+ad_phNo);
              
              File adsPhoto = new File("C:/Users/User/Desktop/pitaProject/pitaProject/web/adsImages1/"+request.getParameter("photo"));   
              System.out.println("adsPhoto = "+adsPhoto);
              
             int user_ID = Integer.parseInt(request.getParameter("userId"));
            System.out.println("User ID = "+user_ID); 
            
                  advertisementBean myAds = new advertisementBean();

                    myAds.setAdsID(ads_ID);
                    myAds.setCategory(category);
                    myAds.setAdsTitle(ad_title);
                    myAds.setAdsDesc(ad_desc);
                    myAds.setName(user_Name);
                    myAds.setPrice(ad_price);
                    myAds.setEmail(ad_email);
                    myAds.setPhoneno(ad_phNo);
                    myAds.setPhoto(adsPhoto);
                    myAds.setUserID(user_ID);
                   
                    uploadDAO myUploadDAO = new uploadDAO();
                    
                     result = myUploadDAO.updateAds(myAds);
                     System.out.println("Updating Transaction status : "+result);
                     
                if(result > 0)
                {
                    System.out.println("Record Saved");              
        %> <p>Update succesfully Saved</p>
        
        <%          
                    myAds = null;
                    String adcategory = null;
                    myAds = myUploadDAO.getSpecificAdsInfo(ads_ID);
                    
                     //out.println("<p><h1>Details Of Advertisement:<h1></P>");
                     out.println("<p>Advertisement ID : "+ myAds.getAdsID()+"</p>");
                       
                      if (myAds.getCategory()== 1)
                          adcategory = "Items";
                      if (myAds.getCategory() == 2)
                          adcategory = "Transport";
                      if (myAds.getCategory()== 3)      
                        adcategory = "Daily Services";
                      
                     out.println("<p> Category " +adcategory +"</p>");
                      
                     out.println("<p>Advertisment Title : "+ myAds.getAdsTitle()+"</p>");
                     out.println("<p>Advertisement Description: "+ myAds.getAdsDesc()+"</p>");
                     out.println("<p>Advertiser Name : "+ myAds.getName()+"</p>");
                     out.println("<p>Price : "+ myAds.getPrice()+"</p>");
                     out.println("<p>Query Email : "+ myAds.getEmail()+"</p>");
                     out.println("<p>Contact : "+ myAds.getPhoneno()+"</p>");
                     out.println("<img width=400 height=300 src=adsImages1/updateItem.jpeg>");//belum siap
                      
                }
                DatabaseOKANE.closeConnection();
        %>
        <br>
          <input type="button" value="Display Record" onClick="window.location='myAdvertisements.jsp'"/>
        
       </div> 
          
          
            <jsp:include page="footer.jsp" flush="true"/>  
   
          
          
    </body>
    
    
    
</html>
