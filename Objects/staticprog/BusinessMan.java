package staticprog;

import java.util.Scanner;

public class BusinessMan {
	double p,t,si;
	static double r;
	static {
		r=1.0;
	}
	
	void input() {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter p, t , t,");
		 p = sc.nextDouble();
		 t = sc.nextDouble();
		  r=1.0; 
		}
	void sit() {
		si =(p*t*r)/100;
	}
	void printsi() {
		System.out.println("si is "+si);
	}

}
