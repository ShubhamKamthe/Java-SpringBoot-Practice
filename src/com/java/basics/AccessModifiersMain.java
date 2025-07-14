package com.java.basics;

public class AccessModifiersMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers obj = new AccessModifiers();
		System.out.println(obj.publicField); //  Accessible
		System.out.println(obj.protectedField); //  Accessible
		System.out.println(obj.defaultField); //  Accessible
		// System.out.println(obj.privateField); //  Not accessible

		obj.publicMethod(); //  Accessible
		obj.protectedMethod(); //  Accessible
		obj.defaultMethod(); //  Accessible
		// obj.privateMethod(); //  Not accessible
	}

}
