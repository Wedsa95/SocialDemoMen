package com.socialDemo.loginServlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/profile")
public class ProfileServlet extends HttpServlet{

	private static final long serialVersionUID = 8094608596667156868L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		Object pass = session.getAttribute("isLoggedIn");
		
		if(pass != null && (boolean) pass) {
			String userName = (String) session.getAttribute("username");
			
			req.setAttribute("username", userName);
			
			req.getRequestDispatcher("/WEB-INF/profile.jsp").forward(req, res);
		}else {
			res.setContentType("text/html");
			res.getWriter().print("Not logged in yet \n"
					+ "<a href=\"index.jsp\">Return</a>");
		}
		
//		if(session.isNew()) {
//			session.setAttribute("username", userName);
//			session.setAttribute("password", password);
//			session.setMaxInactiveInterval(90);
//		}
//		req.getRequestDispatcher("/WEB-INF/profile.jsp");
 	}

	
}
