import java.util.Scanner;


public class DiamondPattern{
	public static void main(String... arg){
	

		Scanner input = new Scanner(System.in);


		System.out.print("Please enter a number of rows: ");

		int rows = input.nextInt();


		for (int row = 1; row <= rows; row++) {
			for (int spaceColumn = row; spaceColumn <= rows; spaceColumn++) {
				System.out.print(" ");
            		}
			for (int starColumn = 1; starColumn <= row; starColumn++) {					System.out.print(starColumn);
			}

			for (int starColumn = 1; starColumn <= row-1; starColumn++) {					System.out.print(starColumn);

			}
			System.out.println();
		}
		

		for (int row = 1; row <= rows; row++) {
			for (int spaceColumn = 1; spaceColumn <= row; spaceColumn++) {
				System.out.print(" ");
            		}
			for (int starColumn = row; starColumn <= rows; starColumn++) {					System.out.print("*");
			}

			for (int starColumn =row; starColumn <= rows-1; starColumn++) {					System.out.print("*");

			}
			System.out.println();
		}
	}




}
