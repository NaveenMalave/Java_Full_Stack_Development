package com.ProgrammingClass;

public class FirstNFabinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		System.out.println("the first "+n+" fabinocii series");
		int a =0;
		int b =1;
		for(int i=0;i<n;i++) {
			System.out.print(a+"  ");
			int temp=a+b;
			a=b;
			b=temp;
		}

	}

}
