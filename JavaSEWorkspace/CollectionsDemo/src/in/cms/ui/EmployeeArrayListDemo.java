package in.cms.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import in.cms.model.Employee;
import in.cms.service.NameComparator;
import in.cms.service.SalaryComparator;

public class EmployeeArrayListDemo {

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee(101, "srinivas", 40000.0));
		emps.add(new Employee(102, "ramana", 50000.0));
		emps.add(new Employee(104, "kiran", 30000.0));
		emps.add(new Employee(103, "divya", 60000.0));
		emps.add(new Employee(107, "pradeep", 70000.0));
		emps.add(new Employee(105, "ram", 80000.0));
		emps.add(new Employee(106, "arun", 90000.0));
		emps.add(new Employee(108, "david", 10000.0));
		
		Collections.sort(emps);
		for(Employee emp : emps) {
			System.out.println(emp);
		}
		System.out.println("-".repeat(100));
		
		Collections.sort(emps, new NameComparator());
		
		for(Employee emp : emps) {
			System.out.println(emp);
		}
		System.out.println("-".repeat(100));
		
		Collections.sort(emps, new SalaryComparator());
		
		for(Employee emp : emps) {
			System.out.println(emp);
		}
		
		

	}

}
