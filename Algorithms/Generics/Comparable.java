package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable {
public static void main(String[] args) {
	List<Integer> al = new ArrayList<Integer>();
	al.add(100);
	al.add(50);
	al.add(150);
	al.add(25);
	al.add(75);
	al.add(125);
	al.add(175);
	System.out.println("Before Sorting---: "+al);
	Collections.sort(al);
	System.out.println("After sorting--:"+al);
	
	
}
}
