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
<title>Save Travels</title>
</head>
<body class="m-5">
<h1 class="text-center">Add a New Expense</h1>
<div class="d-flex justify-content-center">
	<form:form action="/expense/new" method="post" modelAttribute="expense" class="mb-3 border rounded-3 bg-info text-light p-4">
		<form:label path="expenseName">Expense Name:</form:label>
		<form:errors path="expenseName" class="text-danger"/>
		<form:input path="expenseName" type="text" class="form-control mb-3"/>
		
		<form:label path="vendor">Vendor:</form:label>
		<form:errors path="vendor" class="text-danger"/>
		<form:input path="vendor" type="text" class="form-control mb-3"/>
		
		<form:label path="amount">Amount:</form:label>
		<form:errors path="amount" class="text-danger"/>
		<form:input path="amount" type="text" class="form-control mb-3"/>

		<form:label path="description">Description:</form:label>
		<form:errors path="description" class="text-danger"/>
		<form:input path="description" type="text" class="form-control mb-3"/>
	<div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</div>
	</form:form>
</div>
</body>
</html>