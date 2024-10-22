import java.util.Scanner;


public class RunwayLength {
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.print("Enter the speed of the airplane in m/s: ");
	float speedOfTheAirplane = input.nextFloat();
	
	System.out.print("Enter the acceleration of the airplane in m/s: ");
	float accelerationOfTheAirplane = input.nextFloat();

	
	double minimumRunwayLength  = (speedOfTheAirplane * speedOfTheAirplane)/2 * accelerationOfTheAirplane;

	System.out.println("The minimum runway length is  " + minimumRunwayLength + " Meters");


	

	}


}
