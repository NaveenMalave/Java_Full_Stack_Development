package com.stringMethods;

public class StringMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Kodnest";
		String str = s.intern();
		String str1="Kodnest";
		if(str==str1) {
			System.out.println("str and str1 references are equal");
		}else {
			System.out.println("str and str2 references are unequal");
		}
		System.out.println("================================");
		String s1 = "Sourav";
		String s2 = "Sachin";
		if(s1.compareTo(s2)>0) {
			System.out.println("String 1"+s1+"is greater");
		}else if(s1.compareTo(s2)<0) {
			System.out.println("string 2"+s2+"is greater");
		}else {
			System.out.println("String1 "+s1+"and string 2"+s2+"both are equal");
		}
		System.out.println("===============================");
		String name="OMKAR";
		char[] ch = name.toCharArray();
		for (char c : ch) {
			System.out.println(c+" ");
		}
		System.out.println();
		System.out.println("==================");
	String org ="Kodnest Technologies pvt ltd";
	 String[] strr=org.split("e");
   for (String string : strr) {
	System.out.println(string+" ");
}
	}

}
