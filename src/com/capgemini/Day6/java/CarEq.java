package com.capgemini.Day6.java;

import java.util.Objects;

public class CarEq {
	 private String make;
	 private String model;
	 private int year;
	 private long price;
	 
	 
	public CarEq() {
		super();
	}
	public CarEq(String make, String model, int year, long price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
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
		
		CarEq c2 = (CarEq) obj;
		return this.make == c2.make && this.model == c2.model;
					
	}	

	@Override
	public int hashCode() {
		return Objects.hash(make,model);
	}
	public String toString() {
		 return make+"\n"+model+"\n"+year+"\n"+price+"\n";
	 }
	}

