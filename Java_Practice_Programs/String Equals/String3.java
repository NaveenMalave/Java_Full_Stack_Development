package com.equals;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Kodnest";
		String s2 = new String("Kodnest");
		String s3 = new String("KODNEST");
		if(s1==s2) {
			System.out.println("References are equal");
		}else {
			System.out.println("References are not equal.");
		}
		if(s1.equals(s2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		if(s2==s3) {
			System.out.println("s2 and s3 references are equal");
		}else {
			System.out.println("s2 and s3 references are not equal");
		}
		if(s2.equals(s3)) {
			System.out.println("s2 and s3 strings are equal");
		}else {
			System.out.println("s2 and s3 strings are not equal");
		}
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("s2 and s3 strings are equal if cases are ignored");
		}else {
			System.out.println("s2 and s3 strings are not equal if cases are ignord");
		}

	}

}
