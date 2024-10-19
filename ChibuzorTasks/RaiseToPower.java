import java.util.Scanner;

public class RaiseToPower{
	public static void main( String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first Number: ");
		int firstNumber = input.nextInt();
		System.out.print("Enter the exponent for the first number: ");
		int exponent = input.nextInt();
		
		double result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= firstNumber;
		}
		
		System.out.printf("%d raised to the power of %d is %.2f", firstNumber, exponent,result);

	
	}



}
