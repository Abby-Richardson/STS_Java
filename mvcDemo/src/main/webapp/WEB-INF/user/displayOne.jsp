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
<title>Insert title here</title>
</head>
<body>
	<h1>User Details</h1>
	<h3>User Name: <c:out value="${user.userName}"/></h3>
	<h3>Email: <c:out value="${user.email}"/></h3>
	<h3>All the users donations</h3>
	<table class="table table-info border">
		<thead>
			<tr>
				<th>Id</th>
				<th>Donation</th>
				<th>Quantity</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="donation" items="${user.donations}">
			<tr>
				<td>${donation.id}</td>
				<td><c:out value="${donation.donationName}"/></td>
				<td><c:out value="${donation.quantity}"/></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>