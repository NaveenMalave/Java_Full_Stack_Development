package com.sortings;

import java.util.Scanner;

public class PaypalProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO ARRAY IMPLEMENTATION");
		Scanner scan = new Scanner(System.in);
		System.out.println("enter array size");
		ArrayPay arr = new ArrayPay(scan.nextInt());
		int choice;
		do {
		System.out.println("PLEASE CHOOSE AN OPTION");
		System.out.println("PRES -1 TO INSERT");
		System.out.println("PRES -2 TO DELETE");
		System.out.println("PRES -3 TO DISPLAY");
		System.out.println("PRES -4 TO SEARCH");
		System.out.println("PRES -5 TO SORT");
		System.out.println("ANY OTHER NO TO STOP");
		choice = scan.nextInt();
		if(choice>=1 && choice<=5) {
		switch(choice){
			case 1: 
				System.out.println("enter "+arr.length()+" Elements");
				for(int i=0;i<=arr.length()-1;i++) {
					arr.insert(i, scan.nextInt());
				}
				break;
			case 2:
				System.out.println("Enter index to delete");
				arr.delete(scan.nextInt());
				break;
			case 3:
				arr.display();
				System.out.println();
				break;
			case 4:
				arr.Sort();
				arr.display();
				System.out.println("enter a element to search");
				int key = scan.nextInt();
				int index = arr.binarySearch(key);
				if(index>=0) {
					System.out.println("element "+key+" found at index "+index);
				}else {
					System.out.println("element "+key+" is not found at index4");
				}
				break;
			case 5:
				arr.Sort();
				arr.display();
				break;
		}
		}else if(choice>=6) {
			System.out.println("Enter valid choice..");
			break;
			
		}
		}while(choice<6);
		System.out.println("STOPED...Exiting... Byee..");

	}

}
