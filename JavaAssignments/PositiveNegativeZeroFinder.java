import java.util.Scanner;

public class PositiveNegativeZeroFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();

	if ( number > 0 ){
		System.out.printf("The number you enter is a positive number\n");
		} 
	else if ( number < 0) {
		System.out.printf("The number you enter is a negative number\n");
		}
	else {
		System.out.printf("The number you enter is a zero number\n");
		}
        
        char choice;
        do {
            System.out.print("Do you want to enter more numbers? (y/n): ");
            choice = input.next().charAt(0);
            
            if (choice == 'y' || choice == 'Y') {
                System.out.print("Enter another number: ");
                number = input.nextInt();
                
                	if (number > 0) {
				System.out.printf("The number you enter is a positive number\n");
                	}
                	else if (number < 0) { 
				System.out.printf("The number you enter is a negative number\n");
                	}
            		else {
				System.out.printf("The number you enter is a zero\n");
			}
		} else {
			System.out.println("Thank You");
		}
            

        } while (choice == 'y' || choice == 'Y');
	
	


	}	

}