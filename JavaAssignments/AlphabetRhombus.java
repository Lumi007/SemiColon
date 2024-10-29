import java.util.Scanner;

public class AlphabetRhombus {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		

		System.out.print("Enter a number: ");
		int number = input.nextInt();

		int placeholder = 1;
	
        	for (int i = 1; i <= number; i++) {
            		for (int j = 1; j <= number-i; j++) {
                		System.out.print(" ");
            		}
           
            		for (int j = 1; j <= 2*i-1; j++) {
                		System.out.print(placeholder);
            		}
           		System.out.println();

		}
		for (int i = number-1; i >= 1; i--) {
          		for (int j = 1; j <= number-i; j++) {
                		System.out.print(" ");
            		}
            
            		for (int j = 1; j <= 2*i-1; j++) {
                		System.out.print(placeholder);
            		}
           		 System.out.println();
        	}

	}

	

}