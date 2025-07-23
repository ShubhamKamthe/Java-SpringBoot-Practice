package com.java.basics.loops;

public class LabeledBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (j == 2) {
	                    System.out.println(j);
	                    break; // Breaks out of the inner loop
	                }
	            }
	            System.out.println(i);
	        }

	        System.out.println("Outer Loop");

	        outerloop:
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 5; j++) {
	                System.out.println(i);
	                System.out.println(j);
	                if (i == 1 && j == 2) {
	                    break outerloop; // Breaks out of the outer loop
	                }
	            }
	        }

	}

}
