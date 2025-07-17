package com.java.basics.oop;

public class CopyConstructor {
	
	private int x;
	
	//copy constructor
	public CopyConstructor(CopyConstructor obj){
		this.x= obj.x; 
	}
	
	
	//parameterized constructor
	public CopyConstructor(int a,int b){
		
	}
	
	//default constructor
	public CopyConstructor() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
