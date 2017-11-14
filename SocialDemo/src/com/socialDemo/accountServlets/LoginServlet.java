package com.socialDemo.accountServlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.socialDemo.bean.JDBCDatabase;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = -2705801692151985294L;

//	private static final String USER = "jon";
//	private static final String PASS = "jon";
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String userName = req.getParameter("username");
		String password = req.getParameter("password");
		
		if(isValidCredetials(userName, password)) {
			HttpSession session = req.getSession();
			session.setAttribute("username", userName);
			session.setAttribute("isLoggedIn", true);
			session.setMaxInactiveInterval(30);
			
			res.sendRedirect("profile");
		}else {
			res.setContentType("text/html");
			res.getWriter().print("Not logged in yet \n"
					+ "<a href=\"index.jsp\">Return</a>");
			throw new ServletException();
		}
		
	}
	public boolean isValidCredetials(String userName, String password) {
		JDBCDatabase database = (JDBCDatabase) getServletContext().getAttribute("database");
		Connection connection = database.getConnection();
		
		try {
			PreparedStatement prep = connection.prepareStatement("SELECT * FROM logins WHERE "
					+ "username=? AND password=?");
			prep.setString(1, userName);
			prep.setString(2, password);
			
			ResultSet resultSet = prep.executeQuery();
			
			return resultSet.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
