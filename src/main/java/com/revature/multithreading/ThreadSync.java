package com.revature.multithreading;

import java.util.Date;

public class ThreadSync
{
    public static void main(String args[])
    {
    	class Count implements Runnable
    	{
    	   Thread mythread ;
    	   Count()
    	   { 
    	      mythread = new Thread(this, "my runnable thread");
    	      System.out.println("my thread created" + mythread);
    	      mythread.start();
    	   }
    	   public void run()
    	   {
    	      try
    	      {
    	    	  long hola = new Date().getTime();
    	        for (int i=0 ;i<10;i++)
    	        {
    	          System.out.println("Printing the count " + i + " " + (hola - new Date().getTime()));
    	          Thread.sleep(1000);
    	        }
    	     }
    	     catch(InterruptedException e)
    	     {
    	        System.out.println("my thread interrupted");
    	     }
    	     System.out.println("mythread run is over" );
    	   }
    	}
       Count cnt = new Count();
       try
       {
    	   long hai = new Date().getTime();
          while(cnt.mythread.isAlive())
          {
            System.out.println("Main thread will be alive till the child thread is live " + (hai - new Date().getTime())); 
            Thread.sleep(1500);
          }
       }
       catch(InterruptedException e)
       {
          System.out.println("Main thread interrupted");
       }
       System.out.println("Main thread run is over" );
    }
}