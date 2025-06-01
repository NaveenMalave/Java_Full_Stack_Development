package com.varInterface;

public interface RBI {
	int a = 10;
	void withdraw();
	void deposit();
	default void demonstration1() {
		System.out.println("hello 500 rs tata bye bye");
	}
	static void demonstration2() {
		System.out.println("hello 1000 rs tata bye bye");
	}
	private void demonstration3() {
		System.out.println("hello 2000 rs also tata bye bye");
	}

}
