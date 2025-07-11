package com.java.basics;

public class StackMemoryExample {

	public static void main(String[] args) {  //when main starts a stack frame is pushed
		// TODO Auto-generated method stub
		
		int x = 10;  //local variable in stack
		int y = 20;	 //local variable in stack
		int result = add(x,y);  //when add is called another stack frame is pushed for add
		System.out.println(result);

	}
	
	static int add(int a,int b) {
		int sum = a + b;	//local variable in stack
		return sum;			//after add returns the stack frame is popped
	}

}
