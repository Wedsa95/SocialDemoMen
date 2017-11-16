<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<style><%@include file="/resources/css/default.css"%></style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demo Man Profile</title>
</head>
<body>
	<p>
	
		Hi! <%= session.getAttribute("username") %> <a href="/SocialDemo/index.jsp">${username}</a>
	</p>
	<p>
		password: <%= session.getAttribute("isLoggedIn") %>
	</p>
</body>
</html>