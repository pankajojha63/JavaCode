package exception;

public class SyntaxExample {
	public static void main(String[] args) {
		try{
			System.out.println("Inside try");
			int i = 1/0;
		}catch(Exception e){
			System.out.println("Inside catch");
		}finally{
			System.out.println("Inside finally");
		}
	}
}
