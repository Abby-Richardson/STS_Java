<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<meta charset="UTF-8">
<title>Dojos and Ninjas</title>
</head>
<body>
	<form:form action="/ninja/new" method="post" modelAttribute="ninja">
	<div>	
		<form:label path="firstName">First Name:</form:label>
		<form:input path="firstName" type="text"/>
		<form:errors path="firstName"/>
	</div>
	<div>	
		<form:label path="lastName">Last Name:</form:label>
		<form:input path="lastName" type="text"/>
		<form:errors path="lastName"/>
	</div>
	<div>	
		<form:label path="age">Age:</form:label>
		<form:input path="age" type="number"/>
		<form:errors path="age"/>
	</div>
	
	<form:select path="dojo">
		<c:forEach var="dojo" items="${allDojos}">
			<form:option value="${dojo.id}" path="dojo">
				<c:out value="${dojo.name}"/>
			</form:option>
		</c:forEach>
	
	</form:select>
	<button type="submit">Create Ninja</button>
</form:form>
</body>
</html>