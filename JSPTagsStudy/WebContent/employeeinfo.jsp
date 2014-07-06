<%@page import="model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Info JSP Page</h1>

	<%
		Employee obtainedEmp = (Employee) request.getAttribute("EMP");
	%>
	<br> Employee Name
	<%=obtainedEmp.getName()%>
	<br>Employee ID
	<%=obtainedEmp.getId()%>
	<br> Employyee Salary
	<%=obtainedEmp.getSalary()%>

	<hr>

	<jsp:useBean id="EMP" scope="request" class="model.Employee" />

	Employee Name :
	<jsp:getProperty property="name" name="EMP" />
	<br> Employee ID :
	<jsp:getProperty property="id" name="EMP" />
	<br> Employee Salary :
	<jsp:getProperty property="salary" name="EMP" />


	<hr>

	<%
		Employee e2 = new Employee();
		e2.setId(4738);
		e2.setName("Larry Page");
		e2.setSalary(200);
	%>

	<jsp:useBean id="emp2" class="model.Employee" scope="request"/>

	
	<jsp:setProperty name="emp2" property="name" value="Seregi Brin"/>
	
	<jsp:setProperty name="emp2" property="id" value="8381"/>
	
	<jsp:setProperty name="emp2" property="salary" value="102"/>
	
	<jsp:forward page="work.jsp"/>
	
	<a href="work.jsp">Go to Another Page </a>
	
	</body>
</html>