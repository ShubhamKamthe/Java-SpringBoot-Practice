package com.java.basics.oop;

class Human {
	void sound() {
		System.out.println("Person Talks");
	}

}

class Actor extends Human {
	@Override
	void sound() {
		System.out.println("Actor Sings");
	}
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human obj = new Actor(); //upcasting

		obj.sound();		//calls Actor overriden method

		Human obj2 = new Human();

		obj2.sound();

	}

}
