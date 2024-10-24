import java.util.Scanner;
public class GreatestNumber {
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);



	System.out.print("Enter your First Number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter your Second Number: ");
	int secondNumber = input.nextInt();

	System.out.print("Enter your Third number: ");
	int thirdNumber = input.nextInt();

	int largest = firstNumber;

	if (secondNumber > largest){
		largest = secondNumber;
	}else if (thirdNumber >largest){
		largest = thirdNumber;
	}
		

	

	System.out.printf("The greatest : %d", largest);
	




	}



}