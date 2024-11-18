import java.util.Scanner;


public class DifferentPattern{
	public static void main(String... arg){
	

		Scanner input = new Scanner(System.in);


		System.out.print("Please enter a number of rows: ");

		int rows = input.nextInt();


		for (int row = 1; row <= rows; row++) {
			for (int spaceColumn = row; spaceColumn <= rows; spaceColumn++) {
				System.out.print(" * ");
            		}
		
			System.out.println();
		}
		

	
	}




}
