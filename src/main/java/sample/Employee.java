package sample;

public class Employee {
	
	int a=10;
	public void m1() {
		System.err.println(a);

	}
	public void m2() {
		a=100;
		System.err.println(a);

	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.m1();
		e.m2();
		Employee e1 = new Employee();
		e1.m1();
		e1.m2();
		
	}

}
