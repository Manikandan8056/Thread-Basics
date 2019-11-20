package com.revature.multithreading;

import java.util.Random;

public class TwoCoinToss {

	public static void main(String[] args) {
		
		class ThreadClass implements Runnable{

			public void run() {
				
				int HcountC1 = 0, HcountC2 = 0;
				int TcountC1 = 0, TcountC2 = 0;
				
				Random random = new Random();
				for(int i = 1; i <= 5; i++) {
					int possibility = random.nextInt(2);
					
					if(possibility == 0)
						HcountC1 += 1;
					else if(possibility == 1)
						TcountC1 += 1;
				}
				System.out.println("Coin 1 Head count :" + HcountC1);
				System.out.println("Coin 1 Tail count :" + TcountC1);
				System.out.println("--------------------------");
				for(int j = 1; j <= 5; j++) {
					int possibility = random.nextInt(2);
					
					if(possibility == 0)
						HcountC2 += 1;
					else if(possibility == 1)
						TcountC2 += 1;
				}
				System.out.println("Coin 2 Head count :" + HcountC2);
				System.out.println("Coin 2 Tail count :" + TcountC2);
			}
		}
		
		ThreadClass thread = new ThreadClass();
		
		for(int i=1;i<5;i++) {
			System.out.println("----New Thread start----");
			Thread trd = new Thread(thread);
			trd.start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
