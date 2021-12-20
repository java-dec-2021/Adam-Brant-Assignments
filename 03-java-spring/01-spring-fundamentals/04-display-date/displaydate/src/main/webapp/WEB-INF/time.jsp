<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Current Time</title>
<link rel="stylesheet" href="../css/style.css">
<script src="../static/js/main.js"></script>
</head>
<body>
	<script>timeAlert()</script>
	<p id = "time"><fmt:formatDate pattern="h:mm a" value="${time}"/></p>
</body>
</html>