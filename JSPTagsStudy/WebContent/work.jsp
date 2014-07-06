<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Work JSP Page</h1>

	<jsp:useBean id="emp2" scope="request" class="model.Employee" />

	Employee Name :
	<jsp:getProperty property="name" name="emp2" />
	<br> Employee ID :
	<jsp:getProperty property="id" name="emp2" />
	<br> Employee Salary :
	<jsp:getProperty property="salary" name="emp2" />


	<hr>

	<%!int x = 12;%>

	<%
		x = x + 12;
	%>

	<%=x%>

	<jsp:declaration>
		int y = 34;
	</jsp:declaration>

	<jsp:scriptlet>
		y=x+5;
	</jsp:scriptlet>

	<jsp:expression>
		y
	</jsp:expression>



</body>
</html>