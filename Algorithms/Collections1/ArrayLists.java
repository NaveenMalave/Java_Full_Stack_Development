package com.Collections1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(23);
		al.add(34);
		al.add(66);
		al.add(78);
		al.add(54);
		System.out.println(al);
		System.out.print("[");
		for(int i =0;i<=al.size()-1;i++) {
			if(i<al.size()-1)
			System.out.print(al.get(i)+",");
			else
				System.out.print(al.get(i)+"]");
		}
		System.out.println();
		for(Object a : al) {
			System.out.print(a +" ");
		}
		System.out.println();
		Iterator itr = al.iterator();
		while(itr.hasNext()==true) {
			System.out.print(itr.next()+" ");
		}

	}

}
