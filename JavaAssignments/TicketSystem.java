import java.util.Scanner;


public class TicketSystem {
	public static void main(String... args){


	Scanner input = new Scanner(System.in);

	double discountTicketPrice = 0;

	System.out.print("Hello, Welcome to the Semicolon Cinema, Please enter your name:  ");
	String customerName = input.nextLine();

	

	System.out.print("In order to serve you better, Please select your appropriate age group using either 1, 2, or 3\n1. Child.\n2. Adult\n3. Senior\n>>>> ");
	int customerType = input.nextInt();

	switch (customerType){


		case 1: 
			System.out.print("Please select the day of the week.\n1. Weekday\n2. Weekend\n >>>> ");
			int dayOfTheWeek = input.nextInt();
			
			switch (dayOfTheWeek){
				case 1:
					System.out.print("Please select the time of the day.\n1. Morning\n2. Evening\n >>>> ");
					int timeOfTheDayChild1 = input.nextInt();
					
					switch(timeOfTheDayChild1){
						case 1:
							System.out.println("Your ticket Price is 4000 Naira only");
							break;
						case 2:
							System.out.println("Your ticket Price is 5000 Naira only");
							break;
						default:
							System.out.println("Invalid Selection");
							break;
				}
				break;
				case 2:
					System.out.print("Please select the time of the day.\n1. Morning\n2. Evening\n >>>> ");
					int timeOfTheDayChild2 = input.nextInt();
					
					switch(timeOfTheDayChild2){
						case 1:
							System.out.println("Your ticket Price is 5000 Naira only");
							break;
						case 2:
							System.out.println("Your ticket Price is 6000 Naira only");
							break;
				}
				break;

			}
			break;

		case 2: 

			
		case 3:
			







	}


	
	














	}






}