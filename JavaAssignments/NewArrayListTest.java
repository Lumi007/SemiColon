import java.util.ArrayList;
import java.util.Comparator;



public class NewArrayListTest {
	public static void main(String... args){

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(5);
		numbers.add(3);
		numbers.add(1);
		numbers.add(8);
		numbers.add(10);

		numbers.sort(Comparator.naturalOrder());
		System.out.println(numbers.toString());
				
		

	}




}