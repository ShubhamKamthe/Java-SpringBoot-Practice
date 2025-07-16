package com.java.basics;

public class StringIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 ="Hello";
		
		String str2 ="Hello";
		
		String str3 = new String("Hello").intern();
		
		// Creating a string object using the new keyword
        // This creates a new object in the heap memory
		String str4 = new String("Namaskar");
		
		// Creating a string object using the new keyword
        // This also creates a new object in the heap memory
		String str5 = new String("Namaskar");
		
		String str6 = "Namaskar";
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		// Creating a string object without using the new keyword
        // This checks the string pool and creates a new object only if the string is not already present
		System.out.println(str4 == str5);
		
		 // Checking if str1 and str3 reference the same object
        // They are not the same object because str3 is created in the string pool
		System.out.println(str4 == str6);

	}

}
