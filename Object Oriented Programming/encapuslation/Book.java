package com.encapuslation;

public class Book {

	private int pageNo;
	
	public void setData(int pageNo) {
		if(pageNo>0) {
			this.pageNo = pageNo;
		}
		else {
			System.out.println("Invalid pageNo");
		}
	}
	//Getter
	public int getpageNo() {
		return pageNo;
	}
}
