import java.util.Scanner;

public class SwitchGreetings  {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	

	String greetings =  "Can I greet you, Please select any of the options\n1. English\n2. Yoruba\n3. Igbo\n4. Hausa\n";

	System.out.println(greetings);
	int firstChoice = input.nextInt();


	switch (firstChoice){

	
	case 1 :
		System.out.println("1. Good Morning\n2. Good Afternoon\n3. Good Evening\n");
		int englishChoice = input.nextInt();
		
			switch (englishChoice) {
			case 1: System.out.println("Do have a great morning");
			break;
			
			case 2: System.out.println("Do have a great afternoon");
			break;

			case 3: System.out.println("Do have a great evening");
			break;

		}
	break;
	case 2 :
		System.out.println("1. Ekaaro\n2. Ekaasun\n3. Ekaale\n4. Previous Menu");
		int yorubaChoice = input.nextInt();
			switch (yorubaChoice) {
			case 1: System.out.println("e Ku Ojomo eni");
			break;
			
			case 2: System.out.println("Shey Daadaa lo jo yin lo");
			break;

			case 3: System.out.println("O daa ro");
			break;
			
			case 4:
			break;

			default:
				System.out.println("Invalid Option");
		}
	break;
	case 3 :
		System.out.println("1. Otutu oma\n2. Ehihie oma\n3. ka chifoo");
		int igboChoice = input.nextInt();
	break;
	case 4 :
		System.out.println("1. Inakwana\n2. Ina Gediaa\n3. Ina ni");
		int hausaChoice = input.nextInt();
	break;

	}



	}



}