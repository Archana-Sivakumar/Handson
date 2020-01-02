
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String num1 = request.getParameter("fnum");
		String num2 = request.getParameter("snum");

		int firstNum = Integer.parseInt(num1);
		int secondNum = Integer.parseInt(num2);
		int sum = firstNum + secondNum;

		// RequestDispatcher rd = request.getRequestDispatcher("OutputServlet");
		RequestDispatcher rd = request.getRequestDispatcher("DisplayOutput.jsp");
		request.setAttribute("number1", firstNum);
		request.setAttribute("number2", secondNum);
		request.setAttribute("result", sum);
		rd.forward(request, response);

		// response.sendRedirect("OutputServlet");
	}

}
