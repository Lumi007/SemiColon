import java.util.Scanner;
public class MultiplicationTable {
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter your integer: ");
	int multNumber = input.nextInt(); 

	for (int multiple = 0; multiple <= 5; multiple++){
		int resultNumber = multNumber * multiple;
		System.out.printf("%d * %d = %d%n", multNumber, multiple, resultNumber);

		



		}




	}

}