package com.capgemini.Day6.java;

import java.util.Objects;

public class SchoolEq {
	private String name;
	private String city;
	private String schoolDistrict;
	private int greatSchoolRanking;
	
	public SchoolEq() {
		super();
	}
	
	public SchoolEq(String name, String city, String schoolDistrict, int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSchoolDistrict() {
		return schoolDistrict;
	}

	public void setSchoolDistrict(String schoolDistrict) {
		this.schoolDistrict = schoolDistrict;
	}

	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		SchoolEq c2 = (SchoolEq) obj;
		return this.name == c2.name && this.city == c2.city && this.schoolDistrict == c2.schoolDistrict;
					
	}	

	@Override
	public int hashCode() {
		return Objects.hash(name,city,schoolDistrict);
	}
	public String toString() {
		return name+"\n"+city+"\n"+schoolDistrict+"\n"+greatSchoolRanking+"\n";
	}
}


