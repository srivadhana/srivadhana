package com.thread;

public class InvokeStartByExtendingThread extends Thread implements Runnable {

	public void run() {
		System.out.println("Inside run method");
	}

	public static void main(String[] args) {
		System.out.println("-----------------");
		InvokeStartByExtendingThread t = new InvokeStartByExtendingThread();
		t.run();
		t.start();
	}

}

//Logic
//class which extends thread that has start method implemently defaultly.
//By invoking start() it will automatically invoke the run() also
//By extending thread class there is no chance of extending any other class.So we are
//missing inheritance.But while implementing runnable this problem won't come

