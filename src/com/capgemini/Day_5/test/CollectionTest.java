package com.capgemini.Day_5.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.Day_5.java.Car;
import com.capgemini.Day_5.java.Cellphone;
import com.capgemini.Day_5.java.Laptop;
import com.capgemini.Day_5.java.School;
import com.capgemini.Day_5.java.Television;

class CollectionTest {

	@Test
	void testLaptops() {
		ArrayList<Laptop> lp = new ArrayList<>();
		assertEquals(true, lp.add(new Laptop("HP","10","Windows XP","i3")));
		assertEquals(true,lp.add(new Laptop("Dell","20","Windows 7","i4")));
		assertEquals(true,lp.add(new Laptop("Lenovo","30","Windows 10","i6")));
		assertEquals(3, lp.size());
	}
	@Test
	void testCar() {
		ArrayList<Car> cr = new ArrayList<>();
		assertEquals(true,cr.add(new Car("India","800",1997,300000)));
		assertEquals(true,cr.add(new Car("China","650",2000,500000)));
		assertEquals(true,cr.add(new Car("HP","30",1999,1000000)));
		assertEquals(3, cr.size());
	}
	@Test
	void testTelevision() {
		ArrayList<Television> tv = new ArrayList<>();
		assertEquals(true,tv.add(new Television("Sony","LED","Yes",300000)));
		assertEquals(true,tv.add(new Television("China","650","No",500000)));
		assertEquals(true,tv.add(new Television("HP","30","No",1000000)));
		assertEquals(3, tv.size());
}
	@Test
	void testCellphone() {
		ArrayList<Cellphone> cp = new ArrayList<>();
		assertEquals(true,cp.add(new Cellphone("Sony","k10","Aaaa","Windows",20000)));
		assertEquals(true,cp.add(new Cellphone("Vivo","650","bbbab","Android",50000)));
		assertEquals(true,cp.add(new Cellphone("iphone","30","ghff","Ios",80000)));
		assertEquals(3, cp.size());
}
	
	@Test
	void testSchool() {
		ArrayList<School> sc = new ArrayList<>();
		assertEquals(true,sc.add(new School("KV","Hyderabad","RangaReddy",20)));
		assertEquals(true,sc.add(new School("Narayana","Kukatpally","Bhel",50)));
		assertEquals(true,	sc.add(new School("Oakridge","Charminar","RajendraNagar",8)));
		assertEquals(3, sc.size());
}
}