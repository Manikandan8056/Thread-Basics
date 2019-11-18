package com.revature.multithreading;

	public class ThreadRunnable implements Runnable {
	    
		public void run() {
			System.out.println("Thread is in Active");
	    }
	    
	    public static void main(String[] args) {
	    	ThreadRunnable obj = new ThreadRunnable();
	        Thread thread1 = new Thread(obj);
	        thread1.start();
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        thread1.setPriority(10);
	        int priority = thread1.getPriority();
	        System.out.println(priority);
	        System.out.println("Thread Running");
	  }
	}
