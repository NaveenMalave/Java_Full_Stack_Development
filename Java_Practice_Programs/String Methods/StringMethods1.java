package com.stringMethods;

import java.util.Iterator;

public class StringMethods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Raja Ram Mohan Roy";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf('R'));
		System.out.println(str.lastIndexOf('R'));
		System.out.println(str.endsWith("Ram"));
		System.out.println(str.startsWith("Raj"));
		System.out.println(str.isEmpty());
		System.out.println(str.replace("R", "A"));
		System.out.println(str.replaceAll("Ram", "kam"));
		System.out.println(str.length());
		System.out.println(str.concat(" freedom fighter"));
		
	}

}
