
public class OverloadingTest {
	public static void main(String[] args) {
		OverloadingTest o1 = new OverloadingTest();
		o1.m1(null);
	}

	public void m1(Integer a){
		System.out.println("integer");
	}
	
	public void m1(Object a){
		System.out.println("string");
	}

}
