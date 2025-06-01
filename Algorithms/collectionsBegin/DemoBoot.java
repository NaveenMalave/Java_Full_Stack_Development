package com.collectionsBegin;

public class DemoBoot<T> {
	T item;
	public void setItem(T item) {
		this.item=item;
	}
	void display() {
		System.out.println("ITEM IS "+item);
	}

}
