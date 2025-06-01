package com.abstraction;

public class PlaneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airport airport = new Airport();
		airport.acceptPlane(new CargoPlane());
		airport.acceptPlane(new PassengerPlane());
		airport.acceptPlane(new FighterPlane());

	}

}
