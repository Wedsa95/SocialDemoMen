package com.socialDemo.bean;

import java.util.ArrayList;
import java.util.List;

public class NavigationJsp {

	private List<Item> items; 
	
	public NavigationJsp() {
		items = new ArrayList<>();
		items.add(new Item("Profile" ,"profile"));
		items.add(new Item("Home" ,"home.jsp"));
		items.add(new Item("Conversation" ,"convers.jsp"));
		items.add(new Item("Help" ,"help.jsp"));
	}
	

	public List<Item> getItems() {
		return items;
	}
	
	public class Item {
		private String name; 
		private String path;
		
		public Item(String name, String path) {
			this.name = name;
			this.path = path;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPath() {
			return path;
		}

		public void setPath(String path) {
			this.path = path;
		}
	}
	
}
