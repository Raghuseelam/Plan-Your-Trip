<%@ include file="common/header.jspf"%>
<%@ include file="common/navigator.jspf"%>
<%@ include file="common/footer.jspf"%>
<h3 align="middle">DETAILS OF ALL PLACES</h3>
<div class="container">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>NAME</th>
				<th>PRICE</th>
				<th>BEST TIME</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${places}" var="place">
				<tr>
					<td>${place.name}</td>
					<td>${place.price}</td>
					<td>${place.bestTime}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>