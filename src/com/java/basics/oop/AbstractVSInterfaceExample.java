package com.java.basics.oop;

//Abstract class
abstract class Janvar {
 private String name;

 // Constructor in abstract class
 public Janvar(String name) {
     this.name = name;
 }

 // Abstract method (no implementation)
 public abstract void makeSound();

 // Concrete method
 public void sleep() {
     System.out.println(name + " is sleeping.");
 }
}

//Interface with abstract methods and default method
interface Pet {
 // Abstract method
 void play();

 // Default method (concrete method)
 default void beFriendly() {
     System.out.println("Being friendly.");
 }

 // Static method (concrete method)
 static void showAffection() {
     System.out.println("Showing affection.");
 }
}

//Class that extends abstract class and implements interface
class Lab extends Janvar implements Pet {
 public Lab(String name) {
     super(name); // Call the constructor of the abstract class
 }

 @Override
 public void makeSound() {
     System.out.println("Dog barks.");
 }

 @Override
 public void play() {
     System.out.println("Dog is playing.");
 }
}


public class AbstractVSInterfaceExample {
 public static void main(String[] args) {
     Lab myDog = new Lab("Buddy");
     myDog.makeSound(); // Dog barks.
     myDog.sleep(); // Buddy is sleeping.
     myDog.play(); // Dog is playing.
     myDog.beFriendly(); // Being friendly.

     Pet.showAffection(); // Showing affection.
 }
}

