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
<title>Title</title>
</head>
<body>
	<div class="m-5">
		<div class="d-flex justify-content-between">
			<div>
				<h1>Welcome, <c:out value="${loggedInUser.userName}"/>!</h1>
			</div>
			<div>
				<a href="/user/logout" class="btn btn-dark">Logout</a>
			</div>
		</div>
		<h3>This is your dashboard. Nothing to see here yet, stay tuned!</h3>
	</div>
</body>
</html>