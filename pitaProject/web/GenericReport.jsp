<%-- 
    Document   : GenericReport
    Created on : 15-May-2018, 00:13:47
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
        <title>Summary</title>
          <%
                session.getAttribute("id");
            
                String id = (String)session.getAttribute("id");
                
                 session.getAttribute("username");
                 String username = (String)session.getAttribute("username");
                 
                int userId = (int)session.getAttribute("userId");
               
                signupBean user = new signupBean();
                signupDAO dao = new signupDAO ();
            
                user = dao.getSpecificServiceInfo(userId);
                


            %>
            <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    </head>
    <body>
         <jsp:include page="header.jsp" flush="true"/>
        
        <div style="align-content: center; background-color:white; width:50%; margin:auto auto;">
            <h2 style="margin-left: 10%;">Summary of User</h1>
            <p style="margin-left: 10%; " >User Identification     :  <%=userId%></p>
            <p style="margin-left: 10%;"  >User Name               :  <%=username%> </p>
            <p style="margin-left: 10%;"  >List of Advertisements  :   </p>
            
             <table class="w3-table-all w3-hoverable" style="table-layout: fixed;width: 80%;height:10%; margin: auto auto; " >
                    <tr>
                        <th><b>Ads Id</b></th>
                        <th><b>Advertisements Title</b></th>
                    
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
                                    <td><p style="font-size: 15px; color:green; "><%= allItems[i].getAdsID()%></p></td>
                                    <td><b><p style="font-size: 15px;"><%= allItems[i].getAdsTitle()%></p></b></td>  
                                       
                                 </tr>      
                                                                
                                
                    <%
                            }
                       }
                        DatabaseOKANE.closeConnection();
                    %>
                
                </table>
                    
                    <br/>
          <h4 style="margin-left: 10%;" >Back to Advertisements Listing ?</h4>
         <%-- <input style="margin-left: 10%;" type="button" value="Yes"
                           onclick="window.location='Report.jsp'"/> --%>
                    <input style="margin-left: 10%;" type="button" value="Back"
                           onclick="window.location='myAdvertisements.jsp'"/>
                    
       </div>  
              <jsp:include page="footer.jsp" flush="true"/>       
    </body>
</html>
