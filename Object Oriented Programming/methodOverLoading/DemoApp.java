package com.methodOverLoading;

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b =20;
		float c= 5.5f;
		float d = 10.5f;
  Demo dm= new Demo();
  dm.add();
  dm.add(a);
  dm.add(a, b);
  System.out.println(dm.add(a, c));
  System.out.println(dm.add(c, d));
  System.out.println(dm.add(c, b));
	}

}
