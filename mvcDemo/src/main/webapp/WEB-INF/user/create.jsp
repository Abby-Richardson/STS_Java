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
<title>Create New User</title>
</head>
<body>
	<h1>Create a new user</h1>
	<form:form action="/user/create" modelAttribute = "user" method="post">
		<div>
			<form:label path="userName">User Name:</form:label>
			<form:input type="text" path="userName"/>
			<form:errors path="userName" class="text-danger"/>
		</div>
		<div>
			<form:label path="email">Email:</form:label>
			<form:input type="text" path="email"/>
			<form:errors path="email" class="text-danger"/>
		</div>
		<input type="submit" value="Create User">
	</form:form>
</body>
