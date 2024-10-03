<%@ include file="common/header.jspf"%>
<%@ include file="common/navigator.jspf"%>
<%@ include file="common/footer.jspf"%>
<head>
<style>
body {
	font-family: 'Lato', Verdana, sans-serif;
	background: url("https://cdn.pixabay.com/photo/2016/10/18/08/13/travel-1749508_960_720.jpg")
		center/cover fixed;
}
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #FF33FC;
}
tr:nth-child(odd) {
  background-color: #FF337A;
</style>
</head>
<h3 style="background-color:light gray" align="middle">DETAILS OF ALL USERS :</h3>
<div class="container">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>mail</th>
				<th>phone</th>
				<th>name</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${users}" var="user">
				<tr>
					<td>${user.emailId}</td>
					<td>${user.phnNum}</td>
					<td>${user.userName}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>