package codenest;

public class Bank {
	private int amt =1000;
    int pin = 1908;
    public void setAmt(int p, int a){
        if(pin == p){
            amt = a;
        }else{
            System.out.println("Invalid pin");
        }
    }

    public int getAmt(int p){
        if(pin!=p){
            System.out.println("Invalid pin");
        }
        return amt;
    }


}
