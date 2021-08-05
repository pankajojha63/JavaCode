package com.thread;

public class ThreadUsingLambda {
	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			System.out.println("Thread 1");
		});
		
		t.start();
	}
}
