<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" 
	href="/webjars/bootstrap/css/bootstrap.min.css" />
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
	<form:form action="/donation/new" method="post" modelAttribute="donation">
		<div>	
			<form:label path="donationName">Donation Name:</form:label>
			<form:input path="donationName" type="text"/>
			<form:errors path="donationName"/>
		</div>
		<div>	
			<form:label path="quantity">Quantity:</form:label>
			<form:input path="quantity" type="number"/>
			<form:errors path="quantity"/>
		</div>
		<div>	
			<form:label path="donor">Donor:</form:label>
			<form:input path="donor" type="text"/>
			<form:errors path="donor"/>
		</div>
		<button type="submit">Create Donation</button>
	</form:form>
</body>
</html>