package programsprac;

import java.util.Scanner;

public class SumofEvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a n value");
		int  n = sc.nextInt();
		int sum =0;
		for(int i =1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			sum = sum+i;
			}
		}
		System.out.println("sum of n even nos "+sum);


	}

}
