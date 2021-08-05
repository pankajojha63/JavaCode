package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample1 {
	public static void main(String[] args) {		
		List<Student> slist = new ArrayList<Student>();
		slist.add(new Student("Prayag", 1));
		slist.add(new Student("Tim", 5));
		slist.add(new Student("Joseph", 2));
		slist.add(new Student("Deepak", 4));
		slist.add(new Student("Saket", 3));
		
		System.out.println(slist);
		slist.stream().forEach(System.out::println);
		
		Optional<Student> stud = 
				slist.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getsName)));
		System.out.println(stud.get().sName);
	}
}

class Student {
	String sName;
	int sRollNo;

	public Student(String sName, int sRollNo) {
		super();
		this.sName = sName;
		this.sRollNo = sRollNo;
	}
	
	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public int getsRollNo() {
		return sRollNo;
	}


	public void setsRollNo(int sRollNo) {
		this.sRollNo = sRollNo;
	}


	@Override
	public String toString() {
		return sName + " :: " + sRollNo;
	}

}