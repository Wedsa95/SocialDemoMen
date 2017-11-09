package com.socialDemo.loginServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = -2705801692151985294L;
	
	private static final String USER = "jon";
	private static final String PASS = "jon";
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String userName = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(userName.equals(USER) && password.equals(PASS)) {
			HttpSession session = req.getSession();
			session.setAttribute("username", userName);
			session.setAttribute("isLoggedIn", true);
			session.setMaxInactiveInterval(30);
			res.sendRedirect("profile");
		}else {
			res.setContentType("text/html");
			res.getWriter().print("Not logged in yet \n"
					+ "<a href=\"index.jsp\">Return</a>");
		}
		
			
			
			
//			req.setAttribute("username", userName);
//			req.setAttribute("password", password);
			
		
		
	}

}
