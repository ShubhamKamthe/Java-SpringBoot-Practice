package com.java.basics.classtype_structure;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumbers(1,2,3,4,5);
		printNumbers();

	}
	
	public static void printNumbers(int... numbers) {
		System.out.println("numbers : ");

		for(int num:numbers) {
			System.out.println(num);
		}
	}

}
