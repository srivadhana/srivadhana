package com.thread;

//yield is used where one thread is taking too much time to complete its execution, 
//we need a way to prevent execution of a thread in between if something important is pending.


//join -waits for this thread to die.
//implements runnable shares same object to multiple thread.


public class TestThread_Basic implements Runnable {

	@Override
	public void run() {
		 Thread t = Thread.currentThread();
	        System.out.println("Current thread: "
	                               + t.getName());
	 
	        // checks if current thread is alive
	        System.out.println("Is Alive? "
	                               + t.isAlive());
		
	}
	
//	    }
	 
	    public static void main(String args[]) throws Exception
	    {
	        Thread t = new Thread(new TestThread_Basic());
	        t.start(); //thread goes to runnable state
	 
	        // this thread wait for 1000 ms until completing some other thread execution
	        t.join(1000);
	 
	        System.out.println("\nJoining after 1000"+
	                             " milliseconds: \n");
	        System.out.println("Current thread: " +
	                                    t.getName());
	 
	 
	        // Checks if this thread is alive
	        System.out.println("Is alive? " + t.isAlive());
	    }


}

//Logic
//defaultly main thread will execute first 
//But here join() makes the current main thread to die for 1000ms
//In the mean time next thread will be executed.
//finally  main thread got executed

