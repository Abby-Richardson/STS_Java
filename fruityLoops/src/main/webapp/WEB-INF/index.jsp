<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Dojo Fruits</title>
</head>
<body class="p-5">
	<h1 class="text-info">Fruit Store</h1>
	<table class="table table-bordered table-info">
		<thead>
			<tr>
				<th><h3>Name</h3></th>
				<th><h3>Price</h3></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="oneFruit" items="${fruit}">
			<tr>
				<th><c:out value="${oneFruit.name}"></c:out></th>
				<th><c:out value="${oneFruit.price}"></c:out></th>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>