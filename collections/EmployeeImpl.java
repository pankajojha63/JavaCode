package collection.sort;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeImpl {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Test1", 1));
		empList.add(new Employee("Rest1", 2));
		empList.add(new Employee("Cest1", 3));
		empList.add(new Employee("Dest1", 1));

		// Sorting on basis of empId, If empId same, compare empname

		Comparator<Employee> comp = (o1, o2) -> {
			if (o1.empId == o2.empId) {
				return o1.empName.compareTo(o2.empName);
			} else if (o1.empId < o2.empId)
				return -1;
			else
				return 1;
		};

		Collections.sort(empList, comp);
		empList.stream().forEach(System.out::println);
	}
}
