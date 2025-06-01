package com.Collections1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(23);
		ll.add(12);
		ll.add(34);
		ll.add(45);
		ll.add(56);
		ll.add(67);
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println(ll.get(1));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll.poll());
		System.out.println(ll);
		ll.add(1,44);
		ll.add(2,54);
		System.out.println(ll);
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
		System.out.println(ll);
		ll.push(13);
		System.out.println(ll);
		ll.pop();
		System.out.println(ll);
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		System.out.println(ll);
		LinkedList ll2 = new LinkedList();
		ll2.add(100);
		ll2.add(50);
		ll2.add(150);
		ll2.add(25);
		ll2.add(75);
		System.out.println("ll2--> "+ll2);
		LinkedList ll3 = new LinkedList();
		ll3.add(100);
		ll3.add(50);
		ll3.add(250);
		ll3.add(205);
		ll3.add(750);
		System.out.println("ll3--> "+ll3);
		ll2.retainAll(ll3);
		System.out.println(ll2);
		System.out.println(ll3);
		
	}

}
