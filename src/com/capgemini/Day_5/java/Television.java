package com.capgemini.Day_5.java;

public class Television {
	private String company;
	private String type;
	private String enabled3D;
	private int price;
	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Television(String company, String type, String enabled3d, int price) {
		super();
		this.company = company;
		this.type = type;
		enabled3D = enabled3d;
		this.price = price;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEnabled3D() {
		return enabled3D;
	}
	public void setEnabled3D(String enabled3d) {
		enabled3D = enabled3d;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return company+"\n"+type+"\n"+enabled3D+"\n"+price+"\n";
	}
}
