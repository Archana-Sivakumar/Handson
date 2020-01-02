package newsletter;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/PersonalInformationHandlerServlet")
public class PersonalInformationHandlerServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();  
        User userobj=(User)session.getAttribute("userobj");  
        
        String name = request.getParameter("username");
        String email = request.getParameter("email");
        userobj.setName(name);
        userobj.setEmailAddress(email);
        
        RequestDispatcher rd = request.getRequestDispatcher("preference.jsp");
		
		rd.forward(request, response);
	}

}
