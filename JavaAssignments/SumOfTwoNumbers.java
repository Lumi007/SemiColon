import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;
        
        do {
           
            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();
            
            double sum = num1 + num2;
            System.out.println("Sum = " + sum);
            
            System.out.print("Do you want to perform the operation again? (y/n): ");
            choice = input.next().charAt(0);
            
        } while (choice == 'y' || choice == 'Y');
        
        System.out.println("Thank you for using the calculator!");
    }
}