package opps;

public class ShapeApp {

	public static void main(String[] args) {
		Shape s;
		Square sq = new Square();
		Rectangle re = new Rectangle();
		Circle ci = new Circle();
		
		s=sq;
		s.findArea();
		s.display();
		
		s = re;
		s.findArea();
		s.display();
		
		s = ci;
		s.findArea();
		s.display();

	}

}
