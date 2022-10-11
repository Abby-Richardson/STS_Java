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
<body class="text-center m-5">
	<h1>Welcome to the Dojo and Ninja Dashboard!</h1>
	<a href="/dojo/create" class="btn btn-primary m-4">Add a Dojo</a>
	<a href="/ninja/new" class="btn btn-info">Add a Ninja</a>
	<div>
		<h2>All Dojos</h2>
		<table class="table table-info border">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Number of Ninjas</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="dojo" items="${allDojos}">
				<tr>
					<td>${dojo.id}</td>
					<td><a href="dojo/display/${dojo.id}"><c:out value="${dojo.name}"/></a></td>
					<td>${dojo.ninjas.size()}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
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
			<c:forEach var="ninja" items="${allNinjas}">
				<tr>
					<td>${ninja.id}</td>
					<td><c:out value="${ninja.firstName}"/></td>
					<td><c:out value="${ninja.lastName}"/></td>
					<td><c:out value="${ninja.dojo.name}"/></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>