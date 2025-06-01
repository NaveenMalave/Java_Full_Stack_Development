package com.abstraction_2;

public class TeacherApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassRoom cr = new ClassRoom();
		cr.acceptTeacher(new JavaTeacher());
		cr.acceptTeacher(new PythonTeacher());
		cr.acceptTeacher(new MathTeacher());

	}

}
