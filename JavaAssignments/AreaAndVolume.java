import java.util.Scanner;

public class AreaAndVolume {
	public static void main (String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the length of the side of the equilateral triangle:");
	float lengthOfSide = input.nextFloat();
	System.out.print("Enter the height of the equilateral triangle:");
	float heightOfTriangle = input.nextFloat();

	double area = ((Math.sqrt(3))/4)*(lengthOfSide*lengthOfSide);
	double volume = area * heightOfTriangle;

	System.out.printf("Area of the Traingle is %.3f%n", area);
	System.out.printf("Volume of the Traingle is %.3f", volume);


	
	}


}