import java.util.Scanner;

import java.util.Arrays;


public class MBTIPersonalityTest {
	public static void main (String[] args)
	{
		final int ARRAY_LENGTH = 10;

		int[] arrayNumbers = new int[ARRAY_LENGTH];

		int [] arrayFilled = {32, 27, 64, 18,95,14, 90, 70, 60, 37};
		System.out.printf("%s%8s%n","Index", "Value");

		for (int counter = 0; counter < arrayFilled.length; counter++)	
		{
			System.out.printf("%5d%8d%n", counter, arrayFilled[counter]);
		}






	}


}