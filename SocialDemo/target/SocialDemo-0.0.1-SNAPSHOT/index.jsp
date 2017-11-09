<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style><%@include file="WEB-INF/css/mainStyle.css"%></style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Social Demo Men</title>
</head>
<body>
	<jsp:include page="/WEB-INF/template/header.jsp"></jsp:include>
	
	<jsp:include page="/WEB-INF/template/nav.jsp"></jsp:include>
	
	<article>
		This is the h
		<br/>
			<form action="login" method="POST">
			<p>
				UserName: <input type="text" name="username"/>
				Password: <input type="password" name="password"/>
			</p>
			</form>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
	</article>
	
	<jsp:include page="/WEB-INF/template/footer.jsp"></jsp:include>
</body>
</html>