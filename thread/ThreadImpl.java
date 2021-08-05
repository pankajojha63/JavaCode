package com.thread;

public class ThreadImpl extends Thread {
	public void run() {
		try {
			printNum();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ThreadImpl t1 = new ThreadImpl();
		ThreadImpl t2 = new ThreadImpl();
		
		t1.start();
		t2.start();

	}

	synchronized void printNum() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			Thread.sleep(2000);
			System.out.println("Number :: " + i);
		}
	}
}
