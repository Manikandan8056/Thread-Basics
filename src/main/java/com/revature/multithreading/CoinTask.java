package com.revature.multithreading;

import java.util.Random;

class ThreadClass implements Runnable{

	public void run() {
		
		int Hcount = 0;
		int Tcount = 0;
		Random random = new Random();
		for(int i = 1; i <= 5; i++) {
			int possibility = random.nextInt(2);
			
			if(possibility == 0)
				Hcount += 1;
			else if(possibility == 1)
				Tcount += 1;
		}
		System.out.println("Head count :" + Hcount);
		System.out.println("Tail count :" + Tcount);
	}
}

public class CoinTask {

	public static void main(String[] args) {
		
		ThreadClass thread = new ThreadClass();
		
		Thread trd = new Thread(thread);
		Thread trd1 = new Thread(thread);
		
		trd.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		trd1.start();
	}
}
