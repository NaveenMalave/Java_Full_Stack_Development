package fourty;

import java.util.Scanner;

public class FactorsTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no ");
		int n = sc.nextInt();
		System.out.println("factors of "+n);
		int count=0;
		for(int i =1;i<=n;i++) {
			if(n%i==0) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("total no of factors of  no "+n+" is "+count);

	}

}
