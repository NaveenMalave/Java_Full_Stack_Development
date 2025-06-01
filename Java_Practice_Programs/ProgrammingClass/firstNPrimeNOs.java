package com.ProgrammingClass;

public class firstNPrimeNOs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		System.out.println("the first "+n +" prime numbers");
		for(int i=1;true;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0)
					count++;
		}
		if(count==2) {
			System.out.println(i);
			n--;
		}
		if(n==0)
			break;
		
		}
	}

}
