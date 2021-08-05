import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("demo.txt");
		 
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null) {
				String[] sArr=  line.split(" ");
				for(int i =0;i<sArr.length;i++){
					
				}
				
			}
        }
	}

	private static int checkPalindrome(int num) {
		boolean isPalindrome = false;
		int newNum = 0;
		while (num > 0) {
			newNum = newNum*10 +  num % 10;
			num = num/10;
		}
		return newNum;
	}
}
