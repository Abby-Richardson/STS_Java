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
		<div class="d-flex justify-content-between m-5">
			<div>
				<h1 class="text-primary"><c:out value="${book.title}"/></h1>
			</div>
			<div>
				<a href="/dashboard">Back to the shelves</a>
				<a href="/user/logout" class="btn btn-dark mx-5">Logout</a>
			</div>
		</div>
		<div class="m-5">
			<h3><c:out value="${book.user.userName}"/>, read <c:out value="${book.title}"/> by <c:out value="${book.authorName}"/></h3>
			<h4 class="my-5">Here are <c:out value="${book.user.userName}"/>'s thoughts:</h4>
			<hr />
			<h3 class="text-center"><c:out value="${book.description}"/></h3>
			<hr />
		</div>
	</div>
</body>
</html>