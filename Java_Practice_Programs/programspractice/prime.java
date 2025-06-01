package programsprac;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n =1 ;
 int m=9;
int s=0;
 for(int i =n;i<=m;i++) {
 if(i==1 || i==0) {
	 continue;
 }
 int sum=0;//mistake
 for(int j=2;j<=i/2;j++) {
	 if(i%j==0) {
		 sum=1;
		 break;
	 }
	 //System.out.println(i);
 }
 if(sum==0)
	 s = s+i;
	if(sum==0) {
		System.out.println(i);
 }
 }
 System.out.println(s);
}

}
