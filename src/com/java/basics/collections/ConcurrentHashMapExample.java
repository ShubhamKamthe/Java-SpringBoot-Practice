package com.java.basics.collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
		
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three",3);
		map.put("Four", 4);
		
		map.forEach((key,value) ->System.out.println(key+":"+value));
		
		map.computeIfAbsent("Five", k->5);
		System.out.println("Five :"+map.get("Five"));
		

	}

}
