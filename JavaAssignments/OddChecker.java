import java.util.Scanner;
public class OddChecker {
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);


	

	System.out.print("Enter your number to check: ");
	int numberToCheck = input.nextInt();

	

	if (numberToCheck % 2 == 0){
		System.out.println(1);
	} else {
		System.out.println(0);
	}

	
	}



}