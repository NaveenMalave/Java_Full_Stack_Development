package com.EmplyeeDatatype;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] arr= new Employee[5];
		Employee e1=new Employee();
		e1.name="Omkar";
		e1.sns=12;
		e1.gender="male";
	    e1.salary=120000;
	    e1.work();
	    
	    arr[0]=e1;
	    
	    Employee e2=new Employee();
		e2.name="ysin";
		e2.sns= 15;
		e2.gender="male";
	    e2.salary=10000;
	    
	    
	    arr[1]=e2;
	    Employee e3=new Employee();
		e3.name="ramya";
		e3.sns=14;
		e3.gender="female";
	    e3.salary=15000;
	    
	    
	   Employee e4 = new Employee();
	   e4.name="kishore";
	   e4.sns=236;
	   e4.gender="male";
	   e4.salary=36777;
	   
	   Employee e5 = new Employee();
	   e5.name="mark";
	   e5.sns=552;
	   e5.gender="male";
	   e5.salary=5655;
	    
	    arr[2]=e3;
	    arr[3]=e4;
	    arr[4]=e5;
	    
	    for(int i=0;i<arr.length;i++) {
	    System.out.println(arr[i].name+" "+arr[i].sns+" "+arr[i].gender+" "+arr[i].salary);
	    }
	     
	    
	}

}
