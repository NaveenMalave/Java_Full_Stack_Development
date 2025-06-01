package com.finalkey;

public class BirdApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainEagle mg = new  MountainEagle();
		mg.fly();
		mg.eat();
		GoldenEagle ge = new GoldenEagle();
		ge.fly();
		ge.eat();
		VegSparrow vs = new VegSparrow();
		vs.fly();
		vs.eat();
		NonVegSparrow nv = new NonVegSparrow();
		nv.fly();
		nv.eat();

	}

}
