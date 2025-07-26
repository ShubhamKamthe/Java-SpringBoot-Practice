package com.java.basics.collections;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> arrayList = new ArrayList<>();
		
		arrayList.add("Shubham");
		arrayList.add("Soham");
		arrayList.add("Varshit");
		
		System.out.println("After Adding");
		for(String names: arrayList) {
			System.out.println(names);
		}
		
		System.out.println("Getting Element at index 1 : "+arrayList.get(1));
		
		arrayList.remove(1);
		System.out.println("After Removing at index 1");
		for(String names: arrayList) {
			System.out.println(names);
		}

	}

}
