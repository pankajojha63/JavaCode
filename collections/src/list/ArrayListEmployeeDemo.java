package list;

import java.util.ArrayList;
import java.util.List;

import com.Employee;

public class ArrayListEmployeeDemo {
	static List<Employee> list = new ArrayList<Employee>();

	public static void main(String[] args) {
		list.add(new Employee("Pankaj", 1));
		list.add(new Employee("Cankaj", 2));
		list.add(new Employee("Dankaj", 3));

		System.out.println(addEmployee(new Employee("Pankaj", 4)));
	}

	private static List<Employee> addEmployee(Employee employee) {
		boolean isPresnt = false;
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getEmpName());
			if (list.get(i).getEmpName().equalsIgnoreCase(employee.getEmpName())) {
				isPresnt = true;
			}
		}
		if (!isPresnt)
			list.add(employee);

		return list;
	}
}
