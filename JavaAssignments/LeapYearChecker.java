import java.util.Scanner;
public class LeapYearChecker {
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a year to check: ");
	int yearToCheck = input.nextInt(); 
	

	if (yearToCheck % 4 == 0){
		
		System.out.printf("%d is a leap year", yearToCheck);
	} else {
	
		System.out.printf("%d is a leap year", yearToCheck);
	}
	
	}
}