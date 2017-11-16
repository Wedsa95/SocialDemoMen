package com.socialDemo.managedBeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class NavigationsController {
	
	private List<String> navigationNameOptions;
	private List<String> navigationLinkOptions;
	
	public NavigationsController() {
		navigationNameOptions = new ArrayList<>();
		navigationLinkOptions = new ArrayList<>();
		
		navigationNameOptions.add("Home");
		navigationNameOptions.add("Profile");
		navigationNameOptions.add("Chat");
		navigationNameOptions.add("Help");
		
		navigationLinkOptions.add("index.xhtml");
		navigationLinkOptions.add("profile.xhtml");
		navigationLinkOptions.add("conversations.xhtml");
		navigationLinkOptions.add("help.xhtml");
	}
	
	

}
