import java.util.HashMap;

public class Program4 {
	public static void main(String[] args) {

		HashMap<Emp, Integer> hm = new HashMap<>();

		Emp emp1 = new Emp(12, 1222, "emp1");
		Emp emp2 = new Emp(12, 1222, "emp1");
		Emp emp3 = new Emp(10, 1222, "emp1");
		Emp emp4 = new Emp(13, 1222, "emp1");

		hm.put(emp1, emp1.getAge());
		hm.put(emp2, emp2.getAge());
		hm.put(emp3, emp3.getAge());
		hm.put(emp4, emp4.getAge());

		System.out.println(hm.get(emp3));
		System.out.println(hm.size());

	}
}

// 1 4 5 7 2 4 8 7 9 2
// sum of square of odd numbers by java 8
class Emp {
	private int age;
	private int sal;
	private String name;

	public Emp(Integer age, Integer sal, String name) {
		this.age = age;
		this.sal = sal;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public int getSal() {
		return sal;
	}

	public String getName() {
		return name;
	}

}