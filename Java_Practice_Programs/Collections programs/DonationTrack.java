package com.programms;

import java.util.ArrayList;
import java.util.Scanner;

public class DonationTrack {

	public static void main(String[] args) {
		System.out.println("WELCOME TO FESTIVAL DONATION TRACKER");
		System.out.println();
		ArrayList<Integer> donations = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Days Donations Collected");
		int n = scanner.nextInt();
		System.out.println("Donations over "+n+" days");
		System.out.println();
	 for(int i =0;i<n;i++) {
		 System.out.print("On Day "+(i+1)+", collect :");
		donations.add(scanner.nextInt());
	}
	 int TotalDonations = calculateTotalDonations(donations);
	 System.out.print("Total Donations collected over the Days: ");
	 System.out.println(TotalDonations);
	}
	
	static int calculateTotalDonations(ArrayList<Integer>donations) {
		int sum =0;
		for(int i:donations) {
			sum+=i;
		}
		return sum;
	}
 
}
