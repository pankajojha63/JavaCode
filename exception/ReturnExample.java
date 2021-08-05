package exception;

public class ReturnExample {
	public static void main(String[] args) {
		int i = test();
		System.out.println(i);
	}

	private static int test() {
		try{
			//int k = 1/0;
			return 10;
		}catch(Exception e){
			return 20;
		}
		finally{
			return 30;
		}
	}
}
