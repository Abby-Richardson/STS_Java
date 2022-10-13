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
<title>Insert title here</title>
</head>
<body>
<div>
	<div class="d-flex p-5">
		<div class="container col-4">
			<h1>Register</h1>
			<form:form action="/user/register" method="post" modelAttribute="newUser">
				<div>
					<label>User Name:</label>
					<form:errors path="userName" class="text-danger"/>
					<form:input path="userName" class="form-control mb-3" />
				</div>
				<div>
					<label>Email:</label>
					<form:errors path="email" class="text-danger"/>
					<form:input path="email" class="form-control mb-3" />
				</div>
				<div>
					<label>Password:</label>
					<form:errors path="password" class="text-danger"/>
					<form:input path="password" type="password" class="form-control mb-3" />
				</div>
				<div>
					<label>Confirm Password:</label>
					<form:errors path="confirm" class="text-danger"/>
					<form:input path="confirm" type="password" class="form-control mb-3" />
				</div>
				<input type="submit" value="Register User" class="btn btn-info"/>
			</form:form>
		</div>
		<div class="container col-4">
			<h1>Login</h1>
			<form:form action="/user/login" method="post" modelAttribute="loginUser">
				<div>
					<label>Email:</label>
					<form:errors path="email" class="text-danger"/>
					<form:input path="email" class="form-control mb-3" />
				</div>
				<div>
					<label>Password:</label>
					<form:errors path="password" class="text-danger"/>
					<form:input path="password" type="password" class="form-control mb-3" />
				</div>
				<input type="submit" value="Login" class="btn btn-success"/>
			</form:form>
		</div>
	</div>
</div>
</body>
</html>