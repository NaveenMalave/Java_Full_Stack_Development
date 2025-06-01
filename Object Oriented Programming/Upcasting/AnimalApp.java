package com.Upcasting;

public class AnimalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ref; 
		Deer d = new Deer();
		ref = d;
		ref.eat();
		ref.sleep();
	     Tiger t    = new Tiger();
	     ref= t;
		ref.eat();
		ref.sleep();
		Monkey m = new Monkey();
		ref = m;
		ref.eat();
		ref.sleep();
	}

}
