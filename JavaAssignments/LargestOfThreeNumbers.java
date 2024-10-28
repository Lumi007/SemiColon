import java.util.Scanner;


public class LargestOfThreeNumbers {
	public static void main (String[] args){
	
	Scanner input = new Scanner(System.in);


	System.out.print("PLease enter your first number: ");
	int firstNumber = input.nextInt();

	System.out.print("PLease enter your second number: ");
	int secondNumber = input.nextInt();

	System.out.print("Please enter your third number: ");
	int thirdNumber = input.nextInt();


	
	int maxNumber = firstNumber;

	if (secondNumber > firstNumber){
		maxNumber = secondNumber;
	
	} else if ( thirdNumber > secondNumber && thirdNumber > firstNumber){
		
		maxNumber = thirdNumber;
	
	}

	System.out.printf ("The largest of the three number is %d", maxNumber);
	
	}



}