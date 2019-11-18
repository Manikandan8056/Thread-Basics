package com.revature.multithreading;

public class ThreadBasic extends Thread{

	public void run() {
		System.out.println("Thread is in running state..");
	}
	public static void main(String[] args) {
		ThreadBasic obj = new ThreadBasic();
		try {
			obj.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
