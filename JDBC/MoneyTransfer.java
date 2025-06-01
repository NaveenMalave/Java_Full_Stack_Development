package com.jdbc.transactions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MoneyTransfer {

	public static void main(String[] args) {
		Connection con = null;
	     PreparedStatement ps1 = null;
	     PreparedStatement ps2 = null;
	     Scanner sc = new Scanner(System.in);
	     String sql1 = "Update kodbank set balance=balance-?  where accNo = ?";
	     String sql2 = "Update kodbank set balance=balance+?  where accNo = ?";
 try {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/julyjdbc","root","root");
	 ps1= con.prepareStatement(sql1);
	 ps2= con.prepareStatement(sql2);
	 System.out.println("Enter From ACCNO to ACCNO  and amount to transfer");
	 int fan = sc.nextInt();
	 int tan = sc.nextInt();
	 int amt = sc.nextInt();
	 ps1.setInt(1, amt);
	 ps1.setInt(2, fan);
	 ps2.setInt(1, amt);
	 ps2.setInt(2, tan);
	int no = ps1.executeUpdate();
	System.out.println(no +"");
	no = ps2.executeUpdate();
	System.out.println(no +" ");
	con.commit();
	
	
	con.close();
	ps1.close();
	ps2.close();
	sc.close();
 }catch(Exception e) {
	 try {
		 con.rollback();
	 }catch(Exception e1) {
		 e.printStackTrace();
	 }
 }
 
	}

}
