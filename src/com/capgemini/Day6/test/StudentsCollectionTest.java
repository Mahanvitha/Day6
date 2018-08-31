package com.capgemini.Day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.Day6.java.StudentNames;





class StudentsCollectionTest {

	@Test
	void test() {
		TreeSet<StudentNames> sn = new TreeSet<>();
		assertEquals(true, sn.add(new StudentNames(434,"Mahanvitha","Java")));
		assertEquals(true, sn.add(new StudentNames(44,"Kavya","OOPS")));
		assertEquals(true, sn.add(new StudentNames(934,"Rita","PHP")));
		assertEquals(true, sn.add(new StudentNames(904,"Mina","CPP")));
	for (StudentNames StudentNames : sn) {
		System.err.println(sn);
	}
}

}