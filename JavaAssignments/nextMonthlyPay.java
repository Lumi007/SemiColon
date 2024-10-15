import java.util.Scanner;
class nextMonthlyPay{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Balance: ");
		float  balance = input.nextFloat();
		System.out.print("Enter Annual Interest Rate (eg 3 for 3%): ");
		float  annualInterestRate = input.nextFloat();
		double interest = balance * (annualInterestRate/1200);
		System.out.printf("the interest is %.2f for next month", interest);
	}
}