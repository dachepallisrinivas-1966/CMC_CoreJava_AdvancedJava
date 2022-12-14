<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Caller Page</h2>
	p1 = ${param.p1}
	<p />
	p2 = ${param.p2}
	<p />
	
	<%
		request.setAttribute("color", "red");
		session.setAttribute("hobby", "cricket");
		application.setAttribute("hero", "ranbir singh");
	%>
	
	<jsp:include page="called.jsp">
		<jsp:param name="p3" value="30"></jsp:param>
	</jsp:include>
</body>
</html>