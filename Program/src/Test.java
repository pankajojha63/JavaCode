
//Count how many vowels in a given string input will be string
//Sample input "Misson"
//output will be integer

public class Test {
	public static void main(String[] args) {
		String input = "PankajOjha";
		char[] chArr = { 'a', 'e', 'i', 'o', 'u' };

		int counter = 0;
		for (int i = 0; i < chArr.length; i++) {
			for (int j = 0; j < input.length(); j++) {
				if (chArr[i] == input.toLowerCase().charAt(j)) {
					counter++;
				}
			}
		}

		System.out.println(counter);
	}

}
