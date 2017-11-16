package com.socialDemo.bean;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@ApplicationScoped
@Named
public class CalcButtonOptions {

	private List<String> symbols;

	
	public CalcButtonOptions() {
		symbols = new ArrayList<>();
		for(int i = 9; 0 <= i; i--) {
			symbols.add(i+"");
		}
		symbols.add("+");
		symbols.add("-");
		symbols.add("/");
		symbols.add("*");
		symbols.add("=");
	}
	
	public List<String> getSymbols() {
		return symbols;
	}
	public void setSymbols(List<String> symbols) {
		this.symbols = symbols;
	}
}
