import java.util.Scanner;

public class FloatingNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Input floating-point number: ");
        double firstFloat = input.nextDouble();
        
      
        System.out.print("Input floating-point another number: ");
        double secondFloat = input.nextDouble();
        
       
        int roundedFirstFloat = (int) (firstFloat * 1000)/1000;
        int roundedSecondFloat = (int) (secondFloat * 1000)/ 1000;
        
        
        if (roundedFirstFloat == roundedSecondFloat) {
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("They are different");
        }
        
   
    }
}