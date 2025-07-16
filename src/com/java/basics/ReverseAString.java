package com.java.basics;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new StringBuilder("Hello").reverse().toString();
		
		System.out.println(str);
		
		
		String obj = "game";
		String obj2 = "";
		
		for (int i= obj.length() - 1; i>=0; i --) {
			obj2 += obj.charAt(i);
		}
		
		System.out.println("Manual :"+obj2);
		
		//formated string 
	     String formattedString = String.format("Hello, %s! Welcome to %s.", "Friend", "HungryCoders.com");
	     System.out.println(formattedString); //Hello, Friend! Welcome to HungryCoders.com.
	}

}
