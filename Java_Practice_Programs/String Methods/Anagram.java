package com.stringMethods;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  String  str1 ="abc";
	   String str2 ="cbv";
	   boolean res = Ana(str1,str2);
	   if(res) {
		   System.out.println("Anagram");
	   }else {
		   System.out.println("not Anagram");
	   }
	}
	   static boolean Ana(String str1,String str2) {
		   str1 = str1.toLowerCase();
		   str2 = str2.toLowerCase();
	   if(str1.length()!=str2.length()) {
		   return false;
	   }else {
		   char[] c1 = str1.toCharArray() ;
		   char[] c2 = str2.toCharArray();
		   Arrays.sort(c1);
		   Arrays.sort(c2);
		   String st1 = new String(c1);
		   String st2 = new String(c2);
		   if(st1.equals(st2)) {
			   return true;
		   }
		   
	   }
	   return  false;
	   
	   }

}
