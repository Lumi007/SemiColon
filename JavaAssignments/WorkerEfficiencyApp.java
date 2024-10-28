import java.util.Scanner;

public class WorkerEfficiencyApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
	char decision;
	do{
		System.out.print("Welcome to worker efficiency app, enter Y/N to continue: ");
		decision = input.next().charAt(0);

		if (decision == 'y' || decision == 'Y'){

        		System.out.print("Enter the time taken by the worker to complete the task in hours: ");
        		double timeTaken = input.nextDouble();


			if ( timeTaken >= 2 && timeTaken <= 3) {
				System.out.println("This is a highly efficient worker");
			} else if ( timeTaken > 3 && timeTaken <= 4) {
				System.out.println("This worker need to be encouraged to do better");
			} else if ( timeTaken > 4 && timeTaken <= 5) {
				System.out.println("This worker needs to be given training");
			}else if ( timeTaken > 5 || timeTaken <= 1) {
				System.out.println("This worker should be asked to leave the company as he is either cutting corners or grossly efficient");
			}
        	}else {
			System.out.println("Thank You");
		}
	
	}while(decision == 'y' || decision == 'Y');

	}
}