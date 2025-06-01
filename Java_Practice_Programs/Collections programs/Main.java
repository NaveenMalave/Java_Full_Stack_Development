package com.programms;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    ArrayList<Booking> bookings = new ArrayList<>();
     System.out.println("WELCOME TO BOOK MY SHOW");
     System.out.println();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number of bookings");
    int n = sc.nextInt();
    for(int i=0;i<n;i++) {
    	System.out.print((i+1)+"st person Name: ");
    	String name = sc.next();
    	System.out.print(" Person  SeatNo: ");
    	int seat = sc.nextInt();
    	
    	boolean isBooked = false;
    	for(Booking b :bookings) {
    		if(seat==b.seatNo) {
    			isBooked = true;
    			break;
    		}
    	}
    	if(!isBooked) {
    		Booking book= new Booking(name,seat);
    		bookings.add(book);
    	}
    }
    
   System.out.println("Enter the Number of cancellations ");
   int r = sc.nextInt();
   for(int i=0;i<r;i++) {
	   System.out.println((i+1)+"st cancellation Name: ");
	   String nam = sc.next();
	   bookings.removeIf(b -> b.name.equals(nam));
   }
   System.out.println("Total Booked Persons And SeatNos");
   for(int i=0;i<bookings.size();i++) {
	   
	   System.out.println(bookings.get(i).name +" -->Seat NO " + bookings.get(i).seatNo);
   }
   
	}

}
