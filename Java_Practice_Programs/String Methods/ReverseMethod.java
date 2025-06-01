package com.stringMethods;
import java.util.*;
public class ReverseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter as string");
		String s = sc.nextLine();
		System.out.println(" before reversing "+s  );
		StringBuffer st = new StringBuffer(s);
		st.reverse();
		System.out.println("after reverseing "+st);
	}

}
