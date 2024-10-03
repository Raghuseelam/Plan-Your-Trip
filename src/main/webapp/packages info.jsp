<%@ include file="common/header.jspf"%>
<%@ include file="common/navigator.jspf"%>
<%@ include file="common/footer.jspf"%>
<head>
<style>
body {
	font-family: 'Lato', Verdana, sans-serif;
	background: url("https://cdn.pixabay.com/photo/2015/01/28/23/10/mosque-615415_960_720.jpg")
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
  background-color: #D6EEEE;
}
tr:nth-child(odd) {
  background-color: #EE82EE;
}
</style>
</head>
<h3 align="middle">packages info</h3>
<div class="container">
	<table class="table table-striped">
		<thead>
			<tr>
			    <th>id</th>
				<th>Packages</th>
				<th>Days</th>
				<th>Price</th>
				<th>providings</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${packages}" var="packagee">
				<tr>
				 <td>${packagee.id}</td>
					<td>${packagee.name}</td>
					<td>${packagee.days}</td>
					<td>${packagee.price}</td>
					<td>${packagee.inclusion}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>