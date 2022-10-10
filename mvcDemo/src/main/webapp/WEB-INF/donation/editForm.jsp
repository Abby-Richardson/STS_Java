<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="/donation/edit/${donation.id}" method="post" modelAttribute="donation">
	<input type="hidden" name="_method" value="put">
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
	<button type="submit">Edit Donation</button>
</form:form>
</body>
</html>