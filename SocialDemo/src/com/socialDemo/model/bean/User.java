package com.socialDemo.model.bean;

// THis Is A POJO
public class User {
	
	private String userName;
	public User(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}