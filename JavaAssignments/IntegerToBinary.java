import java.util.Scanner;


public class IntegerToBinary {
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.print("Enter an Integer: ");
	int integerToConvert = input.nextInt();
	
	
	
	String convertedBinary = "";
	
	while (integerToConvert != 0){
		int rem = integerToConvert % 2; 
		integerToConvert /= 2;
	convertedBinary  = convertedBinary + rem ;
	}

	System.out.printf("Binary number is %s", convertedBinary );


	

	}


}
