package com.capgemini.Day6.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

class StudentNamesWithFavFruits {

	@Test
	void test() {
	HashMap<String, ArrayList<String>> map = new HashMap<>();
	String [] favoriteFruits = new String [2] ;
	favoriteFruits = new String []{"Apple","Kiwi"}; 
	 map.put("kk", new ArrayList<>(Arrays.asList(favoriteFruits)));
	 favoriteFruits = new String [] {"Banana","Peach","orange"};
	 map.put("mm", new ArrayList<>(Arrays.asList(favoriteFruits)));
	 favoriteFruits = new String [] {"Pears","Cherry"};
	 map.put("yy", new ArrayList<>(Arrays.asList(favoriteFruits)));
	 assertEquals(3,map.size());
	 for(String string : map.keySet()) {
	 System.out.println(string);
	 System.out.println(map.get(string));
	}

}
	}
