import java.util.Scanner;

public class RangeDivisibilityCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter starting value x: ");
        int firstNumberInRange = scanner.nextInt();
        
        System.out.print("Enter ending value y: ");
        int lastNumberInRange = scanner.nextInt();
        
        System.out.print("Enter divisor p: ");
        int divisor = scanner.nextInt();
        
        
        int firstDivisible = firstNumberInRange;
        while (firstDivisible % divisor != 0) {
            firstDivisible++;
        }
        
       
        int count = 0;
        if (firstDivisible <= lastNumberInRange) {
         
            int lastDivisible = lastNumberInRange - (lastNumberInRange % divisor);
            
            count = ((lastDivisible - firstDivisible) / divisor) + 1;
        }
        
      
        System.out.println("The number of divisible in the range is: " +count);
        
    }
}