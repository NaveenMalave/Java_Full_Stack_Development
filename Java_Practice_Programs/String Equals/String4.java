package com.equals;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Rama";
		String s2 = "Sita";
		String s3 = s1+s2;
		String s4 = s1+s2;
		String s5 = "Rama" + "Sita";
		String s6 = "Rama" +"Sita";
		if(s3==s4) {
			System.out.println("References are equal");
		}else {
			System.out.println("References are not equal");
		}
		if(s3.equals(s4)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("strings are not equals");
		}
		if(s5==s6) {
			System.out.println("s5 and s6 references are equal");
		}else {
			System.out.println("s5 and s6 references are not equal");
		}
		if(s5.equals(s6)) {
			System.out.println("s5 and s6 strings are equal");
		}else {
			System.out.println("s5 and s6 strings are not equal");
		}
	}

}
