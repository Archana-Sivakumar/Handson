package newsletter;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SignUpFormHandlerServlet")
public class SignUpFormHandlerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name="";
		String email="";
		boolean preference = false;
		
		User user=new User();
		user.setName(name);
		user.setEmailAddress(email);
		user.setPreference(preference);
		
	    HttpSession session=request.getSession();  
	    session.setAttribute("userobj",user);  
	    
		RequestDispatcher rd = request.getRequestDispatcher("personal-info.jsp");
		
		rd.forward(request, response);
	}

	

}
