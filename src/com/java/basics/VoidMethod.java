package com.java.basics;

public class VoidMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoidMethod vm = new VoidMethod(); //creating object instance of the "VoidMethod"
		printMessage("hello");
		vm.printNewMessage("world");   //call the instance method

		
		

	}

	//using static keyword
	static void printMessage(String message) {
		System.out.println(message);
	}
	
	//without using static keyword
	void printNewMessage(String message) {
		System.out.println(message);
	}
}