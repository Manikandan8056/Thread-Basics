package com.revature.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {

		Count cnt = new Count();
		
		try {
				cnt.start();
				System.out.println("Main thread will be alive till the child thread is live");
				Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}


class Count extends Thread {
	public void run() {
		try {
			for(int i = 0; i < 5; i++) {
				System.out.println("The count is :"+ i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
