import java.util.Scanner;
class acceleration {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the starting velocity in m/s: ");
		float  intialVelocity = input.nextFloat();
		System.out.print("Enter the final velocity in m/s: ");
		float  finalVelocity = input.nextFloat();
		System.out.print("Enter the time taken in seconds: ");
		float  timeTaken = input.nextFloat();
		double averageAcceleration = (finalVelocity - intialVelocity)/timeTaken;
		System.out.printf("the average acceleration is %.4f", averageAcceleration);
	}
}