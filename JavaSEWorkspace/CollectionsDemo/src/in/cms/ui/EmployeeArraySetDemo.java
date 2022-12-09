package in.cms.ui;

import java.util.HashSet;
import java.util.Set;

import in.cms.model.Employee;

public class EmployeeArraySetDemo {

	public static void main(String[] args) {
		
		Set<Employee> emps = new HashSet<>();
		emps.add(new Employee(101, "srinivas", 40000.0));
		emps.add(new Employee(102, "ramana", 50000.0));
		emps.add(new Employee(104, "kiran", 30000.0));
		emps.add(new Employee(103, "divya", 60000.0));
		emps.add(new Employee(107, "pradeep", 70000.0));
		emps.add(new Employee(105, "ram", 80000.0));
		emps.add(new Employee(106, "arun", 90000.0));
		emps.add(new Employee(108, "david", 10000.0));
		emps.add(new Employee(101, "srinivas", 40000.0));
		
		for(Employee emp : emps) {
			System.out.println(emp);
		}
		
//
//		Employee e1 = new Employee(101, "srinivas", 40000.0);
//		Employee e2 = new Employee(101, "srinivas", 40000.0);
//		System.out.println(e1 == e2);
//		System.out.println(e1.hashCode() + "\t" + e2.hashCode());
		
		
		

	}

}
