import java.util.Scanner;
public class VowelConsonantChecker {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an alphabet to check: ");
        String alphabet = input.nextLine(); 
        
        if (alphabet.length() <= 1){
            char ch = alphabet.charAt(0);
            if (Character.isLetter(ch)) { 
                if (alphabet.equals("a") || alphabet.equals("e") || alphabet.equals("i") || alphabet.equals("o") || alphabet.equals("u")
                    || alphabet.equals("A") || alphabet.equals("E") || alphabet.equals("I") || alphabet.equals("O") || alphabet.equals("U"))  {
                    
                    System.out.printf("%s is a Vowel", alphabet);
                } else {
                    System.out.printf("%s is a Consonant", alphabet);
                }
            } else {
                System.out.println("Please enter a valid alphabet");
            }
        } else {
            System.out.println("Please enter an Alphabet");
        }
    }
}