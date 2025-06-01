package com.stringMethods;
import java.util.*;
public class ReversewithOutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string");
		Scanner sc  = new Scanner(System.in);
		String s = sc.nextLine();
		String sr = reverse(s);
		System.out.println("the reverse of string is "+sr);

	}
	static String reverse(String s) {
		char[] ch = s.toCharArray();
		int arr[] = new int[ch.length];
		int j = arr.length-1;
		for(int i = 0;i<ch.length;i++) {
			arr[j]=ch[i];
			j--;
			
		}
		String str =arr.toString(arr);
		return str;
		
	}

}
