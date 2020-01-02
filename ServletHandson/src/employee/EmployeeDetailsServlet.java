package employee;


import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeDetailsServlet")
public class EmployeeDetailsServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] department = {"Information Technology", "Manufacturing", "Finance", "Testing"};
		Employee emp = new Employee(969143L, "John","Male","8/7/1987","Yes", department,120000L);
		RequestDispatcher rd = request.getRequestDispatcher("EditEmployee.jsp");

		request.setAttribute("emp", emp);
		
		rd.forward(request, response);
		
	}

}
