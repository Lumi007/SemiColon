import java.util.Scanner;


public class AreaOfPolygon {
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.print("Enter the number of sides on the polygon: ");
	int numberOfSides = input.nextInt();
	
	System.out.print("Enter the length of one side of the polygon: ");
	float lengthOfSide = input.nextFloat();

	double pi = 3.14;

	
	double areaOfThePolygon  = (numberOfSides*Math.pow(lengthOfSide,2))/(4 * Math.tan(pi/numberOfSides));

	System.out.printf("Area of the polygon %.3f: ", areaOfThePolygon);


	

	}


}
