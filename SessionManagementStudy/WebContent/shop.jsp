<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="java.util.ArrayList,model.Product" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
#myCart{
		background-color: white;
		border-color: maroon;
		border-width: 5px;
		border-style: dashed;
		float: right;
}
</style>
</head>
<body
	bgcolor="cyan">

	
	
	
		<%
			HttpSession ses = request.getSession(false);

			String code = (String) ses.getAttribute("S3CRET");

			if (code == null) {
				out.println("You are not within the session .Please Login");
			} else {

				String u=(String)ses.getAttribute("USERNAME");
				
				%>

				<div align="center">Hi,<% out.println(u);%></div>
			
			
	<br>
	<br>
					<h1>Start Shoping</h1>
						
						<div id="myCart">
								<h3>Purchased Items</h3>
								<%  
								double totalPrice=0;
								ArrayList<Product> myTrolley = (ArrayList<Product>) ses
								.getAttribute("TROLLEY");
								
								for(Product p:myTrolley){
									out.println("<br> "+p.name+"    Rs."+p.price);
									totalPrice=totalPrice+p.price;
								}
								
								out.println("<h3> Total Amount Rs. "+totalPrice+"</h3>");
								%>
					
						
						</div>
						
						
						
						<a href="settings.jsp"> Settings</a><br>
						<a href="mypage.jsp"> Profile Pge</a>
						<br>
						<center>
						<img width="150" height="150" src="images/car.jpg" alt="Car"/>
						<a href="PurchaseServlet?id=1">Buy</a>
						<br>
						<img width="150" height="150"  src="images/milk.jpg" alt="Milk"/>
						<a href="PurchaseServlet?id=2">Buy</a> <br>
						<img width="150" height="150"  src="images/pastries.jpg" alt="Pastries"/>
						<a href="PurchaseServlet?id=3">Buy</a>
						<br>
						<img  width="150" height="150" src="images/veg.jpg" alt="Veg"/>
						<a href="PurchaseServlet?id=4">Buy</a>
						<br>
						</center>
						<br>
									<br>
									<br>
					<a href="LogoutServlet">Logout</a>



			<% 				
				

			}
	
	
			%>
	
	
	
	
	
	
	
	
	
	
	
	
	

</body>
</html>