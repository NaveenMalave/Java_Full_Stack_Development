import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;



public class InsertDemo {

	public static void main(String[] args) {
   Connection con = null;
   PreparedStatement sm = null;

   String path = "com.mysql.cj.jdbc.Driver";
   String url = "jdbc:mysql://localhost:3306/julyjdbc";
   String user = "root";
   String pwd = "root";
   String sql = "Insert into kodnest values (?,?,?)";
   Scanner sc = new Scanner(System.in);
   try {
	   Class.forName(path);
	   System.out.println("Driver loaded");
	   con = DriverManager.getConnection(url,user,pwd);
	   System.out.println("connection established");
	   sm= con.prepareStatement(sql);
	   System.out.println("Enter the id name and marks");
	   int id = sc.nextInt();
	   String name = sc.next();
	   sc.nextLine();
	   int marks = sc.nextInt();
	   sm.setInt(1, id);
	   sm.setString(2, name);
	   sm.setInt(3,marks);
	   int rsu = sm.executeUpdate();
	   System.out.println(rsu+ "row(s) effected.");
	   
   }catch(Exception e) {
	   e.printStackTrace();
   }finally {
	   try {
		   con.close();
		   sm.close();
	
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
   }
	}

}
