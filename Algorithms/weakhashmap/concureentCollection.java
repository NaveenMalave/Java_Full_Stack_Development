package com.weakhashmap;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class concureentCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList al = new CopyOnWriteArrayList();
		al.add(56);
		al.add(67);
		al.add(43);
		al.add(90);
		Iterator itr = al.iterator();
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
    	   al.add(200);
       }
		
	}

}
