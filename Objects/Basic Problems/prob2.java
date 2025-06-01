package codenest;
import java.util.*;

public class prob2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no ");
		int n = sc.nextInt();
		int res = 1;
		while(n>0) {
			res = res * (n%10);
			n = n/10;
		}
		System.out.println(res+"-->output");
	}
}
