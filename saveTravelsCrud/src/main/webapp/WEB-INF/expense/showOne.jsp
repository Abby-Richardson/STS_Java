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
<body class="d-flex justify-content-center bg-light">
	<div class="border bg-info p-4 m-5">
		<div class="d-flex justify-content-between">
			<h1 class="text-success">Expense Details</h1>
			<a href="/expense/all" class=" mt-3 btn btn-light">Go Back</a>
		</div>
		<h4>Expense: <c:out value="${oneExpense.expenseName}"/></h4>
		<h4>Vendor: <c:out value="${oneExpense.vendor}"/></h4>
		<h4>Amount: <c:out value="${oneExpense.amount}"/></h4>
		<h4>Description: <c:out value="${oneExpense.description}"/></h4>
		<h4>Created At: <c:out value="${oneExpense.createdAt}"/></h4>
		<form action="/expense/delete/${oneExpense.id}" method="post">
			<input type="hidden" name="_method" value="delete">
			<input class="btn btn-danger" type="submit" value="Delete">
		</form>	
	</div>
</body>
</html>