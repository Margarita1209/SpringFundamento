<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="css/Style.css">
 		<script type="text/javascript" src="js/js.js"></script>
		<title>Date</title>
	</head>
	<body>
		<script>alertDate();</script>
		<h2 id="Date"><c:out value="${fecha}"/></h2>
		<a href="/">Home</a>	
	</body>
</html>