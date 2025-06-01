package Basics;
import java.util.*;
public class InputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your rollnumber");
		int rollnum = scan.nextInt();
		System.out.println("enter rollNO :" +rollnum);
		System.out.println("enter your height");
		float height = scan.nextFloat();
		System.out.println("enter height: "+height);
		System.out.println("Are your married say trie/flase");
		boolean ms = scan.nextBoolean();
		System.out.println("married ?: " +ms);
		System.out.println("enter your first name");
		String name = scan.next();
		System.out.println("entered name :"+name);
		System.out.println("enter your mesg");
		scan.nextLine();
		String msg = scan.nextLine();
		System.out.println("entered message :"+msg);
	}

}
