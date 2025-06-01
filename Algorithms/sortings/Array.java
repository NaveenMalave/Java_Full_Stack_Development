package com.sortings;

public class Array {
private int[] arr;
private int size;
public Array(int size) {
	if(size>0) {
		this.size=size;
	arr=new int[size];
	System.out.println("Array of side "+size+" created");
	}else {
		System.out.println("give valid length ");
	}
}

public void insert(int index,int element) {
	if(index>=0 && index<=arr.length-1) {
	arr[index]=element;
	System.out.println("Element "+element+" inserted at index "+index);
	}else {
		System.out.println("Give valid index from o to " + (arr.length-1));
	}
}
public void delete(int index) {
	if(index>=0 && index<=arr.length-1) {
		System.out.println("Element "+arr[index]+" is deleted");
		arr[index]=0;
		}else {
			System.out.println("Give valid index from o to " + (arr.length-1));
		}
	
}
void display() {
		System.out.print("[");
		for(int i=0;i<=arr.length-1;i++) {
			if(i<arr.length-1)
			System.out.print(arr[i]+",");
			else
				System.out.print(arr[i]+"]");
		}
	System.out.println();
}
 int length() {
	return arr.length;
}
 
public int binarySearch(int key) {
	int low =0;
	int high=size-1;
	while(low<=high) {
		int mid = low+high/2;
		if(key==arr[mid]) {
			return mid;
		}else if(key>arr[mid]) {
			low = mid+1;
			high=high;
		}else {
			high = mid-1;
			low=low;
		}
	}
	return -1;
}
void Sort() {
	for(int i=1;i<=arr.length-1;i++) {
		int item=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>item) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=item;
	}
	return;
}

}

