package programsprac;

public class Strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n =145;
int num=n;	//mistake	
	 int sum =0;
	 
		while(num!=0) {
			int rem=num%10;
			int fact =1;//inside mistake
		for(int i=1;i<=rem;i++) {
			fact*=i;
		}
		sum=sum+fact;
		num/=10;
		}
		System.out.println(sum==n ? "strong " : "not strong");

	}

}
