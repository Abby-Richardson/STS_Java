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
<title>Donations</title>
</head>
<body>
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