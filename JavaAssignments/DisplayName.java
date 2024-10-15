import java.util.Scanner;

public class DisplayName {
	public static void main(String[] args){

	
	Scanner input = new Scanner(System.in);

	System.out.print("Please enter your name:");
	String yourName = input.nextLine();

	System.out.printf ("Hi my name is %s, and I write Java%n", yourName);
	System.out.println (yourName);
	}


}