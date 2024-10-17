/** 
 * Program: Three-digit Palindrome Checker
 * Purpose: Check whether a three-digit integer is a palindrome.
 * Input: A three-digit integer from the user
 * Output: Message indicating whether the number is a palindrome or not
*/

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a three-digit integer: ");
        int number = scanner.nextInt();
        
        // Extract digits
        int firstDigit = number / 100;
        int lastDigit = number % 10;
        
        // Check if it's a palindrome
        boolean isPalindrome = (firstDigit == lastDigit);
        
        // Output result
        if (isPalindrome) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
        
        scanner.close();
    }
}