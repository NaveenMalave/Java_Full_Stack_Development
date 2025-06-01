package com.Upcasting;

public class AnimalAppPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // code compactness
		Deer d = new Deer();
		Tiger t = new Tiger();
		Monkey m = new Monkey();
		Forest forest = new Forest();
		forest.acceptAnimal(d);
		forest.acceptAnimal(t);
		forest.acceptAnimal(m);
	}

}
