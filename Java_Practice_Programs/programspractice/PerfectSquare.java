package programsprac;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		int n = sc.nextInt();
		int sqrt = (int) Math.sqrt(n);
		if(sqrt*sqrt==n) {
			System.out.println(n+" is perfect square");
		}else {
			System.out.println(n+" is not a perfect square");
		}
	}
}
