package com.Collections1;

import java.util.ArrayDeque;
import java.util.Iterator;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad = new ArrayDeque();
		ad.add(100);
		ad.add(50);
		ad.add(150);
		ad.add(25);
		ad.add(75);
		ad.add(125);
		ad.add(175);
		ad.add(75);
		ad.add(75);
		System.out.println(ad);
		ad.addFirst(99);
	    System.out.println(ad);
	    ad.addLast(999);
	    System.out.println(ad);
	    ad.offer(1000);
	    System.out.println(ad);
	    ad.offerFirst(2000);
	    System.out.println(ad);
	    ad.offerLast(3000);
	    System.out.println(ad);
	    ad.removeFirstOccurrence(75);
	    System.out.println(ad);
	    ad.removeLastOccurrence(175);
	    System.out.println(ad);
	    System.out.println(ad.peek());
	    System.out.println(ad);
	    System.out.println(ad.remove());
	    System.out.println(ad);
	    System.out.println(ad.poll());
	    System.out.println(ad);
	    Iterator itr = ad.iterator();
	   while(itr.hasNext()) {
		   System.out.print(itr.next()+" ");
	   }
	   System.out.println();
	   for(Object  i : ad) {
		   System.out.print(i+" ");
	   }
	   

	}

}
