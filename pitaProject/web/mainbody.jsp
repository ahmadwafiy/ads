<%-- 
    Document   : mainbody
    Created on : 07-Dec-2017, 01:43:34
    Author     : ahmdwafy
--%>

<!DOCTYPE html>
<html>
<title>IMAGE SLIDE</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
 .mySlides {display:none;}
</style>

<body>


    <div id="slide" class="xslide">
        <img src="blur.jpg" style="width:100%"> 
        <div class="slideCaption">Got Some</br>&emsp;&emsp;&emsp;&emsp;Item to Sell ?</div>
    </div>
    
    <div id="slide" class="xslide">    
        <img  src="abs.jpg" style="width:100%">
        <div class="slideCaption">Got Some</br>&emsp;&emsp;&emsp;&emsp;Services to </br>Promote ?</div>
    </div>
    
    <div id="slide" class="xslide"> 
        <img  src="dark.jpg" style="width:100%">
        <div class="slideCaption" >Sign Up Now</br>&emsp;&emsp;&emsp;&emsp;and Post your Advertisements</br> For <span id="free">Free</span></div>
    </div>

    <script>
        var myIndex = 0;
        carousel();

        function carousel() {
        var i;
        var x = document.getElementsByClassName("xslide");
        for (i = 0; i < x.length; i++) {
            x[i].style.display = "none";  
        }
        myIndex++;
        if (myIndex > x.length) {myIndex = 1}    
        x[myIndex-1].style.display = "block";  
        setTimeout(carousel, 5000); // Change image every 5 seconds
}
    </script>

</body>
</html>
