package com.programms;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieRatingApp {

	public static void main(String[] args) {
		System.out.println("MOVIE RATING TRACKER");
		System.out.println();
     ArrayList<MovieRating>movies = new ArrayList<>();
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter Number of movies and ratings");
     int n = scanner.nextInt();
     scanner.nextLine();
     for(int i=0;i<n;i++) {
    	 System.out.print((i+1)+" Movie Name: ");
    	 String name = scanner.next();
    	 System.out.print((i+1)+" Movie Rating: ");
    	 float rating = scanner.nextFloat();
    	 MovieRating movie = new MovieRating(name,rating);
    	 movies.add(movie);
     }
     float avg =0;
     for(MovieRating m : movies) {
    	 avg+=m.rating;
     }
     avg = avg/movies.size();
     System.out.println("Average Rating of All Movies");
     System.out.printf("%.2f",avg);
	}

}
