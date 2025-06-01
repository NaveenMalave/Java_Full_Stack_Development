package staticprog;

public class Demo {
	static int a,b,c;
	static {
		a =100;
		b=200;
		c=300;
	}
static void display1() {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
 int x,y,z;
 {
 x=400;
 y=500;
 z=600;
 a=700;
 b=800;
 c=900;
}
 void diaplay2() {
	 System.out.println(x);
	 System.out.println(y);
	 System.out.println(z);
	 System.out.println(a);
	 System.out.println(b);
	 System.out.println(c);
 }
}
