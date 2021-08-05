package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		Consumer<Integer> c = i->{
			System.out.println("The square of "+i+" is :: " + i*i);
		};
		
		l1.stream().forEach(c);
	}
}
