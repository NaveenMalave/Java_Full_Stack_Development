package com.api;

import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a and b values");
		int  a = sc.nextInt();
	    int b = sc.nextInt();
		int add = addition(a,b);
		System.out.println("addition of two nos" + add);
	    swap(10,20);
	    System.out.println(checkPosNeg(4) ? "pos" : "neg");
	    System.out.println(everOrOdd( 7 ) ? "even" : "odd");
	    System.out.println("fibinocii ofn a no is" +fibNo(5));
	    System.out.println("power of a no is" + findPower(2,5));
	    System.out.println("square of no is " + findSquare(5));
	    System.out.println("cube of no is " + findCube(4));
	    System.out.println("sqrare root of no  " + squareRoot(25));
	    System.out.println("reverse of no " + revNo(1234));
	    System.out.println("given no is " + isPalindrome(12321));
	    System.out.println("sum of first n even nos " + sumOfFirstEvenNo(5));
	    System.out.println("sum of first n odd nos"+ sumOfFirstOddNo(5));
	    System.out.println("sum of all prime no untill n " +sumOfAllPrimeNoUntilN(10));
	    System.out.println(perfectSquare(25) ? " n is perfect square " : " n is not a perfect square");
	    System.out.println(duckNo(0321) ? "duck no " : " not duck no ");
	    System.out.println();
	}
	static int addition(int a ,int b) {
		
		return a+b;
	}
  static void swap(int x, int y) {
	  System.out.println("before swapping " + x +" " +y);
	  x = x + y;
	  y = x - y;
	  x = x -y;
	  System.out.println("after swapprint " + x + " " + y);
  }
  static boolean checkPosNeg(int n) {
	  if(n>0) {
		  return true;
	  }else {
		  return false;
	  }
  }
  static boolean everOrOdd(int m ) {
	  if(m%2==0) {
		  return true;
	  }else {
		  return false;
	  }
  }
  static int fibNo(int n) {
	  // nth fib of no
	  int n1= 0;
		int n2= 1;
		int fib=0;
		if(n==1) {
			return n1;
		}else if(n==2) {
			return n2;
		}else {
		for(int i=3;i<=n;i++) {
			fib = n1+n2;
			n1=n2;
			n2=fib;
		}
	  return fib;
		}
  }
  static int findPower(int a, int b) {
	  int ans = 1;
	  for(int i= 1;i<=b;i++) {
		  ans = ans * a;
	  }
	  return ans;
  }
  static int findSquare(int n) {
	  return n*n;
  }
 static  int findCube(int n ) {
	  return n*n*n;
  }
 static  double squareRoot(int n) {
	  double ans  = Math.sqrt(n);
	  return ans;
  }
  static int revNo(int n) {
	  int rev = 0;
	  while(n!=0) {
		  int rem = n%10;
		  rev = rev*10 +rem;
		  n=n/10;
	  }
	  return rev;
  }
  static String isPalindrome(int n) {
	  int ans = n;
	  int rev = 0;
	  while(n!=0) {
		  int rem = n%10;
		  rev = rev*10 +rem;
		  n=n/10;
	  }
	  if(rev ==ans)
	  return "palindraome";
	  else
       return "not palindrome";
  }
  static int sumOfFirstEvenNo(int n ) {
	  int sum =0;
	  for(int i = 1;i<=n;i++) {
		  if(i%2==0) {
			  sum = sum+i;
		  }
	  }
	  return sum;
	  
  }
  static int sumOfFirstOddNo(int n ) {
	  int sum =0;
	  for(int i = 1;i<=n;i++) {
		  if(i%2!=0) {
			  sum = sum+i;
		  }
	  }
	  return sum;
	  
  }
  static int sumOfAllPrimeNoUntilN(int n) {
	  int sum =0;
	  for(int i = 2;i<=n;i++) {
		  int flag = 0;
		  for(int j = 2;j<n/2;j++) {
			  if(i%j==0)
				  flag = 1;
			      break;
		  }
		  if(flag == 0)
			  sum = sum + i;
	  }
	  return sum;
  }
  static boolean perfectSquare(int n) {
	  // if no is perfect square retrun true
	    int sqrt = (int) Math.sqrt(n);
		if(sqrt*sqrt==n) {
			return true;
		}else {
			return false; 
		}
  }
  /*
  static boolean amstrongNo(int n ) {
	  // true if no is amstrong no 
  }*/
  static boolean duckNo(int n) {
	  // duck no 
	  while(n!=0) {
		  if(n%10==0) 
		  return true;
		  n = n/10; 
		  }
	  return false;
		  
	  }
	  
  /*static String xylem(int n) {
	  //XYLEM
  }*/
}
