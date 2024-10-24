import java.util.Scanner;
public class FinanceApplication {
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);



	System.out.print("Enter your investment amount: ");
	double investmentAmount = input.nextDouble();

	System.out.print("Enter your Annual Interest rate: ");
	double annualInterest= input.nextDouble();

	System.out.print("Enter your number of years: ");
	double numberOfYears = input.nextDouble();

	double monthlyInterest = (annualInterest/100)/12;
	
	

	double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterest),(numberOfYears*12));

	System.out.printf("Accummulated value of your investment in %.1f years is %.2f%n", numberOfYears, futureInvestmentValue);
	




	}



}