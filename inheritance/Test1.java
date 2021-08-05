package com.inheritance;

public class Test1 extends A {
	public static void main(String[] args) {
		A a = new Test1();
		a.run();

	}

	void walk() {
		super.walk();
		System.out.println("B walk");
	}

	void run() {
		super.run();
		System.out.println("B run");
	}
}

class A {
	void walk() {
		System.out.println("A walk");
	}

	void run() {
		walk();
		System.out.println("A run");
	}
}