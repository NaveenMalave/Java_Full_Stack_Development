package com.ProgrammingClass;

public class first5amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int m =5;
		for(int i=100;true;i++) {
			boolean as = arm(i);
			if(as==true) {
				System.out.println(i);
				m--;
			}
			if(m==0) {
				break;
			}
		}

	}
	static boolean arm(int n) {
		int cop=n;
		String s = ""+n;
		int exp = s.length();
		int sum=0;
		while(n!=0) {
			int dig = n%10;
			sum=sum+(int)Math.pow(dig, exp);
			n/=10;
		}
		if(cop==sum) {
			return true;
		}else {
			return false;
		}
		
	}

}
