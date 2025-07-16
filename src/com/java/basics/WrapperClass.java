package com.java.basics;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int primitive = 10;
		
		Integer wrapped = Integer.valueOf(primitive);  //boxing
		
		System.out.println("Primitive: " +primitive);
		System.out.println("Wrapped/Boxing : " +wrapped);
		
		Integer obj = Integer.valueOf(20);
		int num = obj.intValue();		//UnBoxing
		
		System.out.println("Unboxing: "+num);
		
		Integer autoBoxed= 10;		//java does Integer.ValueOf(10); automatically
		int unboxed= autoBoxed;		//java does autoBoxed.intValue();
		System.out.println("AutoBoxed: "+autoBoxed);
		System.out.println("AutoUnBoxed: "+unboxed);
		
		

	}

}
