package programsprac;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "hello world";
String rev = "";
for(int i=str.length()-1;i>=0;i--) {
	rev=rev+str.charAt(i);
}
System.out.println("reverse of string =="+rev);
System.out.println("=============reverse no================");
int n =1234;
int re =0;
while(n!=0) {
	int rem = n%10;
	 re = re*10+rem;
	n/=10;
}
System.out.println(re);
}
}
