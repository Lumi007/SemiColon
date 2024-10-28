import java.util.Scanner;

public class TaxCalculator {
	public static void main(String[] args) {
        	Scanner input = new Scanner(System.in);
        
        
        	System.out.println("Enter the salaries from the list to calculate their tax");
        
        	System.out.print("Enter the first person salary: ");
        	double firstPersonSalary = input.nextDouble();
        
        	System.out.print("Enter the second person salary: ");
        	double secondPersonSalary = input.nextDouble();
        
        	System.out.print("Enter the third person salary: ");
        	double thirdPersonSalary = input.nextDouble();

		if (firstPersonSalary <= 30000 || secondPersonSalary <= 30000 || thirdPersonSalary <= 30000){
			double firstPersonTax = firstPersonSalary * 0.15;
			double secondPersonTax = secondPersonSalary * 0.15;
			double thirdPersonTax = thirdPersonSalary * 0.15;
			
			System.out.printf("the Tax for %.2f is %.2f\n", firstPersonSalary, firstPersonTax);
			System.out.printf("the Tax for %.2f is %.2f\n", secondPersonSalary, secondPersonTax);
			System.out.printf("the Tax for %.2f is %.2f\n", thirdPersonSalary, thirdPersonTax);

		}else {
			double firstPersonTax = firstPersonSalary * 0.15;
			double secondPersonTax = secondPersonSalary * 0.15;
			double thirdPersonTax = thirdPersonSalary * 0.15;
			
			System.out.printf("the Tax for %.2f is %.2f\n", firstPersonSalary, firstPersonTax);
			System.out.printf("the Tax for %.2f is %.2f\n", secondPersonSalary, secondPersonTax);
			System.out.printf("the Tax for %.2f is %.2f\n", thirdPersonSalary, thirdPersonTax);
	
		}
	}
}