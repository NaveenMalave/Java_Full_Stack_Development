package Generics;

public class Employee implements Comparable {
	String E_name;
	int E_id;
	int E_age;
	int E_salary;
	public Employee(String e_name, int e_id, int e_age, int e_salary) {
		super();
		E_name = e_name;
		E_id = e_id;
		E_age = e_age;
		E_salary = e_salary;
	}
	@Override
	public String toString() {
		return "Employee [E_name=" + E_name + ", E_id=" + E_id + ", E_age=" + E_age + ", E_salary=" + E_salary + "]";
	}
	public int compareTo(Object o) {
		Employee E = (Employee) o;
		if(this.E_salary>E.E_salary)) {
			return 1;
		}else {
			return -1;
		}
}
