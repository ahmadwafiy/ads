<%-- 
    Document   : adsUpdateForm
    Created on : 13-Dec-2017, 05:12:49
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="OKANE.DatabaseOKANE"%>
<%@page import="OKANE.advertisementBean"%>
<%@page import="OKANE.uploadDAO"%>
<%@page import="java.util.StringTokenizer"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Record</title>
        
        <style>                         
                            body{
                                margin: 0 auto;
                                background-image: url(pop.jpg);
                                background-repeat: no-repeat;
                                background-size: 100%;
                            }
                            .container {
                                padding: 50px;
                               
                                width:1000px;
                                heigth: 800px;
    
                                border-radius: 4px;
                                margin: 0 auto;
                                margin-top: 90px;
                                margin-left: 100px;                              

                            }
                                label { display: inline-block; 
				        width: 140px; 
					text-align: left; 
				        padding-top: 10px;
                                        color:white;
                                        font-size:15px;
                               input{
                                    
                                   height: 50px;
                                   
                                }      
        </style>
    </head>
    <body>
        
        <%

                  session.getAttribute("username");
            String username = (String)session.getAttribute("username");
            
            int userId = (int)session.getAttribute("userId");
  
        %>
          <jsp:include page="header.jsp" flush="true"/> 
        
          <h1 style="  color: white;">Please Complete This Details</h1>
 
    <form action="adsUpdate.jsp" id="updateFrm" method="post" style="font-weight:bold; width:800px; " >                               
                   <%                                                       //DaRi for
                         int lastAdsID = Integer.parseInt(request.getParameter("adsID"));
                    
                          advertisementBean myAds = new advertisementBean();
                    
                             uploadDAO myUploadDAO = new uploadDAO();
                    
                             myAds  = myUploadDAO.getSpecificAdsInfo(lastAdsID);
            
                    %>                  

 <fieldset   style="width:800px; align-content: center;">
			<legend style="color:#ffcc00; font-size: 20px;">Advertisement Details</legend>
		   	
                        <label for="adsID" >Advertisement ID</label> 
                        <input type="text" id="adsID" size="50"  name="ads_ID" readonly="readonly" value="<%=myAds.getAdsID()%>" ><br>
                        
                        
                        
                       <%
                            int lastCategory = myAds.getCategory();
                             System.out.println("last punya "+lastCategory);
                       %>
     
			<label for="category" >Category</label>
                            <select id="category" name="category"  >
                                 <%
                                    if(lastCategory == 1)
                                { %>
                                 <option value="1" select="selected">Item</option>
                                  <%  
                                }
                            else     
                                    if(lastCategory == 2)
                                {
                                  %> 
                                  <option value="2" select="selected">Transports</option>
                                  <% }
                             else
                                             if(lastCategory == 3)
                                    { %>
                                     <option value="3" select="selected">Daily Service</option> 
                              <%    } %>
                                       
			      	      
                            </select>
			<br/>                           								
                        <label for="image">Image</label>
                        <input type="file" name="photo"  value="<%=myAds. getPhoto()%>" ><br>
                        
                         <label for="adstitle">Ads Title</label>
                         <input type="text"  size="50"  name="adsTitle" value="<%=myAds.getAdsTitle()%>" required ><br>
                      
                         <label for="description">Description</label><br>
                         <br>
                         <textarea rows="4" cols="50" name="desc" value="<%=myAds.getAdsDesc()%>">
                             
                         </textarea> <br>
                         
                         <label for="name">Name</label>
                         <input type="text" value="<%=myAds.getName() %>" name="name" required><br>
                         
                         <label for="email">Contact Email</label>
                         <input type="email" value="<%=myAds.getEmail()%>" name="email" required><br>
                         
                         <label for="phoneno">Contact No.</label>
                         <input type="text" value="<%=myAds.getPhoneno() %>" name="phoneno" required><br>
                         
                         <label for="price">Charge Rate / price</label>
                         <input type="text" value="<%=myAds.getPrice() %>" name="price" required><br>
                         
                         <label for="adsID" >Poster ID</label> 
                        <input type="text" id="userID" size="50"  name="userId" readonly="readonly" value="<%=myAds.getUserID()%>" ><br>

                         <br><p><input type="submit" value="Submit">&nbsp;&nbsp;<input type="reset" value="reset"/></p>
 
 </fieldset>
                                   
</form>
     
        
        
        
        
           <jsp:include page="footer.jsp" flush="true"/> 
    </body>
</html>
