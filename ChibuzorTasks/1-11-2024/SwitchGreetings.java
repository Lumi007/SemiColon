import java.util.Scanner;

public class SwitchGreetings  {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	

	String greetings =  "Can I greet you, Please select any of the options\n1. English\n2. Yoruba\n3. Igbo\n4. Hausa\n";

	System.out.println(greetings);
	int firstChoice = input.nextInt();


	switch (firstChoice){

	
	case 1 :
		System.out.println("Good Morning");
	break;
	case 2 :
		System.out.println("Ekaaro");
	break;
	case 3 :
		System.out.println("Ibolachi");
	break;
	case 4 :
		System.out.println("Inakwana");
	break;

	}



	}



}