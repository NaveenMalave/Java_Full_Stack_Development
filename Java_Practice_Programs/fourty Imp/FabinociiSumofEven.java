package fourty;

import java.util.Scanner;

public class FabinociiSumofEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		int n = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		int fib;
		if(n==1) {
			System.out.println(n1);
		}else if(n==2){
			System.out.println(n1+" \n"+n2);
		}else {
			System.out.println(n1+" \n"+n2);
			int sum=0;
			for(int i=1;i<=n-2;i++) {
				fib=n1+n2;
				if(fib%2==0) {
					sum=sum+fib;
				}
				System.out.println(fib);
				n1=n2;
				n2=fib;
			}
			System.out.println("sum of even fib nos "+sum);
		}

	}

}
