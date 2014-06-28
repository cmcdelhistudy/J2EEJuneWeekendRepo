package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AuthenticatorServlet")
public class AuthenticatorServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("username");
		String upass = request.getParameter("userpass");

		if (upass.equals("123")) {
			// /good
			request.setAttribute("USER_NAME", uname);
			request.setAttribute("USER_AGE", 12);
			request.setAttribute("USER_ISMARRIED", false);
			request.setAttribute("USER_WEIGHT", 45.78);
			
			RequestDispatcher chitthiGood = request
					.getRequestDispatcher("SuccessServlet");
			chitthiGood.forward(request, response);
		} else {
			// bad

			RequestDispatcher chitthiBad = request
					.getRequestDispatcher("FailureServlet");
			chitthiBad.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
