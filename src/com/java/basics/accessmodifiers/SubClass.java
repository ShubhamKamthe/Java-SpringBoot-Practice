package com.java.basics.accessmodifiers;

import com.java.basics.AccessModifiers;

public class SubClass extends AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClass obj = new SubClass();

		System.out.println(obj.publicField); // ✅ Accessible
		System.out.println(obj.protectedField); // ✅ Accessible through inheritance
		// System.out.println(obj.defaultField); // ❌ Not accessible
		// System.out.println(obj.privateField); // ❌ Not accessible

		obj.publicMethod(); // ✅ Accessible
		obj.protectedMethod(); // ✅ Accessible through inheritance
		// obj.defaultMethod(); // ❌ Not accessible
		// obj.privateMethod(); // ❌ Not accessible
	}

}
