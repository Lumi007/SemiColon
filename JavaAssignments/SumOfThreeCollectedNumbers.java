import java.util.Scanner;

public class SumOfThreeCollectedNumbers {
	public static void main (String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your First Number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter your Second Number: ");
	float secondNumber = input.nextFloat();

	System.out.print("Enter your Second Number: ");
	double thirdNumber = input.nextDouble();


	double sum = firstNumber + secondNumber + thirdNumber;
	System.out.println("The sum of the three numbers is " + sum);

	}



}