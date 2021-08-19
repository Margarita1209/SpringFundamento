<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Contador 1</title>
</head>
<body>
	<p>You have visited http://localhost:8080 <c:out value="${clicks}"/> times </p>
	<a href="/">Test another visit?</a>
</body>
</html>