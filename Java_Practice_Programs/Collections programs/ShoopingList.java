package com.programms;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoopingList {

	public static void main(String[] args) {
		System.out.println("WELCOME TO SHOPPING LIST MANAGER");
		System.out.println();
		ArrayList<String> shoppingList  = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number of Items  to be Purchased");
		int n = scanner.nextInt();
		
		for(int i =0;i<n;i++) {
			System.out.print("Item "+(i+1)+" to Add in  List: ");
			String item = scanner.next();
			shoppingList.add(item);
		}
		System.out.println("Enter Number of Purchased Items to be Remove");
			int itemRemove = scanner.nextInt();
			for(int i =0;i<itemRemove;i++) {
				System.out.println((i+1) + "st Item to Remove in list ");
				shoppingList.remove(scanner.next());
			}
			System.out.println("Total Items in the Shopping List ");
			for(int i=0;i<shoppingList.size();i++) {
					System.out.println("Item "+(i+1)+": "+shoppingList.get(i));
			}
		
	}

}
