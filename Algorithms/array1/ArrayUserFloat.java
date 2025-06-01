package com.array1;
import java.util.*;
public class ArrayUserFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		Float arr[] = new Float[sc.nextInt()];
		
		for(int i = 0;i<=arr.length-1;i++) {
			System.out.println("enter height of player"+i);
			 arr[i] = sc.nextFloat();
		}
		for(float i:arr) {
			System.out.println(i);
		}
       
	}

}
