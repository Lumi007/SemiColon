/** 
 * Program: Number Counter
 * Purpose: Count the number of negative, positive, and zero values
 *          entered by the user.
 * Input: Five numbers from the user
 * Output: Count of negative, positive, and zero numbers
 */


import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;
        int count = 0;
        

	// Display instructions to the user
        System.out.println("Enter five numbers:");
        
        while (count < 5) {
            System.out.print("Number " + (count + 1) + ": ");
            double number = scanner.nextDouble();
            
            if (number < 0) {
                negativeCount++;
            } else if (number > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
            
            count++;
        }
        
        System.out.println("\nResults:");
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of zeros: " + zeroCount);
      
    }
}