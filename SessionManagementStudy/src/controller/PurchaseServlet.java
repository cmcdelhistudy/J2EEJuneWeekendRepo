package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Product;

@WebServlet("/PurchaseServlet")
public class PurchaseServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		HttpSession ses = request.getSession(false);

		if (ses != null) {
			String code = (String) ses.getAttribute("S3CRET");

			if (code == null) {
				out.println("You are not within the session .Please Login");
			} else {

				String id = request.getParameter("id");

				ArrayList<Product> myTrolley = (ArrayList<Product>) ses
						.getAttribute("TROLLEY");

				if (id.equals("1")) {
					Product car = new Product(1, "Red Car", 100,
							"The cool red car");
					myTrolley.add(car);
				} else if (id.equals("2")) {

					Product milk = new Product(2, "Mother Dairy", 20,
							"The healthy   .. .");
					myTrolley.add(milk);
				} else if (id.equals("3")) {

					Product pastries = new Product(3, "Pastries", 30,
							"Vanilla Fav .. .. .");
					myTrolley.add(pastries);
				} else if (id.equals("4")) {

					Product vegg = new Product(4, "Fresh Veggies", 5,
							"Fresh. . . ");
					myTrolley.add(vegg);
				}

				request.getRequestDispatcher("shop.jsp").forward(request,
						response);

			}
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
