package com.capgemini.Day6.test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.Day6.java.Student;
class StudentNamesTest {

	@Test
	void test() {
		ArrayList<Student> st = new ArrayList<>();
		assertEquals(true, st.add(new Student(434,"Mahanvitha","Java")));
		assertEquals(true, st.add(new Student(44,"Kavya","OOPS")));
		assertEquals(true, st.add(new Student(934,"Rita","PHP")));
		assertEquals(true, st.add(new Student(904,"Mina","CPP")));
	}

}
