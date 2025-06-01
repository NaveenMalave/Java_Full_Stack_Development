package Basics;
import java.util.*;

public class No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int choice;
		do {
			System.out.println("1.option");
			System.out.println("2option");
			System.out.println("3.exit");
			System.out.println("enter your choice");
			//choice = sc.nextInt();
			//System.out.println("your " +choice);
			int choice =1;
			switch(choice) {
			case 1:
				System.out.println("your choice is 1");
				break;
			case 2:
				System.out.println("your choice is 2");
				break;
			case 3:
				System.out.println(" Exit");
				break;
			default:
				System.out.println("Invalid chice");
				break;
			}
		}while(choice!=3);

	}

}
