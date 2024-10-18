import java.util.Scanner;

public class FeetToMeters {
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a value for your feets : ");
		float feet = input.nextFloat();
	
		

		double meters = feet * 0.305;

		System.out.printf("%.2f  is: %.2f Meters %n", feet, meters);

	}

}