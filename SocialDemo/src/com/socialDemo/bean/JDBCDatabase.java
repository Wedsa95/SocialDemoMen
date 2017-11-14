package com.socialDemo.bean;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDatabase {

	private Connection connection;
	
	public JDBCDatabase() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/SocialDemo";
			
			this.connection = DriverManager.getConnection(url,"root","");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return this.connection;
	}
}
