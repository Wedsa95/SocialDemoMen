package com.socialDemo.view.form;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.socialDemo.model.bean.UserManager;

@RequestScoped
@Named
public class SignInHandler {

	private String userName;
	private String password;
	
	@Inject
	private UserManager userManger;

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
	public String submit() {
		return userManger.SignIn(userName, password);
	}
}
