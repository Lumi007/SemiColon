import java.util.Scanner;
class convertToMeters{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in feets to convert: ");
		float numberInFeet = input.nextFloat();
		double numberInMeters = numberInFeet * 0.305;
		System.out.printf("%2f feet is %.2f meters", numberInFeet, numberInMeters);
	}
}