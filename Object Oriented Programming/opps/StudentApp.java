package opps;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Deep","Engineering");
		s1.giveIntroduction();
		s1.breathe();
		
		Student s2 = new Student("aman","mca");
		s2.giveIntroduction();
		s2.breathe();

	}

}
class Student{
	String name, degree;
	public Student(String name, String degree) {
		this.name = name;
		this.degree = degree;
	}
	public void giveIntroduction() {
		System.out.println("My name is"+name);
		System.out.println("I graduated in "+degree);
	}
	public static void breathe() {
		System.out.println("Inhale oxygen and exhale carbon dioxide");
	}
}
