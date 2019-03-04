<%-- 
    Document   : dislpayAds
    Created on : 12-May-2018, 21:56:01
    Author     : ahmdwafy
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" name="viewport" content="width=device-width, initial-scale=1">
        
        <title>Advertisements view</title>
            <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
   
    
        
        
    </head>
    <body>
        <jsp:include page="header.jsp" flush="true"/>  
        
        
        
            
           <script>
                function myFunction() {
                 var input, filter, table, tr, td, i;
                     input = document.getElementById("myInput");
                     filter = input.value.toUpperCase();
                     table = document.getElementById("myTable");
                     tr = table.getElementsByTagName("tr");
                for (i = 0; i < tr.length; i++) {
                     td = tr[i].getElementsByTagName("td")[1];
                     if (td) {
                       if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
                           tr[i].style.display = "";
                      } else {
                                    tr[i].style.display = "none";
                             }
                            }
                         }
                                        }
            </script>
        
        
        <div id="itemForm">
                    
            
            
  <input class="w3-input w3-border w3-padding" type="text" placeholder="Search for names.." id="myInput" onkeyup="myFunction()" style="width:35%;align-items: center; width: 80%;height:35%; margin: 0 auto; ">
            
                <table  id="myTable" class="w3-table-all w3-hoverable" style="table-layout: fixed;width: 80%;height:35%; margin: 0 auto; " >
                    <tr class="w3-light-grey">

                        <th><b>Image</b></th>

                        <th><b>Description</b></th>
                        <th><b>owner name /price</b></th>
                       
                    </tr>
                    <%
                        uploadDAO myItemDAO=new  uploadDAO();

                        advertisementBean[] allItems = myItemDAO.getAllAdsService();
                        if(allItems !=null)
                        {
                            for(int i=0;i<allItems.length;i++)
                            {
                    %>
                                <tr id="myUL"    onClick="window.location='AdsDetails.jsp?adsID=<%= allItems[i].getAdsID()%>'">           <%---details on ads------%>                        
                                    <td>
                                         <div Style="height:200px; width:200px;  background-size: cover;">
                                            <img src="adsImages1/<%= allItems[i].getPhoto()%>" style="max-height:100%; max-width:100%;  ">
                                         </div>   
                                    </td> 
                                    <td >
                                        <b><p style="font-size: 25px;"><%= allItems[i].getAdsTitle()%><input type="hidden" value="<%= allItems[i].getAdsDesc()%>" name="adsTitle"/></p></b>
                                        
                                        </br></br><p>Category : Services / Daily Services </p>
                                    </td>
                                   
                                        <td><%= allItems[i].getName()%><input type="hidden" value="<%= allItems[i].getName()%>" name="adsName"/></br>
                                             </br><p>Price / Rate :</p> <p style="font-size:15px; font-weight: bold; color: red;"><%= allItems[i].getPrice()%><input type="hidden" value="<%= allItems[i].getPrice()%>" name="itemPrice"/></p>
                                        </td>
                        
                                </tr>
                    <%
                            }
                       }
                    %>

                </table>
                
            </div>
            
                    <%
                    DatabaseOKANE.closeConnection();
                    %>
        
        
         <jsp:include page="footer.jsp" flush="true"/> 
    </body>
</html>
