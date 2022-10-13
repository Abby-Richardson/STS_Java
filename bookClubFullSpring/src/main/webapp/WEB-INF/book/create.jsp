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
<title>Add a book</title>
</head>
<body>
	<div>
		<div class="m-5">
			<h1>Add a book to your shelf!</h1>
			<a href="/dashboard">Back to the shelves</a>
		</div>
		<div class="container">
			<form:form action="/book/new" modelAttribute= "book" method= "post">
				<form:input type="hidden" path="user" value="${user_id}"/>
					<div>
						<form:label path="title">Title:</form:label>
						<form:errors path="title" class="text-danger"/>	
						<form:input type="text" path="title" class="form-control mb-3"/>
					</div>
					<div>
						<form:label path="authorName">Author:</form:label>
						<form:errors path="authorName" class="text-danger"/>
						<form:input type="text" path="authorName" class="form-control mb-3"/>
					</div>
					<div>
						<form:label path="description">My thoughts:</form:label>
						<form:errors path="description" class="text-danger"/>
						<form:input type="text" path="description" class="form-control mb-3"/>	
					</div>
					<input type="submit" value="Submit" class="btn btn-success"/>
			</form:form>
		</div>
	</div>
</body>
</html>