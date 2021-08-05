package exception;

public class ThrowsExample {
	public static void main(String[] args) {
		try{
			System.out.println("calling child method Test");
			test();
		}catch(ArithmeticException ex){
			System.out.println("Exception found in test method");
		}
	}
	
	public static void test() throws ArithmeticException{
		int i=10;
		i = i/0;
	}
}

//throws is used to propagate the 
//exception to the parent method or calling method

//throws is used with method declaration