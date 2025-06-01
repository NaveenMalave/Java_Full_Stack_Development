package codenest;

import java.util.Scanner;

public class array2d {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no of rows");
		int r = scan.nextInt();
		int c = scan.nextInt();
		scan.nextLine();
		String name[][] = new String[r][c];
		for(int i = 0;i<name.length;i++) {
			for(int j = 0;j<name.length;j++) {
				name[i][j] = scan.nextLine();
			}
		}
		for(int i = 0;i<name.length;i++) {
			for(int j = 0;j<name.length;j++) {
				System.out.print(name[i][j]);
			}
			System.out.println();
		}
	}

}
