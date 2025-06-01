package com.construct;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("omkar",16,"male",45,1,"bangalore");
		System.out.println(st.name+" "+st.age+" "+st.gender+" "+st.marks+" "+st.sem+" "+st.address);
		Student st1 = new Student("ram",17,"male",48,2,"adoni");
		System.out.println(st.name+" "+st1.age+" "+st1.gender+" "+st1.marks+" "+st1.sem+" "+st1.address);
		
		Student st2 = new Student();
		System.out.println(st2.name+" "+st2.age+" "+st2.gender+" "+st2.marks+" "+st2.sem+" "+st2.address);
		
		Student st3 = new Student("yasin");
		System.out.println(st3.name+" "+st3.age+" "+st3.gender+" "+st3.marks+" "+st3.sem+" "+st3.address);

	}

}
