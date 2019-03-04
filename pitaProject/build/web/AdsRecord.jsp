<%-- 
    Document   : <jsp:include page="header.jsp" flush="true"/> 
    Created on : 13-Dec-2017, 02:37:16
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="OKANE.DatabaseOKANE"%>
<%@page import="OKANE.advertisementBean"%>
<%@page import="OKANE.uploadDAO"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Advertisement Record</title>
       <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
      
    </head>
    <body>
         <jsp:include page="header.jsp" flush="true"/> 
        
         <%-- <h1 style="color:white;">Advertisement Records</h1> --%>
        
        <table border="0" class="w3-table-all" id="table">
            <tr class="w3-red">
                <th><b>Advertisement ID</b></th>
                <th><b>Category</b></th>
                <th><b>Advertisement Title</b></th>
                <th><b>Advertisement Description</b></th>
                <th><b>Name </b></th>
		<th><b>Pricing</b></th>
		<th><b>Email</b></th>
                <th><b>Phone No</b></th>
                <th><b>Option</b></th>				
            </tr>
            <%
                uploadDAO myadsDAO = new uploadDAO();
                                                       //to be add later in DAO
               advertisementBean [] allAds = myadsDAO.getAllAdsInfo();
                
                if( allAds != null)
                {
                    for(int x = 0;x <  allAds.length;x++)
                    {              
             %>       
                    <tr  class="w3-hover-text-blue">
                        <td><%=  allAds[x].getAdsID()%></td><%
                       
                            
                         if(allAds[x].getCategory() == 1)
                         %><td>Items</td> <%
                         if(allAds[x].getCategory() == 2)
                         %><td>Transports</td><%
                         if(allAds[x].getCategory() == 3)
                         %><td>Daily Services</td>
                       
                      <%System.out.println("category test :"+allAds[x].getCategory());%>
                         
                         
                        <td><%=  allAds[x].getAdsTitle()%></td>
                        <td><%=  allAds[x].getAdsDesc()%></td>
                        <td><%=  allAds[x].getName()%></td>
                        <td><%=  allAds[x].getPrice()%></td>
                        <td><%=  allAds[x].getEmail()%></td>
                        <td><%=  allAds[x].getPhoneno()%></td>
                        
                                     
                         
                       <td>
                            <input type="button" value="Update" onClick="window.location='adsUpdateForm.jsp?adsID=<%=allAds[x].getAdsID()%>'"/>
                            <input type="button" value="Delete" onClick="window.location='DeleteRecordAds.jsp?adsID=<%=allAds[x].getAdsID()%>'"/>
                       </td>  
                         
                    </tr> 
                        
                <%             
                    }
                        
                }
                    DatabaseOKANE.closeConnection();
                 %>   
           </table></br></br>
        
        
        
        
        
         <jsp:include page="footer.jsp" flush="true"/> 
        
    </body>
</html>
