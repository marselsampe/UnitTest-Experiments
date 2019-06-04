package com.marselsampe.unittest.mock;

public class Food {
	private String name;
	private String category;
	
	public Food( String name, String category ) {
		this.name = name;
		this.category = category;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getCategory() {
		return this.category;
	}
}
