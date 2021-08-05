package test;

import java.util.HashSet;
import java.util.Set;

public class EmployeeImpl {
	public static void main(String[] args) {
		Set<Employee> set = new HashSet<Employee>();
		set.add(new Employee(1,"test1",1000,new Address("Bangalore", 560037)));
		set.add(new Employee(1,"test1",1000,new Address("Bangalore", 560037)));
		
		System.out.println(set.toString());
	}
}
