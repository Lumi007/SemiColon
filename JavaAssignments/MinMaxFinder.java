import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int largest = number;  
        int smallest = number;
        
        char choice;
        do {
            System.out.print("Do you want to enter more numbers? (y/n): ");
            choice = input.next().charAt(0);
            
            if (choice == 'y' || choice == 'Y') {
                System.out.print("Enter a number: ");
                number = input.nextInt();
                

                if (number > largest) {
                    largest = number;
                }
                if (number < smallest) { 
                    smallest = number;
                }
            }
            
        } while (choice == 'y' || choice == 'Y');
        
        System.out.println("\nLargest number entered: " + largest);
        System.out.println("Smallest number entered: " + smallest);
        
    
    }
}