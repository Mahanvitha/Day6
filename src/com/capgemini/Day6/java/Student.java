package com.capgemini.Day6.java;

public class Student {
	 private int rollNumber;
	 private String name;
	 private String branch;
	public Student() {
		super();
	}
	public Student(int rollNumber, String name, String branch) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.branch = branch;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String toString() {
		return rollNumber+"\n"+name+"\n"+branch+"\n";
	}
	 
}
