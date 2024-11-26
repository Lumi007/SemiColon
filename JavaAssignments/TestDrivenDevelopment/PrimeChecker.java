import static java.util.stream.IntStream.range;
import java.util.stream.IntStream;

public class PrimeChecker {
    public int[] getPrimeNumberBeforeInput(int input) {
        return IntStream.range(2, input)
            .filter(this::isNumberPrime)
            .toArray();
    }

    private boolean isNumberPrime(int number) {
        return IntStream.rangeClosed(2, (int)Math.sqrt(number))
            .noneMatch(divisor -> number % divisor == 0);
    }
}