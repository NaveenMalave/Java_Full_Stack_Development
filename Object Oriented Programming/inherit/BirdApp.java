package com.inherit;

public class BirdApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eagle eagle = new Eagle();
		eagle.fly();
		eagle.eat();
		eagle.sleep();
		System.out.println("========================");
		Sparrow sparrow = new Sparrow();
		sparrow.fly();
		sparrow.eat();
		sparrow.sleep();
		System.out.println("===========================");
		GoldenEagle gold = new GoldenEagle();
		gold.eat();
		gold.fly();
		gold.sleep();
		System.out.println("=========================");
		MountainEagle mou = new MountainEagle();
		mou.eat();
		mou.fly();
		mou.sleep();
		System.out.println("========================");
		SerpantEagle ser = new SerpantEagle();
		ser.eat();
		ser.fly();
		ser.sleep();
		System.out.println("=======================");
		VegSparrow vs = new VegSparrow();
		vs.eat();
		vs.fly();
		vs.sleep();
		System.out.println("========================");
		NonVegSparrow nv = new NonVegSparrow();
		nv.eat();

	}

}
