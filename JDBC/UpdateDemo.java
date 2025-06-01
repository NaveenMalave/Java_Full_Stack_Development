import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		String path ="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/julyjdbc";
		String user = "root";
		String pwd = "root";
		String sql = "Update kodnest set name=? where id =?";
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName(path);
			System.out.println("Driver connectd");
			con =DriverManager.getConnection(url,user,pwd);
			System.out.println("Connected");
			ps=con.prepareStatement(sql);
			System.out.println("enter name to delete");
			String name = sc.next();
			int id = sc.nextInt();
			ps.setString(1, name);
			ps.setInt(2, id);
			int no =ps.executeUpdate();
			System.out.println(no +" row(s) removed");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				ps.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
