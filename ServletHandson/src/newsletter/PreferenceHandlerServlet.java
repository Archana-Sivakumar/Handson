package newsletter;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PreferenceHandlerServlet
 */
@WebServlet("/PreferenceHandlerServlet")
public class PreferenceHandlerServlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();  
        User userobj=(User)session.getAttribute("userobj");  
        
        String preference = request.getParameter("preference");
        boolean prefer= Boolean.parseBoolean(preference);
        userobj.setPreference(prefer);
        
        RequestDispatcher rd = request.getRequestDispatcher("personal-info.jsp");
		
		rd.forward(request, response);
	}

}
