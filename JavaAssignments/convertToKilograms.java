import java.util.Scanner;
class convertToKilograms{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in Pounds to convert: ");
		float numberInPounds = input.nextFloat();
		double numberInKilograms = numberInPounds * 0.454;
		System.out.printf("%2f pounds is %.2f kilograms", numberInPounds, numberInKilograms);
	}
}