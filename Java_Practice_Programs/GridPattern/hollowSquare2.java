package GridPattern;

public class hollowSquare2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		for(int i =0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				if(i==0 || i==10 || j==0 || j==10 ||  i==j  || j==n-1-i)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}

	}

}
