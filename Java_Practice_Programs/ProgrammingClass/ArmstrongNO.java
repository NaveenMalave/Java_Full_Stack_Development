package com.ProgrammingClass;

public class ArmstrongNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int copy=n;
		String s = ""+n;
		int exp = s.length();
		int sum=0;
		while(n!=0) {
			int dig = n%10;
			sum=sum+(int)Math.pow(dig, exp);
			n/=10;
		}
		if(copy==sum) {
			System.out.println(copy+ " is armstrong No");
		}else {
			System.out.println(copy+" is not an armstrong no");
		}

	}

}
