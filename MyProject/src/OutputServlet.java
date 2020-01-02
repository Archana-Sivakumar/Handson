
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OutputServlet
 */
@WebServlet("/OutputServlet")
public class OutputServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		int n1 = (int) request.getAttribute("number1");
		int n2 = (int) request.getAttribute("number2");
		int n3 = (int) request.getAttribute("result");
		pw.println("The sum of " + n1 + " and " + n2 + " is: " + n3);
	}

}
