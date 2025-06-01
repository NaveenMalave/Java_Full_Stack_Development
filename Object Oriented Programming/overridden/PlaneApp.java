package com.overridden;

public class PlaneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cargoplane = new CargoPlane();
		cargoplane.takeOff();
		cargoplane.fly();
		cargoplane.carryCargo();
		
		PassengerPlane passengerPlane = new PassengerPlane();
		passengerPlane.takeOff();
		passengerPlane.fly();
		passengerPlane.carryPassenger();

	}

}
