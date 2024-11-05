import java.util.Scanner;

public class NumberPattern{
	public static void main(String[] args){
	

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		int rowNumber = input.nextInt();

		int number = 1;
		for ( int i = 1;i <= rowNumber; i++){
			for (int j=1; j <= i; j++){
				System.out.print(i);
			}
		for ( int k = 1; k <= rowNumber; i++){
			for (int j = k; j <= k; j++){
				System.out.print(j);
			}
		}
		System.out.println();
		}


	}



}