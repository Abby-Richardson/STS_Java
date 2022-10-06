<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<meta charset="UTF-8">
<title>Omikuji</title>
</head>
<body class="bg-success text-center row justify-content-center p-5">
	<h1 class="text-light mb-5">Here is your Omikuji!</h1>
	<div class="col-5 bg-info text-light p-5 rounded-3">
		<h3>In <c:out value="${number}"/> years, you will live in <c:out 		value="${city}"/> with <c:out value="${name}"/> as your 					roommate, <c:out value="${hobby}"/> for a living. The next time 			you see a <c:out value="${thing}"/>, you will have good luck. 			Also, <c:out value="${something}"/></h3>
		<a href="/omikuji">Go back</a>
	</div>
</body>
</html>