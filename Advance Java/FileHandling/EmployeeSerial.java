package com.FileHandling;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerial {
	
		public static void main(String[] args) {
	 try {
		 Employser em = new Employser(12,"ram");
		 String serialpath = "G:\\IO\\sourse.txt";
		 FileOutputStream fis = new FileOutputStream(serialpath);
		 ObjectOutputStream os = new ObjectOutputStream(fis);
		os.writeObject(em);
		 System.out.println("SERIALIZED DATA IS SAVED");
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
		

	}


}
