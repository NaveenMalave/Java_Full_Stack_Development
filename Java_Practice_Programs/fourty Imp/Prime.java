package fourty;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value");
		int n = sc.nextInt();
		int flag=0;
		if(n==0 || n==1) {
			flag = 1;
		}else {
		for(int i =2;i<=n/2;i++) {
			if(n%i==0) {
				flag =1;
			}
		}
		}
		System.out.println(flag==0 ? "prime " : "not prime");
	}
}
