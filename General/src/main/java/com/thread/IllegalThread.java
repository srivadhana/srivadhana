package com.thread;

public class IllegalThread implements Runnable {

	public static void main(String[] args) {
		Thread t1=new Thread();
		t1.start();
		t1.start();
	}

	@Override
	public void run() {
	System.out.println("Inside run method===>");
		
	}

}
//Logic
//t1 is already started and moved to runnable state.Trying to start the same thread again will
//leads to  java.lang.IllegalThreadStateException
