package com.capgemini.Day_5.java;

import java.util.LinkedList;

public class MainClassCollection {
public static void main(String[] args) {
	LinkedList<Laptop> lp = new LinkedList<Laptop>();
	lp.add(new Laptop("HP","10","Windows XP","i3"));
	lp.add(new Laptop("Dell","20","Windows 7","i4"));
	lp.add(new Laptop("Lenovo","30","Windows 10","i6"));

	LinkedList<Car> cr = new LinkedList<Car>();
	cr.add(new Car("India","800",1997,300000));
	cr.add(new Car("China","650",2000,500000));
	cr.add(new Car("HP","30",1999,1000000));

	LinkedList<Television> tv = new LinkedList<Television>();
	tv.add(new Television("Sony","LED","Yes",300000));
	tv.add(new Television("China","650","No",500000));
	tv.add(new Television("HP","30","No",1000000));
	
	LinkedList<Cellphone> cp = new LinkedList<Cellphone>();
	cp.add(new Cellphone("Sony","k10","Aaaa","Windows",20000));
	cp.add(new Cellphone("Vivo","650","bbbab","Android",50000));
	cp.add(new Cellphone("iphone","30","ghff","Ios",80000));
	
	LinkedList<School> sc = new LinkedList<School>();
	sc.add(new School("KV","Hyderabad","RangaReddy",20));
	sc.add(new School("Narayana","Kukatpally","Bhel",50));
	sc.add(new School("Oakridge","Charminar","RajendraNagar",8));
}

}
