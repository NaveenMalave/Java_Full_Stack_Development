package fourty;

import java.util.Scanner;

public class PrimeCO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a n value");
		int n = sc.nextInt();
		System.out.println("enter a m value");
		int m = sc.nextInt();
		coPrime(n,m);
	}
	static void coPrime(int n , int m) {
		if( GCD(n,m)==1)
        System.out.println("co-prime");
        else
        	System.out.println("NO coprime");
	}
	static int GCD(int n , int m) {
		if(n==0 || m==0)
			return 0;
		if(n==m)
			return n;
		if(n>m)
			return GCD(n-m,m);
		return GCD(n,m-n);
	}

}
