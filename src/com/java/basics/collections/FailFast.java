package com.java.basics.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class FailFast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3));
		Iterator<Integer> iterator = numbers.iterator();
		
		System.out.println("Numbers : ");

		while(iterator.hasNext()) {
			Integer number = iterator.next();
//			numbers.add(50);
			System.out.println(number);

		}
		

	}

}
