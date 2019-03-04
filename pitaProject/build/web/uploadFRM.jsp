<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

 <head>
		       <meta charset="UTF-8">
                       <meta name="viewport" content="width=device-width, initial-scale=1.0">
                       <title>Post Advertisements</title>
		       
                        <style>	
                            
                            body{
                                margin: 0 auto;
                                background-image: url(pop.jpg);
                                background-repeat: no-repeat;
                                background-size: 100%;
                            }
                            .container {
                                padding: 50px;
                               
                                width:1000px;
                                heigth: 800px;
    
                                border-radius: 4px;
                                margin: 0 auto;
                                margin-top: 90px;
                                margin-left: 100px;                              

                            }
                                label { display: inline-block; 
				        width: 140px; 
					text-align: left; 
				        padding-top: 10px;
                                        color:white;
                                        font-size:15px;
                               input{
                                    
                                   height: 50px;
                                   
                                }  
			</style>	
       <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
       <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lobster">
                </head>	 
<body>
    <jsp:include page="header.jsp" flush="true"/>   
    <h1 div class="w3-container w3-white">Please Complete This Details</h1>
 <div class="container" >
    <form action="notifyUpload.jsp" id="uploadFrm" method="post" style="justify-content:center;font-weight:bold;width:800px;"  >
                                    
                                   

 <fieldset   style="width:800px; align-content:center;">
			<legend style="color:#ffcc00; font-size: 20px;">Advertisement Details</legend>
		   	  		    
			<label for="category" >Category</label>
                            <select class="w3-input w3-border w3-round,w3-input w3-hover-green" id="category" name="category">
			      <option value="1">Item</option>
			      <option value="2">Transports</option>
			      <option value="3">Daily Service</option>
                            </select>
			<br/>                           								
                        <label for="photo">Photo</label>
                        <input class="w3-input w3-border w3-round,w3-input w3-hover-red" type="file" name="photo" id="photo"   size="50" placeholder="upload photo" required /><br>
                        
                         <label for="adstitle">Ads Title</label>
                         <input class="w3-input w3-border w3-round,w3-input w3-hover-aqua" type="text" placeholder="Ads Title" size="50"  name="adsTitle" required ><br>
                      
                         <label for="description">Description</label><br>
                         <br>
                         <textarea class="w3-input w3-border w3-round,w3-input w3-hover-yellow" rows="4" cols="50" name="desc"  style="width: 167px;" >
                             
                         </textarea> <br>
                         
                         <label for="name">Name</label>
                         <input class="w3-input w3-border w3-round,w3-input w3-hover-green" type="text" placeholder="Enter Your Name" name="name" required><br>
                         
                         <label for="email">Contact Email</label>
                         <input  class="w3-input w3-border w3-round,w3-input w3-hover-red" type="email" placeholder="Enter Your Email" name="email" required><br>
                         
                         <label for="phoneno">Contact No.</label>
                         <input class="w3-input w3-border w3-round,w3-input w3-hover-aqua" type="text" placeholder="Enter Your Phone Number" name="phoneno" required><br>
                         
                         <label for="price">Charge Rate / price</label>
                         <input class="w3-input w3-border w3-round,w3-input w3-hover-yellow" type="text" placeholder="Enter rate of charge" name="price" required><br>

                         <br><input class="w3-button w3-white w3-border w3-border-red w3-round-large" type="submit" value="Proceed">
 
 </fieldset>
                                   
</form>
     </div>
    
    
       <jsp:include page="footer.jsp" flush="true"/> 
</body>
</html>
