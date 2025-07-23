package com.java.basics.loops;

public class LoopExamples {

    public static void main(String[] args) {

        // 1. FOR LOOP - known number of iterations
        System.out.println("FOR LOOP:");
        for (int i = 1; i <= 5; i++) {
        	
        	if(i==3) {
        		break; //stops at i=2 and continue to execute other loops
        	}
            System.out.println("Iteration: " + i);
        }
        
        System.out.println("ODD Numbers : ");
        for(int number=0;number<10;number++) {
        	if(number%2==0) {
        		continue;			//skips even numbers
        	}
        	System.out.println("ODD Numbers :"+number);
        }
        
        System.out.println("Even Numbers : ");
        for(int number=0;number<10;number++) {
        	if(number%2==1) {	
        		continue;			//skips odd numbers
        	}	
        	System.out.println("Even Numbers :"+number);
        }

        // 2. WHILE LOOP - unknown number of iterations, condition checked before
        System.out.println("\nWHILE LOOP:");
        int count = 1;
        while (count <= 5) {
//        	if(count==3) {
//        		return; //return from the loop as well as method and further functions are not performed
        				//stops where it is
//        	}
            System.out.println("Count: " + count);
            count++;
        }

        // 3. DO-WHILE LOOP - runs at least once, condition checked after
        System.out.println("\nDO-WHILE LOOP:");
        int num = 6;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 5); // runs once even though condition is false

        // 4. ENHANCED FOR LOOP - best for arrays/collections
        System.out.println("\nENHANCED FOR LOOP:");
        String[] names = {"Alice", "Bob", "Charlie"};
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}
