import java.util.Arrays;

public class SortedArray {
	public static void main(String... args) {
		int[] arrayOne = {1, 3, 5};
		int[] arrayTwo = {2, 4, 6};

		int[] mergedArray = new int[arrayOne.length + arrayTwo.length];
		int i = 0, j = 0, k = 0;
		
		while (i < arrayOne.length && j < arrayTwo.length) {
			if (arrayOne[i] <= arrayTwo[j]) {
				mergedArray[k++] = arrayOne[i++];
			} else {
				mergedArray[k++] = arrayTwo[j++];
			}
		}
		while (i < arrayOne.length) {
			mergedArray[k++] = arrayOne[i++];
		}
		while (j < arrayTwo.length) {
			mergedArray[k++] = arrayTwo[j++];
		}
		
		System.out.println(Arrays.toString(mergedArray));
	}
}