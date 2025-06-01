package fourty;

import java.util.Scanner;

public class prime20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		System.out.println("enter n value");
		int n = sc.nextInt();
		System.out.println("enter m value");
		int m = sc.nextInt();
		int sum =9;
		for(int i =n;i<=m;i++) {
			if(i==0 || i==1) 
				continue;
			int flag =1;
			for(int j = 2;j<=i/2;j++) {
				if(i%j==0) {
					flag =0;
				   break;
			}
			}
			if(flag==1) {
				int result = i+ 9;
			System.out.println(result==20 ? "invalid ": i);
			}
			
	}
	}

}
