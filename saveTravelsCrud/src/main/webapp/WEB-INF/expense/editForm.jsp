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
<h1 class="text-center">Edit Expense</h1>
<div class="d-flex justify-content-center">
	<form:form action="/expense/edit/${expense.id}" method="post" modelAttribute="expense" class="mb-3 border rounded-3 bg-info text-light p-4">
		<input type="hidden" name="_method" value="put">
			<form:label path="expenseName">Expense Name:</form:label>
			<form:input path="expenseName" type="text" class="form-control mb-3"/>
			<form:errors path="expenseName"/>
			
			<form:label path="vendor">Vendor:</form:label>
			<form:input path="vendor" type="text" class="form-control mb-3"/>
			<form:errors path="vendor"/>
	
			<form:label path="amount">Amount:</form:label>
			<form:input path="amount" type="number" class="form-control mb-3"/>
			<form:errors path="amount"/>

			<form:label path="description">Description:</form:label>
			<form:input path="description" type="text" class="form-control mb-3"/>
			<form:errors path="description"/>
		<div>
			<button type="submit" class="btn btn-success">Edit Expense</button>
		</div>
	</form:form>
</div>
</body>
</html>