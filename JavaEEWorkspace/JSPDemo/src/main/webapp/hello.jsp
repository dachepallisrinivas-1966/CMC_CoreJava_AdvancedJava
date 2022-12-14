<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="java.time.LocalDate, java.time.format.DateTimeFormatter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	h3 {
		color : red;
	}
	h4 {
		color:green
	}
</style>
</head>
<body>
	<h3>
		<%
			LocalDate today = LocalDate.now();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
			out.println(dtf.format(today));
		%>
	</h3>
	<br />
	<h4><%= LocalDate.now() %></h4>
</body>
</html>