package com.equals;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= new String("kodnest");
		String str2 = new String("kodnest");
		if(str1==str2) {
			System.out.println("References are equal");
		}else {
			System.out.println("References are not equal");
		}
		if(str1.equals(str2)) {
			System.out.println("Strings are equals");
		}else {
			System.out.println("strings are not equals");
		}
	}

}
