import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program8 {
	public static void main(String[] args) {
		Student s1 = new Student(1,"Test1");
		Student s2 = new Student(2,"Test2");
		Student s4 = new Student(4,"Test4");
		Student s3 = new Student(3,"Test3");
		
		List<Student> list  = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s4);
		list.add(s3);
		
		System.out.println("Before Sorting :: " +list);
		Collections.sort(list);
		System.out.println("After Sorting :: " +list);
	}
}

class Student implements Comparable<Student> {
	int rollNo;
	String name;
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public int compareTo(Student obj) {
		if (obj.rollNo > this.rollNo)
			return -1;
		if (obj.rollNo < this.rollNo)
			return 1;
		else
			return 0;

	}



	@Override
	public String toString() {
		return " [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	
}
