import java.util.Scanner;

public class NumberPattern{
	public static void main(String[] args){
	

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		int rowNumber = input.nextInt();

		
		for ( int rows = 1; rows <= rowNumber; rows++)
		{
			for (int col = 1; col <= rows; col++)
			{
				System.out.print(col + " ");

			}
		System.out.println();
		}
		
		for (int rows = 1; rows <= rowNumber; rows++)
		{
			for(int col = rowNumber; col >= rows; col--)
			{
				System.out.print(col + " ");
			}
		System.out.println();	
		}


	}



}