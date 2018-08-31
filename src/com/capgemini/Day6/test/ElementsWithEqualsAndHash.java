package com.capgemini.Day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;


import com.capgemini.Day6.java.CarEq;
import com.capgemini.Day6.java.CellphoneEq;
import com.capgemini.Day6.java.LaptopsEq;
import com.capgemini.Day6.java.SchoolEq;
import com.capgemini.Day6.java.TelevisionEq;




class ElementsWithEqualsAndHash {

	@Test
		void testLaptops() {
			HashSet<LaptopsEq> lp = new HashSet<>();
			assertEquals(true, lp.add(new LaptopsEq("HP","10","Windows XP","i3")));
			assertEquals(false,lp.add(new LaptopsEq("HP","10","Windows 7","i4")));
			assertEquals(true,lp.add(new LaptopsEq("Lenovo","30","Windows 10","i6")));
			assertEquals(2, lp.size());
		}
		@Test
		void testCar() {
			HashSet<CarEq> cr = new HashSet<>();
			assertEquals(true,cr.add(new CarEq("India","800",1997,500000)));
			assertEquals(false,cr.add(new CarEq("India","800",2000,500000)));
			assertEquals(true,cr.add(new CarEq("HP","30",1999,1000000)));
			assertEquals(2, cr.size());
		}
		@Test
		void testTelevision() {
			HashSet<TelevisionEq> tv = new HashSet<>();
			assertEquals(true,tv.add(new TelevisionEq("Sony","LED","Yes",300000)));
			assertEquals(false,tv.add(new TelevisionEq("Sony","LED","No",300000)));
			assertEquals(true,tv.add(new TelevisionEq("HP","30","No",1000000)));
			assertEquals(2, tv.size());
	}
		@Test
		void testCellphone() {
			HashSet<CellphoneEq> cp = new HashSet<>();
			assertEquals(true,cp.add(new CellphoneEq("Sony","k10","Aaaa","Windows",20000)));
			assertEquals(false,cp.add(new CellphoneEq("Sony","k10","bbbab","Windows",20000)));
			assertEquals(true,cp.add(new CellphoneEq("iphone","30","ghff","Ios",80000)));
			assertEquals(2, cp.size());
	}
		
		@Test
		void testSchool() {
			HashSet<SchoolEq> sc = new HashSet<>();
			assertEquals(true,sc.add(new SchoolEq("KV","Hyderabad","Bhel",20)));
			assertEquals(false,sc.add(new SchoolEq("KV","Hyderabad","Bhel",50)));
			assertEquals(true,	sc.add(new SchoolEq("Oakridge","Charminar","RajendraNagar",8)));
			assertEquals(2, sc.size());
	}

	}


