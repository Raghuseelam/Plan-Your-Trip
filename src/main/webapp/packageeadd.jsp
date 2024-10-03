<%@ include file="common/header.jspf"%>
<%@ include file="common/navigator.jspf"%>
<%@ include file="common/footer.jspf"%>
<html>  
<head>  
<meta name="viewport" content="width=device-width, initial-scale=1">  
<style>  
body{  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: url("http://chitrahandicraft.com/wp-content/uploads/2019/02/login-page-background-images-hd-10.jpg");  
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
<form action="/packageeadd" method="post">
  <div class="container">  
  <center>  <h1>Add Or modify Package</h1> </center>  
  <hr>  
  <label> Package Id </label>
  <br>   
<input type="number" name="id" placeholder= "Enter Id number" size="15" required /> 
<br>  
  <label> Package Name </label>   
<input type="text" name="name" placeholder= "Enter Package Name" size="15" required />   
<label>Number of days </label>   
<input type="text" name="days" placeholder="Enter Number of days" size="15" required />   
 <label>Enter price Amount </label>   
 <br>
<input type="number" name="price" placeholder="Enter price" size="15" required />   
<br>
   <label>Inclusion</label>   
<input type="text" name="inclusion" placeholder="Enter Inclusion data" size="15" required /> 
    <button type="submit" class="registerbtn">Add Package</button>  
    </div>   
</form>
  <form action="/packageeadd" method="post">
  <div class="container">  
  <center>  <h1>Delete Package</h1> </center>  
  <hr>  
   <label> Package Id </label>   
   <br>
<input type="number" name="id" placeholder= "Enter Id number size="15" required />   
  <button type="submit" class="registerbtn">Delete Package</button>  
    </div>
  </form>
</body>  
</html>  