package com.polymoropsm;

public class BirdApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eagle e = new Eagle();
		Sparrow s = new Sparrow();
		GoldenEagle  Ge = new GoldenEagle();
		SarpantEagle se = new SarpantEagle();
		VegSparrow vs = new VegSparrow();
		NonVegSparrow nv = new NonVegSparrow();
		Forest F = new Forest();
		F.acceptBird(e);
		F.acceptBird(s);
		F.acceptBird(Ge);
		F.acceptBird(se);
		F.acceptBird(vs);
		F.acceptBird(nv);

	}

}
