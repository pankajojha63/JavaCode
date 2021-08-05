import java.util.Scanner;

public class programA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int noOfObservations = sc.nextInt();
		int minutes = 0;
		int second = 0;
		
		for(int i=0;i<noOfObservations;i++){
			minutes = minutes + sc.nextInt() * 60; // converting to seconds
			second =  second + sc.nextInt();
		}
		
		if(minutes>second){
			System.out.println("measurement error"); 
		}
		else
			System.out.printf("%.9f", (double) second / minutes);
		
		sc.close();
	}
}
