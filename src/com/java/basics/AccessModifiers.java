package com.java.basics;

public class AccessModifiers {

	public String publicField = "PUBLIC";
	protected String protectedField = "PROTECTED";
	private String privateField = "PRIVATE";
	String defaultField = "DEFAULT";

	public void publicMethod() {
		System.out.println("PUBLIC Method");
	}

	protected void protectedMethod() {
		System.out.println("PROTECTED Method");
	}

	private void privateMethod() {
		System.out.println("PRIVATE Method");
	}

	void defaultMethod() {
		System.out.println("DEFAULT Method");
	}

	public void showAll() {
		System.out.println(publicField);
		System.out.println(protectedField);
		System.out.println(defaultField);
		System.out.println(privateField);

		publicMethod();
		protectedMethod();
		defaultMethod();
		privateMethod();
	}

}
