package com.socialDemo.managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name ="greatings",eager = true)
@RequestScoped
public class GreatingsTravler {

	@ManagedProperty(value ="#{message}")
	private Message messageBean;
	
	private String message;
	
	public GreatingsTravler() {
	}
	public String getMessage() {
		if(messageBean != null) {
			message = messageBean.getMessage();
		}
		return message;
	}
	public void setMessageBean(Message message) {
		this.messageBean = message;
	}
	public Message getMessageBean() {
		return messageBean;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
