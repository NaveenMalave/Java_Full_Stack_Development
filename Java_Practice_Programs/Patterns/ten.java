package patterns;

public class ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i<=5;i++) {
			for(int j =1;j<=5;j++ ) {
				System.out.print("-");
			}
			for(int j =1;j<=i;j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
	} 

}
