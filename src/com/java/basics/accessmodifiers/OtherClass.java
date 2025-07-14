package com.java.basics.accessmodifiers;

import com.java.basics.AccessModifiers;


public class OtherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifiers obj = new AccessModifiers();

        System.out.println(obj.publicField);    // ✅ Accessible
        // System.out.println(obj.protectedField); // ❌ Not accessible
        // System.out.println(obj.defaultField);   // ❌ Not accessible
        // System.out.println(obj.privateField);   // ❌ Not accessible

        obj.publicMethod();    // ✅ Accessible
        // obj.protectedMethod(); // ❌ Not accessible
        // obj.defaultMethod();   // ❌ Not accessible
        // obj.privateMethod();   // ❌ Not accessible

	}

}
