package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al = new ArrayList();
		al.add(new Student("Ramesh",25,5.7f,96));
		al.add(new Student("raju",45,34.5f,88));
		al.add(new Student("ramesh",35,43.3f,90));
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}
