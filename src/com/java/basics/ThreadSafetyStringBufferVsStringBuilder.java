package com.java.basics;

public class ThreadSafetyStringBufferVsStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		StringBuilder obj = new StringBuilder();
		
		StringBuffer obj = new StringBuffer();
		
		Thread t1 = new Thread(() -> {
			for(int i=0;i<1000;i++) {
				obj.append("A");
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i=0;i<1000;i++) {
				obj.append("B");
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch(Exception e){
			
		}
		System.out.println("String Length is:"+obj.toString().length());

	}

}
