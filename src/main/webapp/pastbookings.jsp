
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigator.jspf"%>
<%@ include file="common/footer.jspf"%>

<head>
<style>
body {
	font-family: 'Lato', Verdana, sans-serif;
	background: url("https://cdn.pixabay.com/photo/2018/08/19/10/16/nature-3616194_960_720.jpgh")
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
  background-color: #9FFF33;
}
tr:nth-child(odd) {
  background-color: #AC33FF;
}
</style>
</head>
<p align="middle">
<form action="/pastbookings" method="post">
	Email ID:<input type="text" name="emailId">
	<input type="submit" value="Submit">
</form>
</p>
<br>
<h3 align="middle">OLD BOOKINGS</h3>
<div class="container">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>id</th>
				<th>userName</th>
				<th>phone number</th>
				<th>EmailId</th>
				<th>package name</th>
				<th>days</th>
				<th>price</th>
				<th>inclusion</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${pastbookings}" var="booking">
				<tr>
					<td>${booking.id}</td>
					<td>${booking.userName}</td>
					<td>${booking.phnNum}</td>
					<td>${booking.emailId}</td>
					<td>${booking.packagename}</td>
					<td>${booking.days}</td>
					<td>${booking.price}</td>
					<td>${booking.inclusion}</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>