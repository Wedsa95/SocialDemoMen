package com.socialDemo.model.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;


@SessionScoped
@Named
public class UserManager implements Serializable{

	private static final long serialVersionUID = 3160567202543518276L;
	private User currentUser;
	
	
	public User getCurrentUser() {
		return currentUser;
	}
	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

	public String SignIn(String userName, String password) {
		if(userName.equals("123") && password.equals("123")) {
			
			currentUser = new User(userName);
			return "profile?faces-redirect=true";
		}else {
			FacesMessage message = new FacesMessage("Invalid credentials");
			FacesContext context = FacesContext.getCurrentInstance();
			
			context.addMessage(null, message);
			return "index";
		}
	}
	public boolean isSignedIn() {
		return currentUser != null;
	}
	public String signout() {
		FacesContext.getCurrentInstance()
		.getExternalContext().invalidateSession();
		
		//När en session förstörs så  gör den det först efter att 
		//andvändaren har fått tillbaka sin response
		//med ?faces-redirect=true tvingar andvänaren 
		// att ladda om index
		return "index?faces-redirect=true";
	}
}
