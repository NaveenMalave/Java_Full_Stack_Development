package fourty;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a n value");
		int n = sc.nextInt();
		System.out.println("enter a m value");
		int m = sc.nextInt();
		int rem ;
		while(m!=0) {
			rem = n%m;
			n=m;
			m=rem;
		}
   System.out.println("GCD of a NO "+n);
	}

}
