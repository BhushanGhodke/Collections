package com.demo.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(25);
		
		System.out.print("List Element: ");
		list.forEach(x->System.out.print(x+" "));
	}
}
