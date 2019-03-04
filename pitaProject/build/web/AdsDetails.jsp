<%-- 
    Document   : AdsDetails
    Created on : 13-May-2018, 17:47:54
    Author     : ahmdwafy
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>
<%@page import="OKANE.advertisementBean"%>
<%@page import="OKANE.uploadDAO"%>
<%@page import="OKANE.DatabaseOKANE"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="OKANE.signupBean"%>
<%@page import="OKANE.signupDAO"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Advertisements Details</title>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    </head>
    <body>
         <jsp:include page="header.jsp" flush="true"/>  
         <div id="itemForm">
                <table style="table-layout: fixed;width: 80%;height:40%; margin: 0 auto; " class="w3-table-all w3-hoverable" >
                    <tr>
                        
                        <th><b>Advertisement Details</b></th>
                         <th><b>Description</b></th>
                        <th><b>Price / Rate</b></th>
                        <th><b>Contacts</b></th>
                       
                    </tr>
                    <%
                        int adsId = Integer.parseInt(request.getParameter("adsID"));
                        uploadDAO myItemDAO=new uploadDAO();
                            
                        System.out.println("ads id ="+adsId);
                        
                        advertisementBean itembean = myItemDAO.getSpecificAdsInfo2(adsId);
    
                    %>
                                <tr>
                                   
                                    <td>
                                        
                                        <img src="adsImages1/<%= itembean.getAdsID()%>.jpeg"style="max-height:200px; max-width:100%">
                                    </td>
                                    <td>
                                         <b><%= itembean.getAdsTitle()%><input type="hidden" value="<%= itembean.getAdsTitle()%>" name="adsTitle"/></b></br></br>
                                        <%= itembean.getAdsDesc()%><input type="hidden" value="<%= itembean.getAdsDesc()%>" name="adsDesc"/>
                                    
                                    </td>
                                    
                                    <td><%= itembean.getPrice()%><input type="hidden" value="<%= itembean.getPrice()%>" name="adsPrice"/></td>
                                    <td>
                                        <%= itembean.getName()%><input type="hidden" value="<%= itembean.getName()%>" name="name"/></br>
                                         <%= itembean.getPhoneno()%><input type="hidden" value="<%= itembean.getPhoneno()%>" name="phno"/></br>
                                         <%= itembean.getEmail()%><input type="hidden" value="<%= itembean.getEmail()%>" name="phno"/></br>
                                    </td> 
          
                                    
                                   
                                </tr>
   
                </table>               
            </div> 
                                    
                
                                    
                                    
                    <%
                    DatabaseOKANE.closeConnection();
                    %>
        
         <jsp:include page="footer.jsp" flush="true"/> 
    </body>
</html>
