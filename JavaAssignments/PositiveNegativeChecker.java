import java.util.Scanner;
public class PositiveNegativeChecker {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your number to check: ");
		int numberToCheck = input.nextInt();

	

		if (numberToCheck < 0){
			System.out.println("Number is Negative");
		} else if (numberToCheck == 0) {
			System.out.println("Number is zero");
		}else {
			System.out.println("Number is positive");
		}

	}

}