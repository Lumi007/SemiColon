import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String... args){
	
		Scanner input = new Scanner(System.in);

		System.out.print("Hello, Welcome to the Semicolon Mall, Please enter your name:  ");
		String customerName = input.nextLine();

		System.out.println("Hello " + customerName + ", Welcome to the discount app   ");

		System.out.print(": ");
		int customerType = input.nextInt();



		if (studentGrade > 80 && studentGrade <= 100){
			System.out.print("You are a Distinction Student");

		} else if (studentGrade >= 60 && studentGrade < 80){
			System.out.print("You are a first class Student");

		} else if (studentGrade >= 40 && studentGrade < 60){
			System.out.print("You are a second class Student");

		} else if (studentGrade > 32 && studentGrade < 40){
			System.out.print("You are a pass Student");
		
		} else if (studentGrade >= 0 && studentGrade < 32){
			System.out.print("You fail the course");
		
		} else {
			System.out.print("You have entered an invalid score");
		
		


		}


		


	}



}
