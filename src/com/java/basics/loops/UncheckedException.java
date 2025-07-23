package com.java.basics.loops;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = null;
		try {
			
			int length = str.length();
			System.out.println("String Length : "+length);
			
		}catch(NullPointerException e) {
			System.out.println("Null Pointer Exception : " +e.getMessage());
			
		}
		

	}

}
