import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String... args){
	
		Scanner input = new Scanner(System.in);

		float discountedPrice = 0;

		System.out.print("Hello, Welcome to the Semicolon Mall, Please enter your name:  ");
		String customerName = input.nextLine();

		System.out.println("Hello " + customerName + ", Welcome to the discount app   ");

		System.out.print("Please select a customer type using 1 or 2\n1. Premium.\n2. Regular\n>>> ");
		int customerType = input.nextInt();

		

		System.out.print("Are you a repeat customer, please select 1 or 2\n1. Yes.\n2. No.\n>>> ");
		int repeatType = input.nextInt();

		
		
		System.out.print("Please enter the amount for the goods purchased.\n>>> ");
		double itemPrice = input.nextDouble();


		if (customerType == 1 &&  repeatType == 1){
			
			System.out.print("You are a Distinction Student");

		} else if (customerType == 1 &&  repeatType == 1){
			System.out.print("You are a first class Student");

		} else if (customerType == 1 &&  repeatType == 1){
			System.out.print("You are a second class Student");

		} else if (customerType == 1 &&  repeatType == 1){
			System.out.print("You are a pass Student");
		
		} else if (customerType == 1 &&  repeatType == 1){
			System.out.print("You fail the course");
		
		} else {
			System.out.print("You have entered an invalid score");
		
		


		}


		


	}



}
