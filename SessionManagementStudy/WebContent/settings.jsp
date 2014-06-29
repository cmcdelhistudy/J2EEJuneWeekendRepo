<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body
	bgcolor="pink">
	<center>
	
	
	
		<%
			HttpSession ses = request.getSession(false);

			String code = (String) ses.getAttribute("S3CRET");

			if (code == null) {
				out.println("You are not within the session .Please Login");
			} else {

				String u=(String)ses.getAttribute("USERNAME");
				
				%>

				<div align="right">Hi,<% out.println(u);%></div>
			
				<h1>Application  Settings</h1>
	<br>
					<a href="mypage.jsp"> Profile Page</a><br>
					<a href="shop.jsp"> Shop Now</a>
<br>
									<br>
									<br>
					<a href="LogoutServlet">Logout</a>


			<% 				
				

			}
	
	
			%>
	
	
	
	
	
	
	</center>

</body>
</html>