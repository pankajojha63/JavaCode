package test;

public class Employee {
	int id;
	String empName;
	double salary;
	Address add;

	public Employee(int id, String empName, double salary, Address add) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
		this.add = new Address(add.city, add.pincode);
	}

	@Override
	public String toString() {
		return "[id=" + id + ", empName=" + empName + ", salary=" + salary + ", City=" + add.city + ", Pincode="
				+ add.pincode + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((add == null) ? 0 : add.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (add == null) {
			if (other.add != null)
				return false;
		} else if (!add.equals(other.add))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

}
