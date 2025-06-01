package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Student s1 = new Student(122,"dheeraj",24,"Male",96,8,"Dhee@dhee.com");
   Student s2 = new Student(123,"dhanraj",23,"Male",96,8,"Dhanraj@.com");
   Student s3 = new Student(124,"dhoni",24,"Male",96,8,"Dhoni@dhee.com");
   Student s4 = new Student(125,"dhanush",24,"Male",96,8,"Dhanush@dhee.com");
   Student s5 = new Student(126,"dharma",24,"Male",96,8,"Dharma@dhee.com");
  
   
   HashMap hm = new HashMap();
   hm.put(50, s1);
   hm.put(100, s2);
   hm.put(25, s3);
   hm.put(75, s4);
   System.out.println(hm.get(50));
   
   HashMap<String,Student> hm2 = new HashMap<String, Student>();
   hm2.put("Firs", s1);
   hm2.put("second",s2);
   hm2.put("third", s3);
   hm2.put("fourst", s4);
   System.out.println(hm2);
   
   LinkedHashMap<String, Student> hm3=new LinkedHashMap<String, Student>();
   hm3.put("First", s1);
   hm3.put("second", s2);
   hm3.put("third", s3);
   hm3.put("Fourth", s4);
   hm3.put("Fifth", s5);
   System.out.println(hm2);
   
   
  TreeMap tm = new TreeMap<>();
  tm.put(86, "NagRaj");
  tm.put(42, "Naresh");
  System.out.println(tm);
   
   
	}

}
