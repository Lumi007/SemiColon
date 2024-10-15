import java.util.Scanner;
class costOfTrip {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the distance to drive in miles: ");
		float  distanceToDrive = input.nextFloat();
		System.out.print("Enter the the miles per gallon: ");
		float  milesPerGallon = input.nextFloat();
		System.out.print("Enter the price per gallon: ");
		float  pricePerGallon = input.nextFloat();
		double costOfDriving = (distanceToDrive/milesPerGallon)*pricePerGallon;
		System.out.printf("the cost of driving %2f miles is $%.4f", distanceToDrive, costOfDriving);
	}
}