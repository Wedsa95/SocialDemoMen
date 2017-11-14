package com.socialDemo.filers;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet Filter implementation class AuthFilter
 */
@WebFilter(urlPatterns="/profile", description="Auth Filter")
public class AuthFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthFilter() {
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		HttpSession session = req.getSession();
		
		Object isLoggedIn =  session.getAttribute("isLoggedIn");
		
		if(isLoggedIn != null && (boolean) isLoggedIn) {
			
			chain.doFilter(req, res);
			
//			String userName = (String) session.getAttribute("username");
//			request.setAttribute("username", userName);
//			req.getRequestDispatcher("/WEB-INF/profile.jsp").forward(req, res);

		}else {
			res.sendRedirect("index.jsp?error= \"WrongCredentials\"");
		}
		
		
	}
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
