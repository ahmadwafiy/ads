<%-- 
    Document   : loginProcess
    Created on : 06-May-2018, 19:05:15
    Author     : ahmdwafy
--%>


<%@page import="OKANE.DatabaseOKANE"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java"%>
<%@page import="java.sql.*"%>
<%@page import="OKANE.signupBean"%>
<%@page import="OKANE.signupDAO"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Process</title>
    </head>
    <body>
           <jsp:include page="header.jsp" flush="true"/> 
            <div style="background-color: black; width: 100%; height: 50px;margin-top: -5px;">
                
                <button onclick="document.getElementById('id01').style.display='block'" style="width:auto;height: 37px; margin-left: 90%;">Login</button>
            </div>
                    <jsp:include page="mainbody.jsp" flush="true"/>
        <%
            
            Connection con = DatabaseOKANE.getConnection();
            signupBean login = new signupBean();

            String username = request.getParameter("username");
            String pass = request.getParameter("pssword");
            
  
             Statement st = con.createStatement();
            ResultSet rs;
            
            rs = st.executeQuery("SELECT * FROM signup WHERE username='" + username + "' and pssword='" + pass + "'");
      
           
            
            if(rs.next()) {
               
                        session.setAttribute("username", username);
                         session.setAttribute("pssword", pass);
                         session.setAttribute("userId",rs.getInt("userid"));
                         response.sendRedirect("home2.jsp");
                         //tambah direct to user interface mcm 
                    
                }
            else
                {
                     %>
                     <script>
                        alert('Whoops! seems something wrong, try again');
                        window.location='home2.jsp';
                     </script>
                    <%  
                     
                    
                     
                }
        
                    %>    
             
                <jsp:include page="footer.jsp" flush="true"/>  
    </body>
</html>
