import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteDemo {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		String path ="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/julyjdbc";
		String user = "root";
		String pwd = "root";
		String sql = "Delete from kodnest where id=? ";
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName(path);
			System.out.println("Driver connectd");
			con =DriverManager.getConnection(url,user,pwd);
			System.out.println("Connected");
			ps=con.prepareStatement(sql);
			System.out.println("enter  id  to delete");
			
			int id = sc.nextInt();
			ps.setInt(1, id);
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
