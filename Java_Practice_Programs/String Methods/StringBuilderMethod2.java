package com.stringMethods;

public class StringBuilderMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s= new StringBuffer();
		System.out.println(s.capacity());
		s.append("omkar");
		System.out.println(s.capacity());
		s.append("is a cricketer");
		System.out.println(s.capacity());
		System.out.println(s);
System.out.println("===============================");
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("omkar is cricketer");
		System.out.println(sb.capacity());
		sb.append("lives in bangalore");
		System.out.println(sb.capacity());
		System.out.println(sb);
		System.out.println("==================");
		
		StringBuffer s1 = new StringBuffer();
		s1.ensureCapacity(100);
		System.out.println(s1.capacity());
	}

}
