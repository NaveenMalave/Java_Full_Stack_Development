package anonymousObjects;

public class Demo2 {
	void display1(int a) {
		a++;
		System.out.println(a);
	}
	void display2(Demo1 ref) {
		System.out.println(ref.a);
		System.out.println(ref.b);
		ref.greet();
	}

}
