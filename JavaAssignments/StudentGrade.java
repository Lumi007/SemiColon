import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter the student grade between 0 and 100: ");
	int studentGrade = input.nextInt();
	
	switch (studentGrade/10) {

	case 8 :
	case 9 :
	case 10 :
	System.out.println("You have an A");
	break;

	case 7 :
	case 6 :
		System.out.println("You have a B");
		break;

	case 5 :
		System.out.println("You have a C");
		break;

	default :
		System.out.println("Please enter a valid grade");
		break;

	
	}
	}
}