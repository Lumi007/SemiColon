import java.util.ArrayList;
import java.util.Scanner;

public class CheckoutSystem {
	public static void main(String[] args) {
	System.out.println("Welcome to the Semicolon Store!");

	Scanner input = new Scanner(System.in);
	ArrayList<String> goodsBought = new ArrayList<>();
	ArrayList<Integer> goodsNo = new ArrayList<>();
	ArrayList<Double> goodsPrice = new ArrayList<>();
	

	System.out.print("Please enter your name? ");
	String customerName = input.nextLine();
	displayQuestions();


	
 	}


	public static void displayQuestions(){
		System.out.print("What did the user buy? ");
		String productName = input.nextLine();
		goodsBought.add(productName);
		

		System.out.print("How many pieces? ");
		int productQuantity = input.nextLine();
		goodsNo.add(productQuantity);

		System.out.print("How much per unit? ");
		double productPrice = input.nextDouble();
		goodsPrice.add(productPrice);

		System.out.print("Do you want to add another item? (yes/no) ");
		String anotherProduct = scanner.nextLine().toLowerCase();
		if (!anotherProduct.equals("yes")) {
			break;
		}else {
			displayQuestions();
		}
        }

     
        double subtotal = 0.0;
        for (Product product : products) {
            subtotal += product.getQuantity() * product.getPrice();
        }
        double vat = subtotal * 0.075;
        double total = subtotal + vat;

  
        System.out.println("SEMICOLON STORE");
        System.out.println("INVOICE");
        System.out.println("----------------------------");
        for (Product product : products) {
            double lineTotal = product.getQuantity() * product.getPrice();
            System.out.printf("%-15s %3d x %6.2f %8.2f\n",
                              product.getName(), product.getQuantity(), product.getPrice(), lineTotal);
        }
        System.out.println("----------------------------");
        System.out.printf("%-20s %10.2f\n", "Subtotal:", subtotal);
        System.out.printf("%-20s %10.2f\n", "VAT (7.5%):", vat);
        System.out.printf("%-20s %10.2f\n", "Total:", total);
    }


}