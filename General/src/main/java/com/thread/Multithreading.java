package com.thread;

import java.util.Scanner;

class Pc {
	public void produce() throws InterruptedException {
		synchronized (this) { //makes this only thread as active which locks the current thread
			System.out.println("Producer thread running");
			wait();		//giveup the lock and goes to sleep until  notify() is invoked	by other thread
			System.out.println("Resumed");
		}
	}

	public void consume() throws InterruptedException {
		Thread.sleep(1000); //this makes the produce thread to run first
		Scanner sc = new Scanner(System.in);
		synchronized (this) {
			System.out.println("waiting for return key");
			sc.nextLine();
			System.out.println("returned key processed");
			notify();//It notifies the waiting thread to wakeup but afer the current method terminates
			//so it is called at end of method
			Thread.sleep(2000);//afer this notify will takes place
		}
	}
}

public class Multithreading {

	public static void main(String[] args) throws InterruptedException {
		final Pc pc=new Pc();
		
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.produce();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
		});
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.consume();;
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}

}

//Pooling-loops the condition till it returns true.by this way cpu cycles are wasted
//To over come thread pool multitreading is used by 3 methods wait(),notify(),notifyAll()
//All these methods belong to object class and used with synchronized block only
