import java.util.ArrayList;
import java.util.List;

public class Program13 extends Animal {

	@Override
	public void eat() {
		System.out.println("EAT");

	}

	public static void main(String[] args) {
		Animal animal = new Program13();
		animal.eat();
		animal.sleep();

		List<Integer> list = new ArrayList<Integer>();
		/*list.stream().map(i -> try{
			return new Integer(i/0);}catch(Exception ex){
				System.out.println("exception occured");
				return new Integer(0);
			}

		).foreach(System.out::println);*/
	}

}

abstract class Animal {
	public abstract void eat();

	public void sleep() {
		System.out.println("Animal SLEEP");
	}
}