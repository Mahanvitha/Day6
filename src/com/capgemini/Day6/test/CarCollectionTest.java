package com.capgemini.Day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.Day6.java.CarCollection;


class CarCollectionTest {

	@Test
	void test() {
		HashSet<CarCollection> cr = new HashSet<>();
		assertEquals(true, cr.add(new CarCollection("India","I10",1999,200000)));
		assertEquals(true,cr.add(new CarCollection("China","I20",2000,100000)));
		assertEquals(true,cr.add(new CarCollection("USA","I30",1929,500000)));
		assertEquals(3, cr.size());
	}

}
