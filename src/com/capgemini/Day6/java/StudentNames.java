package com.capgemini.Day6.java;

public class StudentNames implements Comparable<StudentNames>{
	 private int rollNumber;
	 private String name;
	 private String branch;
	public StudentNames() {
		super();
	}
	public StudentNames(int rollNumber, String name, String branch) {
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
	@Override
	public String toString() {
		return "StudentNames [rollNumber=" + rollNumber + ", name=" + name + ", branch=" + branch + "]";
	}
	@Override
	public int compareTo(StudentNames o) {
		int result = this . name.compareTo(o.name);
		if(result == 0)
			return Integer.compare(this.rollNumber,o.rollNumber)
;		return result;
	}
}
