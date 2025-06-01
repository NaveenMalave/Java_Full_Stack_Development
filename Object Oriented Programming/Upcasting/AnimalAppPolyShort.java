package com.Upcasting;

public class AnimalAppPolyShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forest forest = new Forest();
		forest.acceptAnimal(new Deer());
		forest.acceptAnimal(new Tiger());
		forest.acceptAnimal(new Monkey());

	}

}
