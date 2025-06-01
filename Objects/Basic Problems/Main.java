package codenest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		int p=190;
		b.setAmt(p,5000);
		int a = b.getAmt(p);
		System.out.println("amount "+a);
	}

}
