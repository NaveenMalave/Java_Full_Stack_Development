package com.singleton;

public class CeoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ceo c = new Ceo();
		Ceo c = Ceo.getCeo("aksh",5000);
		c.attendMeeting();
		c.bringBusiness();
	}

}
