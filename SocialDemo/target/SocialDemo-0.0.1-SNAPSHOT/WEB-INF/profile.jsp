<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style><%@include file="css/mainStyle.css"%></style>
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