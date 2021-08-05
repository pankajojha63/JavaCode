package exception;

public class ThrowExample {
	public static void main(String[] args) {
		try{
			test();
		}catch(Exception e){
			System.out.println("Exception found");
		}finally{
			System.out.println("Doing closeup works");
		}
	}
	
	public static void test(){
		throw new NullPointerException();
	}
}

//throw is used to explicitly throw any exception
//throw is used within methods

