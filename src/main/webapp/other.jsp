
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigator.jspf"%>
<%@ include file="common/footer.jspf"%>
<!DOCTYPE html>  
<html>  
<head>  
<meta name="viewport" content="width=device-width, initial-scale=1">  
<style>  
body{  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: url("https://www.shutterstock.com/image-photo/travel-collage-famous-places-world-600w-1144071677.jpg");  
}  
.container {  
    padding: 50px;  
  background-color: lightblue;  
}  
  
input[type=text], input[type=password], textarea {  
  width: 100%;  
  padding: 15px;  
  margin: 5px 0 22px 0;  
  display: inline-block;  
  border: none;  
  background: #f1f1f1;  
}  
input[type=text]:focus, input[type=password]:focus {  
  background-color: orange;  
  outline: none;  
}  
 div {  
            padding: 10px 0;  
         }  
hr {  
  border: 1px solid #f1f1f1;  
  margin-bottom: 25px;  
}  
.registerbtn {  
  background-color: #4CAF50;  
  color: white;  
  padding: 16px 20px;  
  margin: 8px 0;  
  border: none;  
  cursor: pointer;  
  width: 100%;  
  opacity: 0.9;  
}  
.registerbtn:hover {  
  opacity: 1;  
}  
</style>  
</head>  
<body>  
<form action="/other" method="post" > 
  <div class="container">  
  <center>  <h1>Booking Package</h1> </center>  
  <hr>  
  <label> UserName </label>   
<input type="text" name="userName" placeholder= "userName" size="15" required />   
<label>Email Address  </label>   
<input type="text" name="emailId" placeholder="Email Address" size="15" required />   
 <label>Mobile Number </label>   
<input type="text" name="phnNum" placeholder="Mobile Number" size="15" required />   
   <label>Package</label>   
<input type="text" name="packagename" placeholder="Enter Package Name" size="15" required /> 
    <button type="submit" class="registerbtn">Book Package</button>  
    </div>   
</form>  
</body>  
</html>  

