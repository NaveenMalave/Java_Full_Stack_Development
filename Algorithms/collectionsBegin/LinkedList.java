package com.collectionsBegin;

public class LinkedList {
	class Node {
		Node pl;
		int data;
		Node nl;
	}
Node First = null;
void insertFirst(int ele) {
	Node nn = new Node();
	nn.pl = null;
	nn.data=ele;
	nn.nl=null;
	if(First==null) {
		First=nn;
	}
	else {
		nn.pl=First;
		First.pl=nn;
		First=nn;
	}
}
void displayForward() {
	if(First==null) {
		System.out.println("NUll Linked list");
	}else if(First.nl==null) {
		System.out.println(First.data);
	}else {
		Node temp=First;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.nl;
		}
	}
}
}
