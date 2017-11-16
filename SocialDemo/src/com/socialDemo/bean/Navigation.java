package com.socialDemo.bean;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@ApplicationScoped
@Named("navigation")
public class Navigation {

	private List<Item> items; 

	public Navigation() {
		items = new ArrayList<>();
		items.add(new Item("Home" ,"index.xhtml"));
		items.add(new Item("Profile" ,"profile.xhtml"));
		items.add(new Item("Chat" ,"conversation.xhtml"));
		items.add(new Item("Help" ,"help.xhtml"));
		items.add(new Item("calc" ,"calc.xhtml"));
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

