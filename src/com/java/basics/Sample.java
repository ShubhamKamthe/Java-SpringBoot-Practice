package com.java.basics;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome again...");
		
		Todo todo = new Todo();
		
		System.out.println("Value of a: " + todo.a);
	}
	
	public static class Todo{
		int a = 5;
		int b = 7;
	}

}
