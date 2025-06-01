package fourty;

import java.util.Scanner;

public class PrimeFactorsNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a n value");
		int n = sc.nextInt();
		System.out.println("prime factors of "+n);
		while(n%2==0) {
			System.out.println(2 +" ");
			n/=2;
		}
		for(int i =3;i<=Math.sqrt(n);i+=2) {
			while(n%i==0) {
				System.out.println(i +" ");
				n/=i;
			}
		}
		if(n>2)
			System.out.println(n);

	}

}
