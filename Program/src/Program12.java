
//rite a Java program to take an input string and exchange the first and last word and revers the middle word.
//Examples: 
//Input : Hello World GFG Welcomes You
//Output :You semocleW GFG dlroW Hello

//Hello
//Hello World -->World Hello
//Welcome Hello World -->World olleH Welocome

public class Program12 {
	public static void main(String[] args) {
		String s1 = "a"; //String pool
		String s2 = "a";
		String s3 = new String("a");
		System.out.println("s1: " + s1.hashCode());
		System.out.println("s2: " + s2.hashCode());
		System.out.println("s3: " + s3.hashCode());
	}


	/*private static String stringExchange(String[] inputArr) {
		String output = "";
		if (inputArr.length == 1)
			return inputArr[0];
		else if (inputArr.length == 2)
			return inputArr[1] + " " + inputArr[0];
		else {
			StringBuffer sb = null;
			// for (int i = 1; i < inputArr.length - 1; i++) {
			sb = new StringBuffer("Hello World GFG Welcomes You");
			output += sb.reverse() + " ";
			// }
			return inputArr[inputArr.length - 1] + " " + output + " " + inputArr[0];
		}
	}*/
}
