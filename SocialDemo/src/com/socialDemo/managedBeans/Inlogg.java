package com.socialDemo.managedBeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="inlogg")
public class Inlogg {

	private String userName;
	private String password;
	private String food;
	private boolean sick;
	
	private List<String> favoritLanguages;
	private List<String> foodOpions;
	private List<String> langugeOptions;
	
	public Inlogg() {
		foodOpions = new ArrayList<>();
		foodOpions.add("Pizzza pie");
		foodOpions.add("Cheees");
		foodOpions.add("Moon Meat");
		foodOpions.add("Salmoon");
		
		langugeOptions = new ArrayList<>();
		langugeOptions.add("Svensk skan");
		langugeOptions.add("Angelske");
		langugeOptions.add("Mandarin");
		langugeOptions.add("Blratt pop brrr boom");
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
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public List<String> getFoodOpions() {
		return foodOpions;
	}
	public void setFoodOpions(List<String> foodOpions) {
		this.foodOpions = foodOpions;
	}
	public List<String> getFavoritLanguages() {
		return favoritLanguages;
	}
	public void setFavoritLanguages(List<String> favoritLanguages) {
		this.favoritLanguages = favoritLanguages;
	}
	public List<String> getLangugeOptions() {
		return langugeOptions;
	}
	public void setLangugeOptions(List<String> langugeOptions) {
		this.langugeOptions = langugeOptions;
	}
	public boolean isSick() {
		return sick;
	}
	public void setSick(boolean sick) {
		this.sick = sick;
	}
}
