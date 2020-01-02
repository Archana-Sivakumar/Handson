package servletfilter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class ApplicationLogFilter
 */
@WebFilter(servletNames = {"servletfilter.AdminServlet", "servletfilter.UserServlet"})
public class ApplicationLogFilter implements Filter {

    
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 HttpServletRequest req = (HttpServletRequest) request;
		    HttpServletResponse resp = (HttpServletResponse) response;
		    String name =  req.getServletPath();
		    System.out.println( name +  "Invoked");
		  	chain.doFilter(req, resp);
		  	
	}

	

}
