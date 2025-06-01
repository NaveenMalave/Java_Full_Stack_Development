import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class JdbcDemo {

	public static void main(String[] args) {
 try {
	 //step -1 load the driver
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 System.out.println("Driver Loaded");
	 
	 //step-2 Establish connection
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/julyjdbc","root","root");
	 System.out.println("Connection Established");
	 
	 //step-3 Statement created
	 Statement stmt = con.createStatement();
	 System.out.println("Statement medium created.");
	 
	 //step -4 query
	 String sql = "Select * from kodnest";
	 ResultSet rs = stmt.executeQuery(sql);
	 System.out.println("Query executed result in java");
	 
	 //step-5 Displaying the result set
	 System.out.println("ID"+" | "+"Name"+" | "+"marks ");
	 System.out.println("================================");
	 while(rs.next()) {
		 System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getInt(3));
	 }
	 
	 // Step -6 closing the resourse
	 rs.close();
	 con.close();
	 stmt.close();
 }catch(Exception e) {
	 e.printStackTrace();
 }
	}

}
