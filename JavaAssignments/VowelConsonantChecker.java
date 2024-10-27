import java.util.Scanner;
public class VowelConsonantChecker {
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter an alphabet to check: ");
	String alphabet = input.nextLine().toLowerCase(); 
	

	if (alphabet.equals("a") || alphabet.equals("e") || alphabet.equals("i") || alphabet.equals("o") || alphabet.equals("u")){
		
		System.out.printf("%s is a Vowels", alphabet);
	} else {
	
		System.out.printf("%s is a Consonant", alphabet);
	}


	
	}
}