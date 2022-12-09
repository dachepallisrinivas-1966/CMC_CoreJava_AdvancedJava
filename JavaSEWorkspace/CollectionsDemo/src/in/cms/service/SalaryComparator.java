package in.cms.service;

import java.util.Comparator;

import in.cms.model.Employee;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int result;
		if (o1.getSalary() == o2.getSalary())
			result = 0;
		else if (o1.getSalary() > o2.getSalary())
			result = 1;
		else
			result = -1;
		return result;
	}

}
