import java.util.Scanner;

public class SumCalculator {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		String repeat;

		do {
			System.out.print("Please enter your first number:");
			double firstNumber = input.nextDouble();

			System.out.print("Please enter your second number:");
			double secondNumber = input.nextDouble();

			double sumOfNumbers = firstNumber + secondNumber;
			System.out.println("The sum is: " + sumOfNumbers);
			
			input.nextLine();
			System.out.print("Do you wish to perform the operation again? (yes/no)");
			repeat = input.nextLine();
			 
		} while (repeat.equals("yes"));
		System.out.println("Thank You");	
	}
}