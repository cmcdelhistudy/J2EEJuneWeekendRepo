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

/**
 * Servlet implementation class PageCounterServlet
 */
@WebServlet("/PageCounterServlet")
public class PageCounterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");

		// /get the cookies
		Cookie[] allCookies = request.getCookies();
		// check for null
		if (allCookies == null) {
			// then user came for first time
			out.println("You viisted us for the first time ");
			// create a fresh cookie and add it to response
			Cookie counterCookie = new Cookie("COUNTER", "2");
			counterCookie.setMaxAge(1800000);
			response.addCookie(counterCookie);

			Cookie visitingDate = new Cookie("VISITING_DATE",
					new Date().toString());
			visitingDate.setMaxAge(1800000);
			response.addCookie(visitingDate);

		}// if null
		else {
			// else came nth time

			for (Cookie c : allCookies) {

				if (c.getName().equals("COUNTER")) {
					String val = c.getValue();
					out.println("You visited us <h1>" + val + "</h1> times");
					int x = Integer.parseInt(val);
					x++;
					// update the old cookies
					Cookie counterCookie = new Cookie("COUNTER", x + "");
					counterCookie.setMaxAge(1800000);
					response.addCookie(counterCookie);

				}

				if (c.getName().equals("VISITING_DATE")) {
					String dv = c.getValue();
					out.println("<br>Last Visit Date : " + dv);
					// update the old cookie

					Cookie visitingDate = new Cookie("VISITING_DATE",
							new Date().toString());
					visitingDate.setMaxAge(1800000);
					response.addCookie(visitingDate);

				}

			}

		}

		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
