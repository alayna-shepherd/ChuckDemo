<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
	<td>id</td>
	<td>joke</td>
		<c:forEach var="joke" items="${list}">
		<tr>
		<td>${joke.id }</td>
		<td>${joke.joke }</td>
		</tr>
		</c:forEach>
		</tr>
		</table>
		
		
		
</body>
</html>