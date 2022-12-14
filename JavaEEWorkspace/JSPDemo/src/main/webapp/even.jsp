<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Even Odd</title>
</head>
<body>

	<form>
		<div>
			<label>Enter number: </label>
			<input type="text" size=10 name="num" />
		</div>
		<div>
			<button>Check</button>
		</div>
	</form>
	
	<%
		
		String numStr = request.getParameter("num");
		
		if (numStr != null) {
			int num = Integer.parseInt(numStr);
			
			if (num%2 == 0)
				out.println(num + " is even");
			else
				out.println(num + " is odd");
		} 
	%>
</body>
</html>