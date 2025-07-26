package com.java.basics.collections;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> treeSet = new TreeSet<>();

		treeSet.add("Apple");
		treeSet.add("Mango");
		
		System.out.println("Does set contains : "+treeSet.contains("Apple"));
		
		for(String fruits: treeSet) {
			System.out.println(fruits);
		}
		
		System.out.println("removing apple "+treeSet.remove("Apple"));
		for(String fruits: treeSet) {
			System.out.println(fruits);
		}
		System.out.println("removing apple "+treeSet.remove("Apple"));

	}

}
