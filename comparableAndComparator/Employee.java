package comparableAndComparator;

public class Employee implements Comparable<Employee>{
	String empName;
	int empId;
	int empAge;
	long empSalary;
	
	

	public Employee(String empName, int empId, int empAge, long empSalary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return empName + " : " + empId +" : " + empAge + " : " + empSalary ;
				
	}

	@Override
	public int compareTo(Employee o) {
		return this.empId - o.empId;
	}
	
	

}
