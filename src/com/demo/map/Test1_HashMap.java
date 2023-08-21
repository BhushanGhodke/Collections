package com.demo.map;

import java.util.HashMap;
import java.util.Map;
//Create a hashmap and iterate it by using for each method
public class Test1_HashMap {

	public static void main(String[] args) {
		
		Map<Integer, String> hashMap= new HashMap<Integer,String>();
		
		hashMap.put(10, null);
		hashMap.put(20, null);
		hashMap.forEach((k,v)->System.out.println("Key: "+k+ " Value: "+v));
	}
}
