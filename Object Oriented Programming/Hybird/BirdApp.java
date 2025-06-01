package com.Hybird;

public class BirdApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eagle e = new Eagle();
		e.fly();
		e.eat();
		e.sleep();
		MountainEagle  Me = new MountainEagle();
		Me.fly();
		Me.eat();
		Me.sleep();
		SarpantEagle se = new SarpantEagle();
		se.fly();
		se.eat();
		se.sleep();
	    GoldenEagle ge = new GoldenEagle();
	    ge.fly();
	    ge.eat();
	    ge.sleep();
	    Sparrow s = new Sparrow();
	    s.fly();
	    s.eat();
	    s.sleep();
	    VegSparrow vs = new VegSparrow();
	    vs.fly();
	    vs.eat();
	    vs.sleep();
	    NonVegSparrow nv = new NonVegSparrow();
	    nv.fly();
	    nv.eat();
	    nv.sleep(); 
	}

}
