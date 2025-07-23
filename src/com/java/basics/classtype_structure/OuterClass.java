package com.java.basics.classtype_structure;

public class OuterClass {

    private int outerValue = 10;
    private static int staticValue = 100;

    // 👇 Inner Class
    public class InnerClass {
        public void display() {
            System.out.println("Accessing outerValue: " + outerValue);
        }
    }

    // 👇 Static Nested Class
    public static class StaticNestedClass {
        public void display() {
            System.out.println("Accessing staticValue: " + staticValue);
        }
    }

    public static void main(String[] args) {
        // Inner class requires an outer instance
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        // Static nested class can be instantiated directly
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display();
    }
}

