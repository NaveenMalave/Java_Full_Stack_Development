package com.encapuslation;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Student st = new Student();
   st.setName("asin");
   st.setId(1);
   st.setAge(22);
   st.setMarks(45);
   System.out.println(st.getName());
   System.out.println(st.getId());
   System.out.println(st.getAge());
   System.out.println(st.getMarks());
	}

}
