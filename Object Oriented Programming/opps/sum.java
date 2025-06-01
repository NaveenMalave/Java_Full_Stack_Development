package opps;

public class sum {

	public static void main(String[] args) {
		
		add s = new add();//no return with argument
		s.adds(13, 4);
		
		 square a = new square();//no return type without argument
		 a.root();
		 
		 sub m = new sub();//return with argument
		 int res = m.minus(18,10);
		 System.out.println("subtraction"+res);
		 
		 mul x = new mul();//return type without argument
		 int re = x.into();
		 System.out.println("multiplication"+re);

	}

}
class add{
	public void adds(int a, int b) {
		int sum = a +b;
		System.out.println("add of nos"+sum);
	}
}
class square{
	public void root() {
		int num = 50;
		System.out.println("square of no" + num * num);
	}
}
class sub{
	int minus(int a , int b) {
		int ans = a-b;
		return ans;
	}
}
class mul{
	int into() {
		int a = 20;
		int b = 30;
		int ans = a*b;
		return ans;
	}
}