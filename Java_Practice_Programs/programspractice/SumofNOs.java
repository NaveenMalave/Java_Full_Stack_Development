package programsprac;

import java.util.Scanner;

public class SumofNOs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a n value");
		int  n = sc.nextInt();
		int sum =0;
		for(int i =1;i<=n;i++) {
			sum = sum+i;
		}
		System.out.println("sum of n nos "+sum);

	}

}
