import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String... args){
	
		Scanner input = new Scanner(System.in);

		double discountedPrice = 0;

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
			discountedPrice = itemPrice * (1 - 0.12);
			System.out.print("Thank you for repeat purchase as a premium customer, your discounted price is: " + discountedPrice);

		} else if (customerType == 1 &&  repeatType == 2){
			discountedPrice = itemPrice * (1 - 0.10);
			System.out.print("Thank you for purchase as a premium customer, your discounted price is: " + discountedPrice);

		} else if (customerType == 2 &&  repeatType == 1){
			discountedPrice = itemPrice * (1 - 0.07);
			System.out.print("Thank you for repeat purchase as a regular customer, your discounted price is: " + discountedPrice);;

		} else if (customerType == 2 &&  repeatType == 2){
			discountedPrice = itemPrice * (1 - 0.05);
			System.out.print("Thank you for purchase as a regular customer, your discounted price is: " + discountedPrice);
		
		
		} else {
			System.out.print("Please cross check the details you entered.");
		
		


		}


		


	}



}
