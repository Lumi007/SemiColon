import java.util.Scanner;

import java.util.Arrays;


public class MBTIPersonalityTest {
	public static void main (String[] args)
	{
		final int ARRAY_LENGTH = 11;
		int total = 0;

		int[] arrayNumbers = new int[ARRAY_LENGTH];

		int [] arrayFilled = {32, 27, 64, 18,95,14, 90, 70, 60, 37};
		
		for (int counter = 0; counter < arrayFilled.length; counter++)
		{
			arrayFilled[counter] = 2 * counter;
			total += arrayFilled[counter];
		}
		System.out.printf("%s%8s%10s%n","Index", "Value", "Default");

		for (int counter = 0; counter < arrayFilled.length; counter++)	
		{
			System.out.printf("%5d%8d%10d%10d%n", counter, arrayFilled[counter],arrayNumbers[counter], total );
		}






	}


}