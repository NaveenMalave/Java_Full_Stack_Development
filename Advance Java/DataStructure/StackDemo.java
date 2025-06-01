package DataStructure;

import java.util.Stack;
import java.util.LinkedList;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Stack s1=new Stack();
		s1.push(100);
		s1.push(200);
		s1.push(300);
		s1.push(400);
		s1.push(500);
		
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.push(600));*/
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(150);
		ll.add(125);
		ll.add(134);
		ll.add(160);
		System.out.println(ll.add(500));
		System.out.println(ll.remove());
		System.out.println(ll.remove());
		System.out.println(ll.remove());
		System.out.println(ll.remove());
		System.out.println(ll.remove());
	}

}
