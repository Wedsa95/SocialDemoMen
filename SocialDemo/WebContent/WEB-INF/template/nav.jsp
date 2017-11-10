<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nav</title>
</head>
<body>

	<nav>
		<jsp:useBean id="navigationBar" class="com.socialDemo.bean.Navigation">
			<c:forEach items="${navigationBar.items}" var="item">
				<label><a href="${item.path}">${item.name}</a></label>
			</c:forEach>
		</jsp:useBean>
		<%= session.getAttribute("username") %>
	<form action="login" method="POST">
		
			UserName: <input type="text" name="username"/>
			Password: <input type="password" name="password"/>
			<input type="submit" value="Sam Sara" />
		
	</form>
	</nav>
	
</body>
</html>