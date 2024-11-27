import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PrimeCheckerStandardTest {
	@Test
	public void getPrimeBeforeInputTest() {
		// given (pre-conditions)
		PrimeChecker primeChecker = new PrimeChecker();
        
		// action (the functionality being tested)
		int input = 19;	
		int[] primeNumbers = primeChecker.getPrimeNumberBeforeInput(input);
		System.out.println("actual : " + Arrays.toString(primeNumbers));
        
     		// check
        	int[] expected = {2, 3, 5, 7, 11, 13, 17};
        	assertArrayEquals(expected, primeNumbers);    
    	}



	@Test
	public void testThatGetPrimeNumberFailsForNegativeValue{
	
		
	}



	
}