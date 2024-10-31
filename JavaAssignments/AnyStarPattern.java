import java.util.Scanner;

public class AnyStarPattern {
	public static void main(String[] args) {
 	

	Scanner input = new Scanner(System.in);

	System.out.print("Please enter a number: ");
	int rowNumber = input.nextInt();

	
	for (int i=1; i <= rowNumber; i++ ){
		for(int j = i; j < rowNumber; j++){
		System.out.print(" ");
		}
		for(int j = 1; j < i; j++){
		System.out.print("*");
		}
		for(int j = 1; j <= i; j++){
		System.out.print("*");
		}
	System.out.println();
	}
	
	for (int i=1; i <= rowNumber; i++ ){
		for(int j = 1; j <=i; j++){
		System.out.print(" ");
	}
		for(int j = i; j < rowNumber; j++){
		System.out.print("*");
	}
		for(int j = i; j <=rowNumber; j++){
		System.out.print("*");
	}
	System.out.println();
	}
	

	}


}