package com.ProgrammingClass;

public class BiggestFourDigitPimeNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=9999;true;i--) {
			if(prime(i)==true) {
				System.out.println("The larget  4 digit prime "+i);
				break;
			}
		
		}

	}
	static boolean prime(int n) {
		int fact=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) 
				fact++;	
		}
		if(fact==2)
			return true;
		else
			return false;
	}

}
