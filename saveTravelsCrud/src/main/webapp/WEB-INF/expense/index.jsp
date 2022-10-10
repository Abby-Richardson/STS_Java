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
<body class="container mt-5">
<h1>Show all Expenses</h1>
<table class="table table-info border">
	<thead>
	<tr>
		<th>Expense</th>
		<th>Vendor</th>
		<th>Amount</th>
		<th>Actions</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="expense" items="${allExpenses}">
		<tr>
			<td><a href="/expense/show/${expense.id }"><c:out value="${expense.expenseName}"/></a></td>
			<td><c:out value="${expense.vendor}"/></td>
			<td><c:out value="${expense.amount}"/></td>
			<td class="d-flex">
				<a class="btn btn-info" href="/expense/edit/${expense.id}">Edit</a>
				<form action="/expense/delete/${expense.id}" method="post" class="mx-3">
				    <input type="hidden" name="_method" value="delete">
				    <input class="btn btn-danger" type="submit" value="Delete">
				</form>
			</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
<a href="/expense/new" class="btn btn-primary">Add New Expense</a>

</body>
</html>