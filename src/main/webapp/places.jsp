<%@ include file="common/header.jspf"%>
<%@ include file="common/navigator.jspf"%>
<%@ include file="common/footer.jspf"%>
<form action="/places" method="post">
	<label for="places">package name</label> 
	<input type="text" id="pays" name="places"><br></br>
	<input type="submit" value="Submit"><br>
		
</form>

<br>
<br>
<h3 align="middle">Details:</h3>
<div class="container">
	<table class="table table-stripend">
		<thead>
			<tr>

				<th>NAME</th>
				<th>PRICE</th>
				<th>BEST MONTH</th>
			</tr>
		</thead>
		<tbody>
			<tr>

				<td>${place.name}</td>
				<td>${place.price}</td>
				<td>${place.bestTime}</td>
			</tr>
		</tbody>
	</table>
</div>