<%-- 
    Document   : home2
    Created on : 24-Mar-2018, 02:07:23
    Author     : ahmadwafiy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>homepage 2</title>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
         <%-- ..................style for login pop up.........................................--%>
        <style>
            
            
            
            
            
                /* Full-width input fields */
                input[type=text], input[type=password] {
                    width: 90%;
                    padding: 12px 20px;
                    margin: 8px 0;
                    display: inline-block;
                    border: 1px solid #ccc;
                    box-sizing: border-box;
                }

                /* Set a style for all buttons */
                button {
                    background-color: #4CAF50;
                    color: white;
                    padding: 14px 20px;
                    margin: 8px 0;
                    border: none;
                    cursor: pointer;
                    width: 100%;
                }

                button:hover {
                    opacity: 0.8;
                }

                /* Extra styles for the cancel button */
                .cancelbtn {
                    width: auto;
                    padding: 10px 18px;
                    background-color: #f44336;
                }

                /* Center the image and position the close button */
                .imgcontainer {
                    text-align: center;
                    margin: 24px 0 12px 0;
                    position: relative;
                }

                img.avatar {
                    width: 15%;
                    border-radius: 50%;
                }

                .container1 {
                    padding: 16px;
                }
                
                 .container2 {
                    padding: 16px;
                }
                

                span.psw {
                    float: right;
                    padding-top: 16px;
                }

                /* The Modal (background) */
                .modal {
                    display: none; /* Hidden by default */
                    position: fixed; /* Stay in place */
                    z-index: 1; /* Sit on top */
                    left: 0;
                    top: 0;
                    width: 100%; /* Full width */
                    height: 100%; /* Full height */
                    overflow: auto; /* Enable scroll if needed */
                    background-color: rgb(0,0,0); /* Fallback color */
                    background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
                    padding-top: 60px;
                }

                /* Modal Content/Box */
                .modal-content {
                    background-color: #fefefe;
                    margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
                    border: 1px solid #888;
                    width: 40%; /* Could be more or less, depending on screen size */
                    justify-content: center;
                   
                }

                /* The Close Button (x) */
                .close {
                    position: absolute;
                    right: 25px;
                    top: 0;
                    color: #000;
                    font-size: 35px;
                    font-weight: bold;
                }

                .close:hover,
                .close:focus {
                    color: red;
                    cursor: pointer;
                }

                /* Add Zoom Animation */
                .animate {
                    -webkit-animation: animatezoom 0.6s;
                    animation: animatezoom 0.6s
                }

                @-webkit-keyframes animatezoom {
                    from {-webkit-transform: scale(0)} 
                    to {-webkit-transform: scale(1)}
                }

                @keyframes animatezoom {
                    from {transform: scale(0)} 
                    to {transform: scale(1)}
                }

                /* Change styles for span and cancel button on extra small screens */
                @media screen and (max-width: 300px) {
                    span.psw {
                       display: block;
                       float: none;
                    }
                    .cancelbtn {
                       width: 100%;
                    }
                }
                
                
                .modal .register-form{
                
                display: none;
            }
            
            .register-form{
                
                 width: 100%; /* Could be more or less, depending on screen size */
            }
            
            .form-login{
                
                 width: 100%; /* Could be more or less, depending on screen size */
            }
                
                
        </style>
 <%-- ..................Style for log in pop up................................................--%>
        
    </head>
    <body>
         <jsp:include page="header.jsp" flush="true"/>   
    
         
         
         <%-- ......................Log in pop up.............................................--%>

            <div style="background-color: black; width: 100%; height: 50px;margin-top: -5px;">
                
                <button onclick="document.getElementById('id01').style.display='block'" style="width:auto;height: 37px; margin-left: 90%;">Login</button>
               
                <%-- login--%>
                <div id="id01" class="modal">
                    
                      <div class="modal-content animate">
                          
                    <form class="form-login" action="loginProcess.jsp" >
                    <div class="imgcontainer">
                      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
                      <img src="avatar1.png" alt="Avatar" class="avatar">
                      </div>
  
                    <div class="container1" >
                      <label><b>Username</b></label>
                      <input type="text" placeholder="Enter Username" name="username" id="uname" required>

                      <label><b>Password</b></label>
                      <input type="password" placeholder="Enter Password" name="pssword" id="psw" required>

                      <button type="submit">Log In</button>
                   
                    </div>

                    <div class="container1" style="background-color:#f1f1f1">
                      <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
                      <span class="psw">Do not have account ? <a href="#">Register Now</a></span><%----link ke new users ---%>
                    </div>
                    
                    
                  </form>
                  <%-----------------------end of login form---------------------------------------------%>  
                  <%---------------- register-----------------------------------------%>
                  <form class="register-form" action="notifySignUp.jsp" method="post" onsubmit="return checkPassword()">
                        
                   <div class="imgcontainer">
                      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
                      <img src="avatar1.png" alt="Avatar" class="avatar">
                   </div>
                    
                   <div class="container1" >
                       
                       
                      <label for="email"><b>Email</b></label><br/>
                      <input type="text" placeholder="Enter Email" name="email" required>
     
                      <label><b>Username</b></label>
                      <input for="email" type="text" placeholder="Enter Email" name="username" id="email" required>

                      <label><b>Password</b></label>
                      <input type="password" placeholder="Enter Password" name="passwordReg" id="password" required><br/>
                      
                       <label><b>Re-Enter Password</b></label>
                      <input type="password" placeholder="Repeat Password" id="pswrepeat" name="pswrepeat" id="passwordReg" required>

                      
                      <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>
                      
                      
                     
                      <button type="submit" class="signup">Sign Up</button>
                   
                   </div>
                
                   <div class="container1" style="background-color:#f1f1f1">
                      <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
                      <span class="psw">Already have account ? <a href="#">Login Now</a></span> <%----link ke new users ---%>
                    </div>  
                       
                      
                  </form>
                <%---------------end of register form----------------------------------------%>
         </div>
                </div>
                    
          <script><%------check mismatch password in creating users ----------%>
            function checkPassword()
            {
                
                var password = document.getElementById("password").value;
                var rptpassword = document.getElementById("pswrepeat").value;

                
                if(password !== rptpassword )
                {
                    alert("Please enter the right password..!");
                    return false;
                }
                else
                {
                    return true;
                }
            }
            </script>
           
                <script src='https://code.jquery.com/jquery-3.3.1.min.js'>
                </script>
                
                <script>
                    <%----- modal motion -----%>
                $('.psw a').click(function(){
                $('form').animate({height:"toggle",opacity:"toggle"},"slow");    
                });    
                </script>   
                    
                <script>
                // Get the modal
                var modal = document.getElementById('id01');

                // When the user clicks anywhere outside of the modal, close it
                window.onclick = function(event) {
                    if (event.target == modal) {
                        modal.style.display = "none";
                    }
                }
                
                </script>
               <%-- <script>
                var username = "test1";
                var password = "pass1";
                
                function login(){
                    if (document.getElementById("uname").value == username){
                        if (document.getElementById("psw").value == password){
                            window.location.href="uploadFRM.jsp";
                        }
                    }
                }
                </script> ---%>
            
       <%-- ....................end of login pop up......................................................--%>
         
          </div>
          
       <%--........................................images slide..........................................--%>
          <jsp:include page="mainbody.jsp" flush="true"/>
            
        
          <div id="bottomSpacer" style=" margin-top: 3% ;">
             
              <div class="container">
                  
                  
                  <div class="box1">
                      <h1>Items</h1>
                      <p >Find Something you might love here</p>
                      <button style="width:55%;" class="w3-button w3-green" onClick="window.location='dislpayAds.jsp'">Browse Here</button>
                     
                  </div>
             
                  <div class="box2"><h1>services</h1>
                  <p >Find Services that you need</p>
                  <button style="width:55%;" class="w3-button w3-yellow" onClick="window.location='displayAdstransport.jsp'">Browse Here</button>
                  </div>
                  
                  <div class="box3"><h1>Transports</h1>
                  <p>Need a Ride? Browse here</p>
                   <button style="width:55%;" class="w3-button w3-blue" onClick="window.location='displayAdsServis.jsp'">Browse Here</button>
                  </div>
                  
                  <div class="box4"><h1>Post ads</h1>
                  <p>Advertise your items or services</p>
                  <button onClick="window.location='uploadFRM.jsp'" style="width:50%;" class="w3-button w3-red">Let's Go</button>
                  </div>
                  
              </div>
              
              <div class="container2">
                  <div class="bottombox1">
                      <img src="sell.jpg" style="width:250px;height:80px;">
				
				<br/><p style="color:black; margin-top:20px;">Snap, upload and start earning now. Always feel
                                    <span class="w3-tag w3-xlarge w3-padding w3-red" style="transform:rotate(-7deg)">free</span>
                                    to use our service to make money.</p>
				<br/>
				
                      
                      
                  </div>
                  
                  <div class="bottombox2">
                       <img src="okane.png" style="width:100%;height:30%;">
                       
                       
                       <p><i class="fa fa-quote-right w3-large" style="color:black;"></i><br>
                         <i class="w3-serif w3-xlarge" style="color:black;">
                             We are a team driven by willingness to ease students life.</i></p>
                             <p style="color:#000">Learn <span style="blue"><a href="#">more</a></span></p>
      
                  </div>
                  
              </div>
              
              
              
              
              
          </div>
     
             <jsp:include page="footer.jsp" flush="true"/> 
   
    
    
    
    </body>
</html>
