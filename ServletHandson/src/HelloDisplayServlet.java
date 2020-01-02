
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloDisplayServlet
 */
@WebServlet("/HelloDisplayServlet")
public class HelloDisplayServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hello World!");
		String userName = request.getParameter("uname");
		System.out.println("Welcome " + userName);
	}

}
