package anonymousObjects;

public class human {
	void display1(int humans) {
		humans++;
		System.out.println(humans);
	}
	void display2(forest ref) {
		System.out.println(ref.area);
		System.out.println(ref.no_of_animal);
		ref.greet();
	}

}
