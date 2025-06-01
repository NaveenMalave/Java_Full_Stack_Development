package codenest;
import java.util.*;
public class prob1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sixe of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
			}
		int count = 1;
		for(int i = 0 ; i<n;i++) {
			if(arr[0]<arr[i]) {
				count+=1;
			}
		}
		System.out.println(count);
	}

}
