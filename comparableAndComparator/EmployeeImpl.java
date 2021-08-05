package comparableAndComparator;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeImpl {
	public static void main(String[] args) {
		Employee e1 = new Employee("Pankaj", 1,22,new Long(10000));
		Employee e2 = new Employee("Chanda", 2,20,new Long(18000));
		Employee e3 = new Employee("Raj", 4,24,new Long(7000));
		Employee e4 = new Employee("Gyan", 3,32,new Long(15000));
		
		Employee[] empArr = {e1,e2,e3,e4};
		System.out.println("Unsorted Employee Arrays :: "+ Arrays.toString(empArr));
		Arrays.sort(empArr);
		System.out.println("Sorted Employee Arrays :: " +Arrays.toString(empArr));
		
		//sorting based on empName
		Arrays.sort(empArr,new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.empName.compareTo(o2.empName);
			}
		});
		
		System.out.println("Sorted Employee Arrays on empName :: " +Arrays.toString(empArr));
		
		Arrays.sort(empArr,new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.empAge<o2.empAge?-1:(o1.empAge>o2.empAge?1:0);
			}
		});
		
		System.out.println("Sorted Employee Arrays on empAge :: " +Arrays.toString(empArr));
	}
}
