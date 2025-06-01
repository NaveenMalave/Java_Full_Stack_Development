package fourty;

import java.util.Scanner;

public class GCDanother2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a n value");
		int n = sc.nextInt();
		System.out.println("enter a m value");
		int m = sc.nextInt();
		int gcd=1;
		for(int i =1 ;i<=n && i<=m;i++) {
			if(n%i==0 && m%i==0)
				gcd=i;
		}
     System.out.println("GCD of a NO "+gcd);

	}

}
