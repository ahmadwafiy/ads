<%-- 
    Document   : searchForm
    Created on : 07-Dec-2017, 21:35:15
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
            
            <div id="site_content" style="position: relative;">
    <form id="bookingFrm" action="#" method="#">
        <fieldset id="searchForm">
            <table>
            <tr>
                <td><label for="#" id="#" style="color: white; font-size: 20px;  ">Search</label></td>
                <td><input type="text" id="#" name="#" size="40" placeholder="What you looking for"><br/></td>
             </tr>
             <tr>
               <td><label for="#" id="#" style="color: white; font-size: 20px;">Location</label></td>
                <td><select name="Location">
                     <option value="#">UMT campus</option>
                     <option value="#">Tok Jembal</option>
                     <option value="#">Mengabang Telipot</option>
                     <option value="#">Kuala Terengganu</option>
                     <option value="#">Gong Badak</option>
                 </select></td>
                </tr>
                <tr>
                    <td><label for="#" id="#" style="color: white; font-size: 20px;">Look in</label></td>
                      <td><select name="Category">
                         <option value="#">Books</option>
                         <option value="#">Home appliances</option>
                         <option value="#">Daily Services</option>
                         <option value="#">Transport</option>
                         <option value="#">Others</option>
                 </select></td>
                 </tr>
                 <tr>
                     <td><p><input Onclick="" type="submit"value="Search" style="background-color:greenyellow ;"/></p></td>
                     
                 </tr>
            </table> 
        </fieldset>
    </form>
</div>
            
            
            
      
    </body>
</html>
