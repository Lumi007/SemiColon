import java.util.Scanner;
import java.util.ArrayList;

public class ListPrime {
    public static ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
    
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        System.out.print(getPrimeList(number));
    }
    
    public static ArrayList<Integer> getPrimeList(int number) {
              
        for (int i = 1; i <= number; i++) {
            int divisorCount = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisorCount++;
                }
            }
            if (divisorCount == 2) {
                primeNumbers.add(i);
            }
        }
        
        return primeNumbers;
    }
}