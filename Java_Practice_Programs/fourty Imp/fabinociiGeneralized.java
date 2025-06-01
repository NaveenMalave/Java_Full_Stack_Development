package fourty;

import java.util.Scanner;

public class fabinociiGeneralized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first no");
		int n1 = sc.nextInt();
		System.out.println("enter a second no");
		int n2 = sc.nextInt();
		System.out.println("enter a no of values ");
		int n = sc.nextInt();
		int fib=0;
		System.out.println("Generalized Fibonacci Sequence:");
		if(n==1) {
			System.out.print(n1);
		}else if(n==2){
			System.out.print(n1+" \n"+n2);
		}else {
			System.out.print(n1+" "+n2+" ");
			for(int i=2;i<n;i++) {
				fib=n1+n2;
				System.out.print(fib +" ");
				n1=n2;
				n2=fib;
			}
		}

	}

}
