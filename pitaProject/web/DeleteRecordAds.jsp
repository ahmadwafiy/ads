<%-- 
    Document   : DeleteRecordAds
    Created on : 13-Dec-2017, 22:50:40
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
        <title>Delete Record</title>
    </head>
    <body>
            <jsp:include page="header.jsp" flush="true"/> 
        <form>
            <p><i>Advertisement Upload Form</i></p>
        <%
            int result = 0;
            int adsId = Integer.parseInt(request.getParameter("adsID"));
            uploadDAO myadsDAO = new uploadDAO();
            
            result = myadsDAO.deleteAds(adsId);
            
            if(result>0)
            {
        %>  
            <input type="hidden" id="adsID" name="my_adsID" size="12" value=<%=adsId%> >
                <script>
                var adsID = document.getElementById('adsID').value;
                alert('record with Advetisement ID'+adsID+'eliminated');
                window.location='AdsRecord.jsp';
                </script>
        <%
            }
           else           
            {
        %>
         <script>
                    alert('Fail to delete record with Advertisement ID'+adsID);
                    window.back();
            </script>
        <%
            }
        %>
      </form>  
         </br>
        </br>
      
        
           <footer style="position:relative;top:800px;margin:0px;width:100%;height:35px;background-color:#404040;text-align:left;vertical-align: middle;font-size: 13px;display: flex;align-items: center;color:#D3D3D3;">
			&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
			&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
			Copyright &copy;<p> 2017  ahmdwafy</p>
       </footer> 
        
        
    </body>
</html>
