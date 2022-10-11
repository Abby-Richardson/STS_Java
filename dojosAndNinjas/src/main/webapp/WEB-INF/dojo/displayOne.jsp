<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<meta charset="UTF-8">
<title>Dojos and Ninjas</title>
</head>
<body class="m-5">
	<div class="d-flex justify-content-between">
		<h1>All Ninjas with <c:out value="${dojo.name}"/> Dojo</h1>
		<a href="/dashboard" class="btn btn-primary mb-3">Back to Dashboard</a>
	</div>
	<table class="table table-info border">
			<thead>
				<tr>
					<th>Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="ninja" items="${dojo.ninjas}">
				<tr>
					<td>${ninja.id}</td>
					<td><c:out value="${ninja.firstName}"/></td>
					<td><c:out value="${ninja.lastName}"/></td>
					<td><c:out value="${ninja.age}"/></td>
					
				</tr>
			</c:forEach>
			</tbody>
		</table>
</body>
</html>