package in.cms.model;

public class Employee /* implements Comparable<Employee> */{
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		/* default constructor */
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("id=%s, name=%s, salary=%s", id, name, salary);
	}

//	@Override
//	public int compareTo(Employee o) {
//		int result;
//		if (this.id == o.id)
//			result = 0;
//		else if (this.id > o.id)
//			result = 1;
//		else 
//			result = -1;
//		return result;
//	}
	
	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee)obj;
		return (this.id == other.id && this.name.equals(other.name) && this.salary == other.salary) ? true : false;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
}
