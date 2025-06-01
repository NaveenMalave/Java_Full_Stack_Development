package com.programms;

import java.util.ArrayList;
import java.util.Scanner;

public class CricketTeamSelection {

	public static void main(String[] args) {
		System.out.println("WELCOME TO CRICKET TEAM SELECTION");
		ArrayList<String> team = new ArrayList<>();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter Number of players:");
		int n = scanner.nextInt();
		
		for(int i =0;i<n;i++) {
			System.out.print("Player "+(i+1)+": ");
			String player = scanner.next();
			team.add(player);
		}
		System.out.println("Check Player:");
		String check = scanner.next();
		
		boolean isAvialable = checkPlayerAvailability(team,check);
		if(isAvialable) {
			System.out.println(check +" is Available in team.");
		}else {
			System.out.println(check +" is not Available in team");
		}
	}
	
	static boolean checkPlayerAvailability(ArrayList<String>team,String check) {
		for(String name: team) {
			if(name.equals(check)) {
				return true;
			}
		}
		return false;
	}

}
