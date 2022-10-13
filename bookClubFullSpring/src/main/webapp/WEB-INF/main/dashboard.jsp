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
	<div class="m-5">
		<div class="d-flex justify-content-between">
			<div>
				<h1>Welcome, <c:out value="${loggedInUser.userName}"/>!</h1>
			</div>
			<div>
				<a href="/book/new">Add a book to your shelf!</a>
				<a href="/user/logout" class="btn btn-dark mx-5">Logout</a>
			</div>
		</div>
		<div>	
			<table class="table table-info border">
				<thead>
				<tr>
					<th>Id</th>
					<th>Title</th>
					<th>Author Name</th>
					<th>Posted By</th>
					<th>Actions</th>
				</tr>
				</thead>
				<tbody>
				<c:forEach var="book" items="${allBooks}">
					<tr>
						<td><c:out value="${book.id}"/></td>
						<td><a href="/book/display/${book.id}"><c:out value="${book.title}"/></a></td>
						<td><c:out value="${book.authorName}"/></td>
						<td><c:out value="${book.user.userName}"/></td>
						<td class="d-flex">
							<a class="btn btn-info" href="/book/edit/${book.id}">Edit</a>
							<form action="/book/delete/${book.id}" method="post" class="mx-3">
							    <input type="hidden" name="_method" value="delete">
							    <input class="btn btn-danger" type="submit" value="Delete">
							</form>
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>