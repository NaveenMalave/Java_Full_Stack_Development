package opps;

public class Circle extends Shape{
	void findArea() {
		int r = 10;
		double ar = 3.14*r*r;
		System.out.println("Area of circle"+ar);
	}
	void display() {
		System.out.println("This shape is a circle");
	}
}

