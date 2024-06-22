<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REST Demo Page</title>
</head>
<body>
Spring REST DEMO Page
<br>
<a href="${pageContext.request.contextPath}/test/hello">Navigate to Rest Controller</a>
<br>
<a href="${pageContext.request.contextPath}/api/students">Student List</a>
</body>
</html>