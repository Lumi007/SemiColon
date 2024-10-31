import java.util.Scanner;

public class AlphabetRhombus {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		

		System.out.print("Enter a number: ");
		int number = input.nextInt();

		for (int i = 0; i < number; i++) {
            		for (int j = 0; j < number - i - 1; j++) {
                		System.out.print(" ");
            		}
            		for (int j = 0; j <= i; j++) {
                		System.out.print((char)('A' + j));
            		}
            		for (int j = i - 1; j >= 0; j--) {
                		System.out.print((char)('A' + j));
            		}
            		System.out.println();

		}
		for (int i = number - 2; i >= 0; i--) {
            		for (int j = 0; j < number - i - 1; j++) {
                		System.out.print(" ");
            		}
           		for (int j = 0; j <= i; j++) {
                		System.out.print((char)('A' + j));
            		}
            		for (int j = i - 1; j >= 0; j--) {
                		System.out.print((char)('A' + j));
            		}
           		System.out.println();
        	}

	}

	

}