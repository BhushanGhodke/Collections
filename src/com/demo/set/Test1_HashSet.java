package com.demo.set;


import java.util.HashSet;
import java.util.Set;

public class Test1_HashSet {

	public static void main(String[] args) {
		
		Set<Integer> set= new HashSet<Integer>();
		set.add(10);
		set.add(24);
		set.add(214);
		set.add(54);
		set.add(4);
		
	//	Collections.sort(set);
	
	
		System.out.print("Set Of Integer is: ");
		set.forEach(x->System.out.print(x+" "));
	}
}
