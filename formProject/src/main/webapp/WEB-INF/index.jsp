<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<meta charset="UTF-8">
<title>Omikuji</title>
</head>
<body class="bg-primary">
	<h1 class="text-center my-3 text-light">Send an Omikuji!</h1>
	<div class="d-flex justify-content-center">
		<form action="/omikuji/form" method="POST" class="mb-3 border rounded-3 bg-info text-light p-4">
			<label>Pick any number from 5 to 25:</label>
			<input type="number" name="number" class="form-control mb-3"/>
			<label>Enter the name of any city:</label>
			<input type="text" name="city" class="form-control mb-3"/>
			<label>Enter the name of any real person:</label>
			<input type="text" name="name" class="form-control mb-3"/>
			<label>Enter a professional endeavor or hobby:</label>
			<input type="text" name="hobby" class="form-control mb-3"/>
			<label>Enter any type of living thing:</label>
			<input type="text" name="thing" class="form-control mb-3"/>
			<label>Say something nice to someone:</label>
			<textarea name="something" id="something" cols="30" rows="10" class="form-control"></textarea>
			<label>Send and show a friend!</label>
			<input type="submit" value="Send" class="btn btn-primary mt-5 mx-5" />
		</form>
	</div>
</body>
</html>