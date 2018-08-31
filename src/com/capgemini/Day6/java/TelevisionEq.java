package com.capgemini.Day6.java;

import java.util.Objects;

public class TelevisionEq {
	private String company;
	private String type;
	private String enabled3D;
	private int price;
	
	public TelevisionEq() {
		super();
	}
	
	public TelevisionEq(String company, String type, String enabled3d, int price) {
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
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		TelevisionEq c2 = (TelevisionEq) obj;
		return this.company == c2.company && this.type == c2.type && this.price == c2.price;
					
	}	

	@Override
	public int hashCode() {
		return Objects.hash(company,type,price);
	}
	public String toString() {
		return company+"\n"+type+"\n"+enabled3D+"\n"+price+"\n";
	}
}

