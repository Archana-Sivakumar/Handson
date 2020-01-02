

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import employee.Employee;

/**
 * Servlet implementation class DisplayEmployeeServlet
 */
@WebServlet("/DisplayEmployeeServlet")
public class DisplayEmployeeServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("empId");
		
		String name = request.getParameter("empname");
		String gender = request.getParameter("gender");
		String dateBirth = request.getParameter("date");
		String fulltimeEmp = request.getParameter("fulltime");
		String department = request.getParameter("department");
		String salary = request.getParameter("salary");
		long newSalary = Long.parseLong(salary);
		
		RequestDispatcher rd = request.getRequestDispatcher("EmployeeVerify.jsp");

		request.setAttribute("id",id);
		request.setAttribute("name",name);
		request.setAttribute("gender",gender);
		request.setAttribute("dateBirth",dateBirth);
		request.setAttribute("fulltimeEmp",fulltimeEmp);
		request.setAttribute("department",department);
		request.setAttribute("newSalary",newSalary);
		
		rd.forward(request, response);

		
	}

}
