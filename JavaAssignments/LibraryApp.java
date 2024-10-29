import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
	char decision;
	int fineForFiveDays = 50;
	do{
		System.out.print("Why did you return our book late or did you not?, enter Y/N to continue: ");
		decision = input.next().charAt(0);

		if (decision == 'y' || decision == 'Y'){

        		System.out.print("How many number of days did it take you to return the book: ");
        		int noOfDays = input.nextInt();
			
			

			if ( noOfDays <=  5 ) {
				System.out.println("Your Fine is 50 paise");
			} else if (noOfDays > 5 && noOfDays <= 10 ) {
				System.out.println("Your fine is 1 rupees");
			} else if (noOfDays > 10 && noOfDays < 30 ) {
				System.out.println("Your fine is 5 rupees");
			} else if (noOfDays >= 30 ){
				System.out.println("Please your membership has been cancelled");
			}
        	}else {
			System.out.println("Thank You");
		}
	
	}while(decision == 'y' || decision == 'Y');

	}
}