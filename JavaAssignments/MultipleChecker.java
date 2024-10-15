import java.util.Scanner;

public class MultipleChecker {
		
	public static void main (String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the first number:");
	int firstNumber = input.nextInt();
	System.out.print("Enter the second Number:");
	int secondNumber = input.nextInt();

	int firstNumberTripled = firstNumber*3;
	int secondNumberDoubled = secondNumber*2;

	
	int multiple = firstNumberTripled % secondNumberDoubled;

	if (multiple == 0){
	System.out.printf("Second Number %d is a multiple of First Number %d", secondNumber, firstNumber);
	} else {
		System.out.printf("Second Number %d is not a multiple of First Number %d", secondNumber, firstNumber);
	}
	

	
	}

}
