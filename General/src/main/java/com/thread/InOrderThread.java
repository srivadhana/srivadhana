package com.thread;

class Base {
	public void display() {
		System.out.println("base");
	}
}

public class InOrderThread extends Base implements Runnable {
	public static void main(String[] args) {
		InOrderThread obj = new InOrderThread();
		Thread t1 = new Thread(obj);
		t1.start();
		obj.display();
		t1.run();
		System.out.println("Main thread got executed");
	}

	@Override
	public void run() {
		System.out.println("Inside Run Method==>");
	}
}

//Logic
//In case of multitreading we can't predict the exact order of output 
//Because it will vary from system to system  (or) JVM to JVM
