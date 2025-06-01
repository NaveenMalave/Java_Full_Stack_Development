package fourty;

import java.util.Scanner;

public class GCDanother3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a n value");
		int n = sc.nextInt();
		System.out.println("enter a m value");
		int m = sc.nextInt();
		while(n!=m) {
			if(n>m)
				n=n-m;
			else
				m=m-n;
		}
		System.out.println("GCD of nos "+m);

	}

}
