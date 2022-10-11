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
<title>Dashboard</title>
</head>
<body>
<h1>Welcome to the dashboard page</h1>
	<a href="/user/create" class="btn btn-primary">Add A User</a>
	<a href="/donation/new" class="btn btn-success">Add A Donation</a>
	<div>
		<table class="table table-info border">
			<thead>
				<tr>
					<th>Id</th>
					<th>Donation</th>
					<th>Quantity</th>
					<th>Donor</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="donation" items="${allDonations}">
				<tr>
					<td>${donation.id}</td>
					<td><c:out value="${donation.donationName}"/></td>
					<td><c:out value="${donation.quantity}"/></td>
					<td><c:out value="${donation.donor.userName}"/></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		
		<h1>All the Donors</h1>
		<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>UserName</th>
					<th>Email</th>
					<th>Number of Donations</th>
				</tr>			
			</thead>
			<tbody>
				<c:forEach var="user" items="${allUsers}">
					<tr>
						<td>${user.id}</td>
						<td><a href="user/display/${user.id}"><c:out value="${user.userName}"/></a></td>
						<td><c:out value="${user.email}"/></td>
						<td>${user.donations.size()}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	
	</div>
</body>
</html>