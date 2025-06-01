package com.equals;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "omkar";
String s2 = "omkar";
if(s1==s2) {
	System.out.println("References are equal");
}else {
	System.out.println("References are not equal");
}
if(s1.equals(s2)) {
	System.out.println("Strings are equals");
}else {
	System.out.println("strings are not equals");
}
	}

}
