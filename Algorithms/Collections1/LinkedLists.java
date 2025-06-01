package com.Collections1;

import java.util.LinkedList;
import java.util.Iterator;
public class LinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList  ll = new LinkedList();
		ll.add(12);
		ll.add(34);
		ll.add(45);
		ll.add(54);
     System.out.println(ll);
     for(int i =0;i<=ll.size()-1;i++) {
    	 System.out.print(ll.get(i)+" ");
     }
     System.out.println();
     for(Object x:ll) {
    	 System.out.print(x+" ");
     }
     System.out.println();
     Iterator itr=ll.iterator();
     while(itr.hasNext()==true) {
    	 System.out.println(itr.next()+" ");
     }
     
	}

}
