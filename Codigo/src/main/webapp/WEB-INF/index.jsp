<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Home</title>
</head>
<body>
<h1>What is the code?</h1>
	<p style="color:red;"><c:out value="${error}"/></p>
	<form method="post" action="/">
    	<h2>What is the code?</h2>
    	<input type="text" name="code">
    	<button>Try code</button>
	</form>

</body>
</html>