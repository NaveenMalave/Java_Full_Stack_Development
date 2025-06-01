import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class FetchData {

	public static void main(String[] args) {
     Connection con = null;
     PreparedStatement stm = null;
     ResultSet rs = null;
     String path="com.mysql.cj.jdbc.Driver";
     String url="jdbc:mysql://localhost:3306/julyjdbc";
     String username = "root";
     String pwd = "root";
     Scanner sc = new Scanner(System.in);
     String sql = "Select * from kodnest where id = ?";
     
     try{
    Class.forName(path);
    System.out.println("Driver loaded");
    
    con= DriverManager.getConnection(url,username,pwd);
    System.out.println("connection established");
    
    stm = con.prepareStatement(sql);
    System.out.println("enter the id to fetch the data.");
    int id = sc.nextInt();
    
   stm.setInt(1,id);
   rs=stm.executeQuery();
    
   if(rs.next()) {
	   System.out.println(rs.getInt(1) +" | "+rs.getString(2)+" | "+rs.getInt(3));
   }else {
	   System.out.println(" Incorrect user ID");
   }
     }catch(Exception e) {
    	 e.printStackTrace();
     }finally {
    	 try {
    		 con.close();
    		 stm.close();
    		 rs.close();
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }
     }
     
	}

}
