import java.util.Scanner;

public class FindLargestAndSmallest {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int largest = 0;
		int smallest = 0;
		String repeat;

		System.out.print("Enter your First Number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter your Second Number: ");
		int secondNumber = input.nextInt();

		if(firstNumber > secondNumber) {
			largest = firstNumber;
			smallest = secondNumber;
		} else {
			largest = secondNumber;
			smallest = firstNumber;
		}
		
		do {
			input.nextLine();
			System.out.println("Would you like to enter another number (yes/no) ");
			repeat = input.nextLine();
		
		
			if (repeat.equals("yes")) {
		
				System.out.print("Enter your Another Number: ");
				int anotherNumber = input.nextInt();

				if(anotherNumber > firstNumber ) {
					largest = anotherNumber;

				} else if(anotherNumber < secondNumber) {
					smallest = anotherNumber;
				}
			}
		} while (repeat.equals("yes"));
	
		System.out.println("The Largest number is : " + largest);
		System.out.println("The Smallest number is : " + smallest);
		

	}


}