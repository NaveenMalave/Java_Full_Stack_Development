package com.weakhashmap;

import java.util.WeakHashMap;

public class WeakMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1,"suraj",34);
		Student s2 = new Student(2,"rajesh",44);
		Keys key1 = new Keys(100);
		Keys key2 = new Keys(200);
		WeakHashMap hm = new WeakHashMap();
        hm.put(key1, s1);
        hm.put(key2, s2);
        System.out.println(hm);
        key1 = null;
        System.gc();
        for(int i =0 ;i<=300;i++) {
        	System.out.println("");
        	if(i ==300) {
        		System.out.println();
        		System.out.println("Done....");
        	}
        }
        System.out.println();
        System.out.println(hm);
	}

}
