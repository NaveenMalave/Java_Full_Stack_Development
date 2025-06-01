package fourty;

import java.util.Scanner;

public class primePrv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		int n = sc.nextInt();
		
		if( isprime(n)) {
			System.out.println("no is prime "+ n);
			System.out.println("next prime is "+nextPrime(n));
		}else {
			System.out.println("no is not prime");
		}
		
	}

			static int nextPrime(int i) {
				if(i<=1)
					return 2;
				int next = i-1;
			
			while(!isprime(next)) {		
			next--;		
			}
			return next;
			
	}
	static boolean isprime(int n) {
		if(n==0 || n==1)
			return false;
		for(int i =2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	}


