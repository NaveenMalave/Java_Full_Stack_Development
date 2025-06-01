package com.Collections1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList al = new ArrayList();
  al.add(12);
  al.add(34);
  al.add(21);
  al.add(45);
  al.add(31);
  System.out.print("al--> [");
  Iterator itr =al.iterator();
  while(itr.hasNext()) {
	  System.out.print(itr.next()+" ");
  }
  System.out.println("]");
  System.out.println();
ArrayList al2 = new ArrayList();
al2.add(42);
al2.add(78);
al2.add(67);
System.out.print("al2-->"+al2);
System.out.println();
al.add(2,47);
System.out.println(al);
al.addAll(al2);
System.out.println(al);
System.out.println(al2);
al.addAll(4,al2);
System.out.println(al);
al2.clear();
System.out.println(al2);
System.out.println(al2.isEmpty());
System.out.println(al.contains(al2));
System.out.println(al);
al.remove(2);
System.out.println(al);
ArrayList al3 = new ArrayList();
al3.add(42);
al3.add(78);
al3.add(67);
System.out.print("al3--> ");
for(Object s : al3) {
	System.out.print(s+" ");
}
System.out.println();
System.out.println(al);
al.removeAll(al3);
System.out.print(al);
al.set(1, 33);
System.out.println(al);
	}

}
