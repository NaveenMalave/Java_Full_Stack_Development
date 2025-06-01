package programsprac;

public class perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =28;
		int tem=n;
		int sum=0;
		for (int i =1;i<n;i++) {
			if(n%i==0) {
				sum = sum +i;
			}
		}
		if(sum==tem) {
			System.out.println("perfect");
		}else {
			System.out.println("not perfect");
		}
		
	}

}
