import java.util.Scanner;


public class BodyMassIndexCalculator {
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.print("Enter your weight in pounds: ");
	float weightInPounds = input.nextFloat();
	
	System.out.print("Enter your height in inches: ");
	float heightInInches = input.nextFloat();

	double weightInKg = weightInPounds * 0.454;
	double heightInMeters = heightInInches * 0.0254;

	
	double bodyMassIndex  = weightInKg/(heightInMeters * heightInMeters);

	System.out.printf("Your BMI is %.3f", bodyMassIndex );


	

	}


}
