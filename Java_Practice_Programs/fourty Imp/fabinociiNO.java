package fourty;

import java.util.Scanner;

public class fabinociiNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a fib of a no");
		int n = sc.nextInt();
		int n1= 0;
		int n2= 1;
		int fib=0;
		if(n==1) {
			System.out.println(n1);
		}else if(n==2) {
			System.out.println(n2);
		}else {
		for(int i=3;i<=n;i++) {
			fib = n1+n2;
			n1=n2;
			n2=fib;
		}
		System.out.println(fib);
		}

	}

}
