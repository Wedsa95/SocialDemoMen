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

@WebFilter(urlPatterns = {"/*"}, description = "Session Filter")
public class AuthorizationFilter implements Filter{

	private static final String USER = "jon";
	private static final String PASS = "jon";
	
	private FilterConfig filterConfig = null;
	
	@Override
	public void init(FilterConfig inConfig) throws ServletException {
		this.setFilterConfig(inConfig);
		filterConfig.getServletContext().log("Init Session Filter");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;

//		String uri = request.getRequestURI();
//		this.filterConfig.getServletContext().log("Request ::"+ uri);
		
		HttpSession session = request.getSession(false);
		
		if(session == null) {
			response.sendRedirect("login");	
		}else {
			response.sendRedirect("profile");
		}
//		String userName = (String) session.getAttribute("username");
//		String password = (String) session.getAttribute("password");
//
//		if(userName.equals(USER) && password.equals(PASS)) {
//			
//		}
//		if(request.getRequestURI().endsWith("LOGGIN")&&
//				request.getSession().getAttribute("AUTHENTICATED")== null) {
//			
//			response.sendRedirect(request.getContextPath() + "/LOGGIN");
//		}
//		chain.doFilter(req, res);
	}
	
	@Override
	public void destroy() {
		filterConfig.getServletContext().log("Destroying Session Filter");
	}

	public FilterConfig getFilterConfig() {
		return filterConfig;
	}

	public void setFilterConfig(FilterConfig filterConfig) {
		this.filterConfig = filterConfig;
	}
	
}
