package patterns;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i<=5;i++) {
			  for(int j =4;j>=i;j--) {
				  System.out.print(" ");
			  }
			  for(int j =1;j<=i;j++) {
				  if(i==3 && j==2 || i==4 && j==2 || i==4 && j==3)
				  System.out.print("  ");
				  else
					 System.out.print("* ");
			  }
			  
			  System.out.println();
	}
		System.out.println("============111=============");
		for(int i = 1;i<=5;i++) {
			  for(int j =4;j>=i;j--) {
				  System.out.print(" ");
			  }
			  for(int j =1;j<=i;j++) {
				  if(i==5 || j==1 || i==j)
				  System.out.print("* ");
				  else
					 System.out.print("  ");
			  }
			  
			  System.out.println();
	}
		System.out.println("=========2222================");
		for(int i = 1;i<=5;i++) {
			  for(int j =4;j>=i;j--) {
				  System.out.print(" ");
			  }
			  for(int j =1;j<=i;j++) {
				  if(i==3 && j==2 || i==4 &&( j==2 || j==3))
				  System.out.print("  ");
				  else
					 System.out.print("* ");
			  }
			  
			  System.out.println();
	}
		System.out.println("==========333===============");
		for(int i = 1;i<=5;i++) {
			  for(int j =4;j>=i;j--) {
				  System.out.print(" ");
			  }
			  for(int j =1;j<=i;j++) {
				  if(i==1 || i==5 || j==1 || j==i)
				  System.out.print("* ");
				  else 
					  System.out.print("  ");
			  }
			  
			  System.out.println();
	}
}
}
