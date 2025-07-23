package com.java.basics.classtype_structure;

public class EqualityExample {
    public static void main(String[] args) {
        String a = new String("hello");
        String b = new String("hello");

        System.out.println(a == b);          // false: different objects
        System.out.println(a.equals(b));     // true: same content

        String c = "world";
        String d = "world";

        System.out.println(c == d);          // true: same reference (string pool)
        System.out.println(c.equals(d));     // true: same content
    }
}
