import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program7 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Pankaj", 1000);
		Employee e2 = new Employee(2, "Yankaj", 2000);
		Employee e3 = new Employee(3, "Tankaj", 3000);
		Employee e4 = new Employee(4, "Rankaj", 4000);

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);

		List<Employee> newEmpList = empList.stream().filter(i -> i.salary > 2000).collect(Collectors.toList());
		System.out.println(newEmpList);
		
		List<String> newEmpNameList = empList.stream().filter(i -> i.salary > 2000).map(i->i.name).collect(Collectors.toList());
		System.out.println(newEmpNameList);
	}
}

class Employee {
	int id;
	String name;
	double salary;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}