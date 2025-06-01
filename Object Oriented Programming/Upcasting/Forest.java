package com.Upcasting;

public class Forest {
  //flexibile method
	void acceptAnimal(Animal ref) {
		//polymorphic code
		ref.eat();
		ref.sleep();
	}
}
