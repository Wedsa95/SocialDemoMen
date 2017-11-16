package com.socialDemo.managedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="inLoggController")
public class InloggController {

	private String userName;
	private String password;
	
	public InloggController() {
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
