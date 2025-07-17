package com.java.basics.oop;

interface A {
    default void display() {
        System.out.println("Display from A");
    }
}

interface B extends A {
    default void display() {
        System.out.println("Display from B");
    }
}

interface C extends A {
    default void display() {
        System.out.println("Display from C");
    }
}

// D implements both B and C — diamond shape
class D implements B, C {
    // Must override to resolve ambiguity
    public void display() {
        // Choose one or provide custom logic
        B.super.display();  // or C.super.display()
        System.out.println("Display from D");
    }
}

public class InterfaceMultipleInhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new D();
		obj.display();
		

	}

}
