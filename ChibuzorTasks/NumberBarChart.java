import java.util.ArrayList;
import java.util.Scanner;

public class NumberBarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter five numbers between 1 to 30");

        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Enter number " + (i + 1) + ": ");
                int num = scanner.nextInt();
                if (num >= 1 && num <= 30) {
                    numbers.add(num);
                    break;
                } else {
                    System.out.println("Number must be between 1 and 30. Try again.");
                }
            }
        }

        System.out.println("\nBar Chart:");
        for (int num : numbers) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}