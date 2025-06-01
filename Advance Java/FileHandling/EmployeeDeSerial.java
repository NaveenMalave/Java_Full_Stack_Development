package com.FileHandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmployeeDeSerial {

	public static void main(String[] args) {
 try {
	 String serialpath = "G:\\IO\\sourse.txt";
	 FileInputStream fis = new FileInputStream(serialpath);
	 ObjectInputStream os = new ObjectInputStream(fis);
	 Employser ref = (Employser) os.readObject();
	 System.out.println("TADAA...OBJECT CONSTURCTED...DETAILS ARE");
	 System.out.println(ref.getAge());
	 System.out.println(ref.getName());
 }catch(Exception e) {
	 e.printStackTrace();
 }
	}

}
