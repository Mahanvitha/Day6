package com.capgemini.Day6.java;

import java.util.Objects;

public class CarCollection implements Comparable<CarCollection>{
	 private String make;
	 private String model;
	 private int year;
	 private long price;
	public CarCollection() {
		super();
		
	}
	public CarCollection(String make, String model, int year, long price) {
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
	public int compareTo(CarCollection o) {
		int result = this. make.compareTo(o.make);
		if(result == 0)
			return this.model.compareTo(o.model);
;		return result;
	}
	@Override
	public String toString() {
		return "CarCollection [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
}
	
