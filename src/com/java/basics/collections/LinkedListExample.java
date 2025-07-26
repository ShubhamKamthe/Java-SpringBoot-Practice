package com.java.basics.collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> linkedList = new LinkedList<>();
		
		linkedList.add("apple");
		linkedList.add("mango");
		linkedList.add("Grapes");
		
		System.out.println("Fruit at index 1 : "+linkedList.get(1));
		
		for(String fruit : linkedList) {
			System.out.println(fruit);
		}
		
		System.out.println("remove Fruit at index 1 : "+linkedList.remove(1));
		for(String fruit : linkedList) {
			System.out.println(fruit);
		}
		System.out.println("Adding Fruit at first and last : "+linkedList.remove(1));

		linkedList.addFirst("kiwi");
		linkedList.addLast("coconut");
		
		for(String fruit : linkedList) {
			System.out.println(fruit);
		}
		
		

	}

}
