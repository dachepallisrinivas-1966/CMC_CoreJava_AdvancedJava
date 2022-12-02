package in.cmc.model;

public class Employee extends Person {
	private double salary;
	
	public Employee() {
		/* default constructor */
	}
	
	public Employee(String name, int age, double salary ) {
		super(name, age);
		this.salary = salary;
	}
	
}
