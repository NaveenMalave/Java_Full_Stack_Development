package com.ExceptionHandling;
import java.util.*;
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Connection established");
try {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter two nos");
	int num = sc.nextInt();
	int dem = sc.nextInt();
	int q = num/dem;
	System.out.println("Division result"+q);
	System.out.println("Enter Array lengt");
	int arr[] =new int[sc.nextInt()];
	System.out.println("Enter element position to insert element into Array");
	int el = sc.nextInt();
	int pos= sc.nextInt();
	arr[pos]=el;
	System.out.println("element at position "+pos+"is inserted");
}catch(Exception e) {
	System.out.println("SOME ISSUE OCCURED  PLEASE TRY AGAIN..");
}
System.out.println("Connection terminated ");
	}

}
