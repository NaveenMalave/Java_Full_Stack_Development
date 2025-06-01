package fourty;

import java.util.Scanner;

public class primeNonSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value");
		int n = sc.nextInt();
		System.out.println("enter n value");
		int m = sc.nextInt();
		int sum=0;
		for(int i = n ;i<=m;i++) {
			int flag =1;
			if(i==0 || i==1)
				flag=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=0;
					break;
				}
			}
			if(flag==0)
				System.out.println(i);
			if(flag==0)
				sum=sum+i;
		}
		System.out.println("sum of non primes"+sum);

	}

}
