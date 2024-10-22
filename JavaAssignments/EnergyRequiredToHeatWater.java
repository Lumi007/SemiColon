import java.util.Scanner;


public class EnergyRequiredToHeatWater {
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	System.out.print("Enter the weight of the water in KG: ");
	float weightOfWater = input.nextFloat();
	
	System.out.print("Enter the initial temperature of the waterin celsius: ");
	float initialTemp = input.nextFloat();

	System.out.print("Enter the final temperature of the water in celsius: ");
	float finalTemp = input.nextFloat();

	double energyRequired  = weightOfWater * (finalTemp - initialTemp) * 4184;

	System.out.println("The amount of energy needed is " + energyRequired + " joules");


	

	}


}
