<%-- 
    Document   : loginProcessCust
    Created on : 12-Apr-2018, 00:57:20
    Author     : User
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Log in</title>
        <link rel="icon" type="image/gif" href="Picture/Logo.jpg" />
        
         <style>			         
            label { display: inline-block; 
                    width: 140px; 
                    text-align: left; 
                    padding-top: 10px;}​
	</style>
        
        
    </head>
    <body  background="Picture/Oren.jpg">
         <fieldset>
            <legend>User Log In</legend>        
                <%
                  Class.forName("com.mysql.jdbc.Driver");
                  String mySQL = "jdbc:mysql://127.0.0.1:3306/OKANE";
                  Connection myConnection=DriverManager.getConnection(mySQL,"root","sayamaumasuk45");
                  Statement statement = myConnection.createStatement();
                  String username = request.getParameter("uname");
                  String password = request.getParameter("psw");
                  ResultSet rs = 
                      statement.executeQuery("SELECT * FROM usersAds WHERE username = '" +username+ "' AND passwoord = '" +password+ "'") ;
                  
                  if(!rs.next()) 
                  {
                        out.println("<b>Opps! it seems you not been register yet, please register firs to proceed</b>");
                %>
                      <br/><br/><br/><input type="button" value="Return to Login" onClick="window.location='home2.jsp'"/>
                               
                <%
                    }
                       else 
                    {
                %>
                
                <script>
                    window.location = 'antaramukaCust.jsp';
                </script>
                <footer>&copy2017-ahmdwafy</footer>
                <%
                    }
                %>
        </fieldset>
    </body>
</html>
