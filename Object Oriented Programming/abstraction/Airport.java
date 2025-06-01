package com.abstraction;

public class Airport {
	public void acceptPlane(Plane ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
	}

}
