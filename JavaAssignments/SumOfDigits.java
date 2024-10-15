import java.util.Scanner;

public class SumOfDigits {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer between 0 and 1000 :" );
		int integer = input.nextInt();
		
		int lastChar = integer % 10;
		int remainderChar = integer/10;
		if (remainderChar == 0){
		System.out.printf ("the sum of the digits of the integer is %d%n", integer);
		}
		int secondChar = remainderChar % 10;
		int firstChar = remainderChar/10;
		if (firstChar == 0) {
		System.out.printf ("the sum of the digits of the integer is %d%n", secondChar + lastChar);
		
		} else {
		System.out.printf("the sum of the digits of the integer is %d%n", firstChar + secondChar + lastChar);
		}
		

	}



}