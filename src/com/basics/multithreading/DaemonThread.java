package com.basics.multithreading;


//public class DaemonThread {
//    public static void main(String[] args) {
//        Thread daemonThread = new Thread(() -> {
//            while (true) {
//                System.out.println("Daemon thread is running...");
//                try {
//                    Thread.sleep(1000); // Simulate some task
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        daemonThread.setDaemon(true); // Set the thread as daemon
//        daemonThread.start(); // Start the daemon thread
//    }
//}

public class DaemonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable objRun = () ->{
			while(true) {
			System.out.println("Daemon Thread is running");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			}
		};
		
		Thread obj = new Thread(objRun);
		obj.setDaemon(true);
		obj.start();
		
	}

}
