<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Homework</title>
</head>
<body>
<h1>
	메인화면  
</h1>

<ul>
	<c:choose>
		<c:when  test="${empty sessionScope.loginUser }">
			<li><a href="loginForm">로그인</a></li>
		</c:when>
		<c:otherwise>
			<li>${sessionScope.loginUser.userName }님 환영합니다.</li>
			<li><a href="logout">로그아웃</a></li>
		</c:otherwise>
	</c:choose>
	
</ul>


</body>
</html>
