<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
		int a = 4;
	
		int factorial(int n) {
			int f = 1;
			for(int i = 2; i <= n; i++) {
				f *= i;
			}
			return f;
		}
	%>
	
	<%
		out.println("a = " + a + "<br />");
		out.println("factorial = " + factorial(a) + "<br />");
	%>
</body>
</html>