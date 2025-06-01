package patterns;

public class prachome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1;i<=3;i++) {
		for(int j =1;j<=2+i;j++ ) {
			System.out.print("-");
		}
		for(int j =1;j<=2+i;j++) {
			System.out.print("*");
		}
System.out.println();
	}
		System.out.println("==========");
		for(int i =3;i>=1;i--) {
			for(int j =5;j>=i;j-- ) {
				System.out.print("-");
			}
			for(int j =5;j>=i;j--) {
				System.out.print("*");
			}
	System.out.println();
		}
		System.out.println("--------------------");
		
		for(int i =2;i>=1;i--) {
			for(int j =1;j<=i;j++ ) {
				System.out.print("-");
			}
			for(int j =1;j<=5;j++) {
				System.out.print("*");
			}
	System.out.println();
		}
	}
}
