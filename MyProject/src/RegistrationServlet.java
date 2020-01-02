
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Registration;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	List<Registration> registerList = new ArrayList<Registration>();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String dateBirth = request.getParameter("date");
		String age = request.getParameter("number");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String[] hobbies = request.getParameterValues("hobby");
		String address = request.getParameter("address");
		String country = request.getParameter("country");

		Registration reg = new Registration(firstName, lastName, dateBirth, age, gender, email, contact, hobbies,
				address, country);

		/*
		 * reg.setFirstName(firstName); reg.setLastName(lastName);
		 * reg.setDateOfBirth(dateBirth); reg.setAge(age); reg.setGender(gender);
		 * reg.setEmailId(email); reg.setContactNo(contact); reg.setHobbies(hobbies);
		 * reg.setAddress(address); reg.setCountry(country);
		 */

		registerList.add(reg);

		RequestDispatcher rd = request.getRequestDispatcher("Registerjstl.jsp");

		request.setAttribute("regList", registerList);

		rd.forward(request, response);

		// for(int i=0;i<registerList.size();i++ ) {
		// System.out.println(registerList.get(i));
		// }
		// System.out.println("******************");

	}

}
