package com.java.basics;

public class HeapMemoryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1= new Person("Shubham",27);
		Person p2= new Person("Nanu",28);
		
		  System.out.println("Person 1: " + p1.name + ", " + p1.age);
	      System.out.println("Person 2: " + p2.name + ", " + p2.age);


	}
}
	
	class Person{
		String name;
		int age;
		
		Person(String name,int age){
			this.name=name;
			this.age=age;
		
	}

}
