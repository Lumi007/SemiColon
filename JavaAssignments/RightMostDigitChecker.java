import java.util.Scanner;
public class RightMostDigitChecker {
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);



	System.out.print("Enter your first non negative integer: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter your second non negative integer: ");
	int secondNumber = input.nextInt();

	System.out.print("Enter your third non negative integer: ");
	int thirdNumber = input.nextInt();

	int modFirstNumber = firstNumber % 10;

	int modSecondNumber = secondNumber % 10;

	int modThirdNumber = thirdNumber % 10;
	
	if (modFirstNumber == modSecondNumber || modFirstNumber == modThirdNumber || modSecondNumber == modThirdNumber)
		{System.out.println ("The result is : True");
	} else { 
		System.out.println ("The result is : False");}



	}



}