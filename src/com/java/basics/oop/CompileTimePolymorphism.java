package com.java.basics.oop;


class Calculator{
    // Method overloading

	int add(int a,int b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
}
public class CompileTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator obj = new Calculator();
		int result1 = obj.add(1, 2);
		double result2 = obj.add(1.2, 2);
		System.out.println("Int Result : "+result1);  // Calls int add(int a, int b)
		System.out.println("Int Result : "+result2);  // Calls double add(double a, double b)

	}

}
