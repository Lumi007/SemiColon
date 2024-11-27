import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PrimeCheckerStandardTest {
	@Test
	public void getPrimeBeforeInputTest() {
		// given (pre-conditions)
		PrimeChecker primeChecker = new PrimeChecker();
		int input = 19;	
        
		// action (the functionality being tested)
		int[] primeNumbers = primeChecker.getPrimeNumberBeforeInput(input);
		System.out.println("actual : " + Arrays.toString(primeNumbers));
        
     		// check
        	int[] expected = {2, 3, 5, 7, 11, 13, 17};
        	assertArrayEquals(expected, primeNumbers);    
    	}



	@Test
	public void testThatGetPrimeNumberFailsForNegativeValue() {
	
		//given
		PrimeChecker primeChecker = new PrimeChecker();
		int input = -9;

	
		//action
		int[] primeNumbers = primeChecker.getPrimeNumberBeforeInput(input);


		//check
		assertThrows(IllegalArgumentException.class, ()-> primeChecker.getPrimeNumberBeforeInput(input));
	}



	
}