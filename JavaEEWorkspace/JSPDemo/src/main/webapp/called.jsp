<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Called Page</h3>
	
	p1 = ${param.p1}
	<p></p>
	p2 = ${param.p2}
	<p></p>
	p3 = ${param.p3}
	<p></p>
	Color = ${requestScope.color}
	<p></p>
	Hobby = ${sessionScope.hobby}
	<p></p>
	Hero = ${applicationScope.hero}
	
</body>
</html>