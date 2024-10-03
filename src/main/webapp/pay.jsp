<%@ include file="common/header.jspf"%>
<%@ include file="common/navigator.jspf"%>
<%@ include file="common/footer.jspf"%>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	font-family: 'Lato', Verdana, sans-serif;
	background: url("https://wallpaperaccess.com/full/2028790.jpg")
		center/cover fixed;
}
</style>
<form action="/pay" method="post" id="pays">
<h3 align="middle">Package full details</h3>
	<label for="pays">package name</label> 
	<input type="text" id="pays" name="pays"><br></br>
	<input type="submit" value="Submit"><br>
</form>
<br>
<h3>Package name:${packagee.name}</h3>
<h3>Amount to be paid:${packagee.price}</h3>
<h3>Number of days:${packagee.days}</h3>
<div class="col-50">
            <h5>Payment:All Cards are Accepted</h5>
              </div>

  
              
          

