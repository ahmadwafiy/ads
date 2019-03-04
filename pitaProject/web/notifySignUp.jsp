<%-- 
    Document   : notifySignUp
    Created on : 06-May-2018, 00:42:11
    Author     : ahmadwafy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="OKANE.DatabaseOKANE"%>
<%@page import="OKANE.signupBean"%>
<%@page import="OKANE.signupDAO"%>

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
        <title>User Register Notification</title>
    </head>
    <body>
        
         <jsp:include page="header.jsp" flush="true"/> 
        <%
            //define variables
            int result = 0;
            String myemail = null;
            
            //Step 1- get info from bookingform.html
            String Email = request.getParameter("email");
            System.out.println("email = "+Email);
            String Username = request.getParameter("username");
            System.out.println("username = "+Username);
            String Password = request.getParameter("passwordReg");
            System.out.println("password = "+Password);
            
            signupBean mySignup = new signupBean();
            mySignup.setEmail(Email);
            mySignup.setUsername(Username);
            mySignup.setPassword(Password);
            
            signupDAO mysignupDAO = new signupDAO();
            
            result = mysignupDAO.addSignUp(mySignup);
            
            System.out.println("Transaction status --> Result = "+result);
            
            if(result > 0)
            {
                System.out.println("Record succecsfully added into Booking table ");
                mySignup = null;
                mySignup = mysignupDAO.getLatestSignUpInfo();
                

              
            %>
             <input type="hidden" id="ant" name="my_adsID" size="12" value=<%=mySignup.getUsername()%> >
                <script>
                var adsID = document.getElementById('ant').value;
                alert('HI! '+adsID+' Welcome to family');
                window.location='home2.jsp';
                </script>
            <%
            
                }
            %>
              <jsp:include page="footer.jsp" flush="true"/> 
    </body>
</html>
