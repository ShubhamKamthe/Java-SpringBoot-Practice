package com.java.basics.classtype_structure;

class Parent {
    public static void staticMethod() {
        System.out.println("Static method in Parent class");
    }

    public void instanceMethod() {
        System.out.println("Instance method in Parent class");
    }
}

class Child extends Parent {
    // This hides the static method in Parent, it does not override it
    public static void staticMethod() {
        System.out.println("Static method in Child class");
    }

    // This overrides the instance method in Parent
    @Override
    public void instanceMethod() {
        System.out.println("Instance method in Child class");
    }
}

public class StaticHidingExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent childAsParent = new Child();
        Child child = new Child();

        parent.staticMethod(); // Output: Static method in Parent class
        childAsParent.staticMethod(); // Output: Static method in Parent class
        child.staticMethod(); // Output: Static method in Child class

        parent.instanceMethod(); // Output: Instance method in Parent class
        childAsParent.instanceMethod(); // Output: Instance method in Child class
        child.instanceMethod(); // Output: Instance method in Child class
    }
}