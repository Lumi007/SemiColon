import java.util.Scanner;


public class PoundsToMeter {
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.print("Enter your weight in Pounds: ");
	float weightInPounds = input.nextFloat();
	

	double weightInMeters  = weightInPounds * 0.454;

	System.out.printf("%.3f pounds is %.3f Kilograms", weightInPounds, weightInMeters);


	

	}


}
