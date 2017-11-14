<%@ page isErrorPage="true" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%= exception.getMessage() %>
	<%= out.print("<a href=\"\\/index.jsp\">Return</a>") %>
	<br/>
	<%= exception.getCause().toString() %>
</body>
</html>