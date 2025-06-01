package com.methodOverLoading;

public class Demo {
	void add() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}
	void add(int a) {
		int b = 30;
		System.out.println(a+b);
	}
	void add(int a, int b) {
		System.out.println(a+b);
	}
	float add(int a,float c) {
		return a+c;
	}
    float add(float c , int b) {
    	return c+b;
    }
    float add(float c,float d) {
    	return c+d;
    }
}
