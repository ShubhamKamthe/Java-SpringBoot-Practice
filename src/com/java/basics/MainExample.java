package com.java.basics;


//public : accessible to all
//static : allows to invoke without creating a separate object
//void : no return for the method
//(String[] args)/String.. : used for passing command line arguments 
//eg: args.length() will return length of S
public class MainExample {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        if (args.length > 0) {
            System.out.println("You passed: " + args[2]);
        }
    }
}