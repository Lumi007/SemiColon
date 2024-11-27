import java.util.Arrays;


public class PrimeCheckerTest{
	public static void getPrimeBeforeInputTest(){

		//given (pre-conditions)
		PrimeChecker primeChecker = new PrimeChecker();


		//action (the functionality being tested)
		int input = 19;
		int[] primeNumbers = primeChecker.getPrimeNumberBeforeInput(input);


		//check
		int[] expected = {2,3,5,7,11,13,17};
		for (int index = 0; index < primeNumbers.length; index++){
			if (primeNumbers[index] != expected[index]){
				System.out.printf("Test Failed\n Expected :%d\nactual: %d", expected[index], primeNumbers[index]);
				System.exit(1);	
			}

		
		}

	System.out.println("Test passed: \nexpected: " + Arrays.toString((expected)) + "\nactual: []");

	}


	public static void main(String[] arg){

		getPrimeBeforeInputTest();
	
	}








}