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
<title>Dojos and Ninjas</title>
</head>
<body class="m-5">
	<div class="d-flex justify-content-end">
		<a href="/dashboard" class="btn btn-primary mb-3">Back to Dashboard</a>
	</div>
	<div class="m-5 d-flex justify-content-center">
		<form:form action="/dojo/create" modelAttribute="dojo" method="post" class="mb-3 border rounded-3 bg-info text-light p-4">
			<h1>Add a New Dojo</h1>
			<div>
				<form:label path="name">Name:</form:label>
				<form:input type="text" path="name" class="form-control"/>
				<form:errors path="name"/>
			</div>
			<input type="submit" value="Create Dojo" class="btn btn-primary mt-4"/>
		</form:form>
	</div>
</body>
</html>