import java.util.ArrayList;
import java.util.List;

public class Program9 {
	public static void main(String[] args) {
		List<EmployeeTest> empList = new ArrayList<EmployeeTest>();
		empList.add(new EmployeeTest(31, 10000, "emp1", "BLR"));
		empList.add(new EmployeeTest(29, 10000, "emp2", "BLR"));
		empList.add(new EmployeeTest(35, 10000, "emp3", "MUM"));
		empList.add(new EmployeeTest(30, 10000, "emp4", "MUM"));

		// empList.stream().filter(i->i.age>30).

	}
}

class EmployeeTest {
	int age;
	double Salary;
	String name;
	String address;

	public EmployeeTest(int age, double salary, String name, String address) {
		super();
		this.age = age;
		Salary = salary;
		this.name = name;
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return Salary;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "EmployeeTest [age=" + age + ", Salary=" + Salary + ", name=" + name + ", address=" + address + "]";
	}

}
