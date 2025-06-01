package opps;

public class Rectangle extends Shape{
	void findArea() {
		int l = 10;
		int b =5;
		int ar = l*b;
		System.out.println("Area of rectangle"+ar);
	}
	void display() {
		System.out.println("This shape is a rectangle");
	}
}
