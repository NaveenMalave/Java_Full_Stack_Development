package com.singleton;

public class Ceo {
	 private String name;
	 private int salary;
	 private static Ceo c ;
	 private Ceo() {
		
	 }
	  void  bringBusiness() {
		 System.out.println(name +"who is the ceo bring busness");
	 }
	 void takeLeave() {
		 System.out.println(name+"ceo is taking leave");
	 }
	 void attendMeeting() {
		 System.out.println(name+"ceo is attending policy ");
	 }
	 
	private Ceo(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public static Ceo getCeo(String name , int salary) {
		if(c==null) {
			c = new Ceo(name, salary);
		}
		return c;
		
	}

}