<%-- 
    Document   : myAdvertisements
    Created on : 14-May-2018, 21:24:23
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="OKANE.DatabaseOKANE"%>
<%@page import="OKANE.advertisementBean"%>
<%@page import="OKANE.uploadDAO"%>
<%@page import="OKANE.signupBean"%>
<%@page import="OKANE.signupDAO"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Advertisements</title>
         <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        
         <%
                session.getAttribute("id");
            
                String id = (String)session.getAttribute("id");
                int userId = (int)session.getAttribute("userId");
               
                signupBean user = new signupBean();
                signupDAO dao = new signupDAO ();
            
                user = dao.getSpecificServiceInfo(userId);
                
            %>
        
             
            
        
        
    </head>
    <body>
        <jsp:include page="header.jsp" flush="true"/>  
        
        <div id="itemForm">
                <table class="w3-table-all w3-hoverable" style="table-layout: fixed;width: 80%;height:40%; margin: 0 auto; " >
                    <tr>
                        <th><b>Ads Id</b></th>
                        <th><b>Description</b></th>
                        <th><b>Image</b></th>      
                        <th><b>Contact</b></th>
                        
                        <th colspan="2"><b>Action</b></th>
                    </tr>
                    <%
                        uploadDAO myItemDAO=new uploadDAO();
                                //kena check 
                        advertisementBean[] allItems = myItemDAO.getAllAdsInfo(userId);
                        if(allItems !=null)
                        {
                            for(int i=0;i<allItems.length;i++)
                            {
                    %>
                                <tr>
                                    <td><p style="font-size: 15px; color: green; "><%= allItems[i].getAdsID()%></p></td>
                                    <td>
                                       <b><p style="font-size: 15px;"><%= allItems[i].getAdsTitle()%></p></b><br/>
                                        <%= allItems[i].getAdsDesc()%><br/>
                                        <p>Price :<span style="font-size:15px; font-weight: bold; color: red;"> <%= allItems[i].getPrice()%></span></p><br/>
                                        
                                        
                                    </td>               
                                    <td><img src="adsImages1/<%= allItems[i].getPhoto()%>"style="max-height:200px; max-width:100%"></td>
                                    <td>
                                        <%= allItems[i].getName()%><br/>
                                        <%= allItems[i].getEmail()%><br/>
                                        <%= allItems[i].getPhoneno()%>
                                        
                                    </td>
                                    <td><input type="button" value=Edit onClick="window.location='adsUpdateForm2.jsp?adsID=<%= allItems[i].getAdsID()%>'"/></td>
                                    <td><input type="button" value=Delete onClick="window.location='DeleteRecordAds2.jsp?adsID=<%= allItems[i].getAdsID()%>'"/></td>
                                </tr>
                                
                                
                    <%
                            }
                       }
                        DatabaseOKANE.closeConnection();
                    %>
                
                </table>
                <input type="button" value="Summary" style="margin-left: 85%;" onClick="window.location='GenericReport.jsp'" />
            </div>
                    
             <jsp:include page="footer.jsp" flush="true"/>        
                    
    </body>
</html>
