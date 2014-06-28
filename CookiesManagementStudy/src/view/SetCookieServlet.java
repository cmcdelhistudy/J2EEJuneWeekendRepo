package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SetCookieServlet")
public class SetCookieServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Cookie c = new Cookie("APP_NAME", "Online Toys  Store");
		response.addCookie(c);

		Cookie dateCookie = new Cookie("DATE_VISITED", new Date().toString());
		response.addCookie(dateCookie);

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");

		out.println("Cookies Added ");

		out.println("</body>");
		out.println("</html>");

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
