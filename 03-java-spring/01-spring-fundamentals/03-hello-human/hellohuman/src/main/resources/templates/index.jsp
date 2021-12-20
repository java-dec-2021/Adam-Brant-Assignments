<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<h1>Hello ${ name }  ${ last_name }</h1>
	<c:forEach var="i" begin = "1" end = "${ times }">
		<h1><c:out value="${ name } ${ last_name }"/></h1>
	</c:forEach>
</body>
</html>