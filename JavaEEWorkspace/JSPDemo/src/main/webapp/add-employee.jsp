<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="employee" class="in.cms.bean.Employee" />
	<jsp:setProperty name="employee" property="*" />
	<hr />
	
	<p>Id: <em>${employee.id}</em></p>
	<p>Name: <strong>${employee.name}</strong></p>
	<p>Salary: ${employee.salary}</p>
</body>
</html>