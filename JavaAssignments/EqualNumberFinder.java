import java.util.Scanner;

public class EqualNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
	char choice;
	do{
		System.out.print("Welcome to the equality app, enter Y/N to continue: ");
		choice = input.next().charAt(0);

		if (choice == 'Y' || choice == 'y'){

        		System.out.print("Enter a first number: ");
        		int firstNumber = input.nextInt();

			System.out.print("Enter a second number: ");
        		int secondNumber = input.nextInt();
	
			System.out.print("Enter a third number: ");
        		int thirdNumber = input.nextInt();

			if ( firstNumber == secondNumber && secondNumber == thirdNumber){
				System.out.println("The numbers are equal");
			} else {
				System.out.println("The numbers are not equal");
			}

        	}else {
			System.out.println("Thank You");
		}
	
	}while(choice == 'y' || choice == 'Y');

	}
}