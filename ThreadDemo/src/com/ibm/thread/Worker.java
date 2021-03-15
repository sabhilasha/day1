package com.ibm.thread;

public class Worker extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
	}

}
