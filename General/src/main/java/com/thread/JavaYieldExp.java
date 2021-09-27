package com.thread;

class A extends Thread {

	public void run() {
		System.out.println(" \n " + Thread.currentThread().getName());

		for (int i = 1; i <= 5; i++) {
			if (i == 2)
				yield(); //it pauses and sends the control to the remaining threads
			//of same priority
			//so that this thread will execute finally 
			System.out.println(" \n Thread from class A" + i);
		}
		System.out.println("Thread A completed-------");

	}
}

class B extends Thread {
	public void run() {
		System.out.println(" \n " + Thread.currentThread().getName());
		for (int i = 1; i <= 5; i++) {
			if (i == 3)
				stop();//stop executing the current thread
			System.out.println(" \n Thread from class B" + i);
		}
		System.out.println("Thread B completed-------");

	}
}

class C extends Thread {
	public void run() {
		System.out.println(" \n " + Thread.currentThread().getName());
		for (int i = 1; i <= 5; i++) {
			if (i == 4)
				System.out.println(" \n System is going to sleep for 3s");
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(" \n Thread from class C" + i);
		}
		System.out.println("Thread C completed-------");

	}

}

public class JavaYieldExp extends Thread {

	public static void main(String[] args) {
		A o1 = new A();
		B o2 = new B();
		C o3 = new C();
		System.out.println("Thread A started-------");
		o1.start();
		System.out.println("Thread B started-------");
		o2.start();
		System.out.println("Thread C started-------");
		o3.start();
		System.out.println("Main Thread completed-------");
	}
}
