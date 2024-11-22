import java.util.Scanner;


public class NewMethods {

	public static void main(String... args){
	
	Scanner input = new Scanner(System.in);
	

	System.out.print("Please enter a number of rows: ");
	
	int numberOfTimes = input.nextInt();
	printStar(numberOfTimes);

	
	


	}

	public static void printStar(int numberOfTimes){
		for (int count = 0; count < numberOfTimes; count++)
			System.out.print("*");

	}

}