package com.equals;

public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= new String("Rama");
		String s2=s1;
		if(s1==s2) {
			System.out.println("Reference are equal");
		}else {
			System.out.println("Reference are unequal");
		}
		if(s1.equals(s2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are unequal");
		}
		String s3="Kodnest";
		System.out.println(s3);
		String s4 = s3.concat("Technologies");
		System.out.println(s3);
		System.out.println(s4);
	}

}
