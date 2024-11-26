import static java.util.stream.IntStream.rangeClosed;
import java.util.stream.IntStream;


public class PrimeChecker{
	public int[] getPrimeNumberBeforeInput(int input){
		return IntStream.rangeClosed(1, input)
			.filter((number) ->isNumberPrime(number))
			.toArray();




	}


	private boolean isNumberPrime(int number){
		return IntStream.rangeClosed(1, number)
			.filter((x) -> x % number == 0)
			.toArray().length == 0;

		
	}

}