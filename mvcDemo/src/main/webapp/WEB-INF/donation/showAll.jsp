<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
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
<h1>Show all donations</h1>
<table>
	<thead>
	<tr>
		<th>Donation</th>
		<th>Quantity</th>
		<th>Donor</th>
		<th>Actions</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="donation" items="${allDonations}">
		<tr>
			<td><a href="/donation/show/${donation.id }"><c:out value="${donation.donationName}"/></a></td>
			<td><c:out value="${donation.quantity}"/></td>
			<td><c:out value="${donation.donor}"/></td>
			<td class="d-flex">
				<a class="btn btn-success" href="/donation/edit/${donation.id}">Edit</a>
				<form action="/donation/delete/${donation.id}" method="post">
				    <input type="hidden" name="_method" value="delete">
				    <input class="btn btn-danger" type="submit" value="Delete">
				</form>
			</td>
			
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>