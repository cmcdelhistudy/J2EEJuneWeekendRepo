package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SuccessServlet")
public class SuccessServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String obatinedName = (String) request.getAttribute("USER_NAME");
		Integer obgtainedAge = (Integer) request.getAttribute("USER_AGE");

		boolean obtainedIsMarried = (Boolean) request
				.getAttribute("USER_ISMARRIED");
		double obtainedWt = (Double) request.getAttribute("USER_WEIGHT");

		out.println("<html>");
		out.println("<body bgcolor='yellow'>");

		out.println("Valid user");

		out.println("<h1>Hi ," + obatinedName + " !</h1>");
		out.println(" Your Age : "+obgtainedAge);
		out.println("Your isMarried : "+obtainedIsMarried);
		out.println("Your Weight : "+obtainedWt);

		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
