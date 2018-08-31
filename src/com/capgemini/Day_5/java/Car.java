package com.capgemini.Day_5.java;

public class Car {
 private String make;
 private String model;
 private int year;
 private long price;
 
public Car() {
	super();
}

public Car(String make, String model, int year, long price) {
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

public String toString() {
	 return make+"\n"+model+"\n"+year+"\n"+price+"\n";
 }
}
 