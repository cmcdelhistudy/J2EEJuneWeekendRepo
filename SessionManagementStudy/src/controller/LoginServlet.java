package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Product;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String uname = request.getParameter("username");
		String upass = request.getParameter("userpass");

		if (upass.equals("123")) {
			// /good

			HttpSession session = request.getSession(true);
			session.setAttribute("S3CRET", "S3CRET");
			session.setAttribute("USERNAME", uname);

			// craeting a array to act as a Trolley

			ArrayList<Product> trolley = new ArrayList<Product>();

			session.setAttribute("TROLLEY", trolley);
			

			RequestDispatcher chitthiGood = request
					.getRequestDispatcher("mypage.jsp");
			chitthiGood.forward(request, response);
		} else {
			// bad

			RequestDispatcher chitthiBad = request
					.getRequestDispatcher("failure.jsp");
			chitthiBad.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
