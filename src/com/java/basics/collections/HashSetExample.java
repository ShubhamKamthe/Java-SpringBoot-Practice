package com.java.basics.collections;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("Apple");
		hashSet.add("Mango");
		
		System.out.println("Does set contains : "+hashSet.contains("Apple"));
		
		for(String fruits: hashSet) {
			System.out.println(fruits);
		}
		
		System.out.println("removing apple "+hashSet.remove("Apple"));
		for(String fruits: hashSet) {
			System.out.println(fruits);
		}
		System.out.println("removing apple "+hashSet.remove("Apple"));

	}

}
