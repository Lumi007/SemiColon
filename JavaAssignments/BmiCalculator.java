import java.util.Scanner;

public class BmiCalculator {
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter your weight in Kg: ");
		float weightInKg = input.nextFloat();
	
		System.out.print("Please enter your height in meters: ");
		float heightInMeters = input.nextFloat();

		double bmi = weightInKg/ (heightInMeters * heightInMeters);

		System.out.printf("Your BMI is: %.2f%n", bmi);

	}



}