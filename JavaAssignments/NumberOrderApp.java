import java.util.Scanner;

public class NumberOrderApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
	char decision;
	do{
		System.out.print("Welcome to the number order app, enter Y/N to continue: ");
		decision = input.next().charAt(0);

		if (decision == 'y' || decision == 'Y'){

        		System.out.print("Enter the first number: ");
        		int firstNumber = input.nextInt();

			System.out.print("Enter the second number: ");
        		int secondNumber = input.nextInt();
	
			System.out.print("Enter the third number: ");
        		int thirdNumber = input.nextInt();


			if ( firstNumber <  secondNumber && secondNumber < thirdNumber) {
				System.out.println("Numbers are in ascending order");
			} else if ( firstNumber > secondNumber && secondNumber > thirdNumber) {
				System.out.println("Numbers are in descending order");
			}else {
				System.out.println("Numbers do no follow any order");
			}
        	}else {
			System.out.println("Thank You");
		}
	
	}while(decision == 'y' || decision == 'Y');

	}
}