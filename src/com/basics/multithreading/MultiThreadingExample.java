package com.basics.multithreading;



class MyThread1 extends Thread{
	public void run() {
		System.out.println("Thread1 is running");
	}
}

public class MultiThreadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyThread1 objThread = new MyThread1();
		objThread.start();
		
		Thread objThread2 = new Thread(() -> {
			System.out.println("Thread2 is running");
		});
		objThread2.start();
		
		Runnable objRunnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread3 is running");
			}
		};
		Thread objThread3 = new Thread(objRunnable);
		objThread3.start();
		
		
		Runnable objRunnable2 = ()->{
			System.out.println("Thread4 is Started");
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getState());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread4 is Stopped");


		};
		Thread objThread4 = new Thread(objRunnable2,"objRunnable2");
		objThread4.start();
		
	}

}
