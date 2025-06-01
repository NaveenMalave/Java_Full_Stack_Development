package com.array1;

import java.util.Scanner;

public class API {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Select Plan");
		System.out.println("Free");
		System.out.println("Premium");
		String str1 = scan.next();
		if(str1.equals("Free")) {
			System.out.println("Enter upto 10 requests");
			for(int i=1;i<=10;i++) {
				int takeInput=scan.nextInt();
				if(i==10) {
					System.out.println("Your Free quota is finished");
				}
			}
		}
		
		else if(str1.equals("Premium")) {
			for(int i=0;i<=100;i++) {
				int takeInput=scan.nextInt();
			}
		}
	}
}
