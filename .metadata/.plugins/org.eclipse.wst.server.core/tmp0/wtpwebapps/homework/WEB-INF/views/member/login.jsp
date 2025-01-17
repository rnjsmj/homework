<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HOMEWORK</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style>
	div {box-sizing:border-box;} 
	
	#content {
            width:80%;
            margin:auto;
            margin-top:200px;
        }
    
    #loginForm {
    	 background-color:rgb(247, 245, 245);
    	 width:500px;
    	 margin: auto;
    	 padding: 50px;
    }
    
    h2 {
    	margin-bottom:30px;
    }
    
    #msg {
    	text-align:center;
    	padding:10px;
    }
    
    button[type="submit"] {
    	width:100%;
    }

</style>
</head>
<body>
	<div id="content">
		<div id="loginForm">
			<h2>LOGIN</h2>
			<form action="login" method="post">
			  <div class="form-group">
			    <input type="text" class="form-control" id="userId" name="userId" placeholder="ID">
			    
			  </div>
			  <div class="form-group">
			    <input type="password" class="form-control" id="userPwd" name="userPwd" placeholder="Password">
			  </div>
			  <div class="form-group form-check">
			    <input type="checkbox" class="form-check-input" id="exampleCheck1">
			    <label class="form-check-label" for="exampleCheck1">아이디 저장</label>
			  </div>
			  <c:if test="${ not empty sessionScope.loginMsg }">
			  	<small id="msg" class="form-text text-muted">${loginMsg }</small>
			  </c:if>
			  <button type="submit" class="btn btn-primary">LOGIN</button>
			</form>
		</div>
	</div>
</body>
</html>