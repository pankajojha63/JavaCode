package collection.sort;

public class Employee {
	String empName;
	int empId;

	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "[empName=" + empName + ", empId=" + empId + "]";
	}

}
