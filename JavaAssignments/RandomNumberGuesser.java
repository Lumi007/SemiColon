import java.util.Scanner;
import java.util.Random;

public class RandomNumberGuesser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
       
        int randomNumber = random.nextInt(100) + 1;
        int userGuess;
        
        System.out.println("I have generated a number between 1 and 100.");
        System.out.println("Try to guess it!");
        
      
        do {
            System.out.print("Enter your guess: ");
            userGuess = input.nextInt();
            
            if (userGuess > randomNumber) {
                System.out.println("Too high, try again.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Congratulations! You guessed the number correctly!");
            }
        } while (userGuess != randomNumber);
        
       
    }
}