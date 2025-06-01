package codenest;
import java.util.*;
public class prob3 {
	public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter  size of array");
int n = sc.nextInt();
int[] arr =new int[n];
for(int i = 0;i<n;i++) {
	arr[i]=sc.nextInt();
}
Arrays.sort(arr);
System.out.println("sorttd array");
for(int num : arr) {
	System.out.println(num);
}
}
}
