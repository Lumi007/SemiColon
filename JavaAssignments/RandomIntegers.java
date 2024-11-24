import java.security.SecureRandom;




public class RandomIntegers {
	public static void main(String[] args) {

	for (int counter = 1; counter <= 20; counter++) {

		int face = 1 + randomNumbers.nextInt(6);
		System.out.printf("%d ", face);

18 if (counter % 5 == 0) {
19 System.out.println();
20 }
21 }
22 }
23 }
import java.security.SecureRandom; // program uses class SecureRandom
// randomNumbers object will produce secure random numbers
SecureRandom randomNumbers = new SecureRandom();