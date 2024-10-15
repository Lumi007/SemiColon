public class GizaPyramidStats {
	public static void main(String[] args){
	double estimatedWeightKg = 5.75e9; 
     	int constructionTimeInYears = 20; 
        double averageStoneWeightKg = 2500;


	double numberOfStonesUsed = estimatedWeightKg/averageStoneWeightKg;
	double weightBuiltPerYear = estimatedWeightKg/constructionTimeInYears;
	double weightBuiltPerHour = weightBuiltPerYear/8760;
	double weightBuiltPerMinute = weightBuiltPerHour/60;

	System.out.println("Statistics of the Great Pyramind of Giza");
	System.out.printf("The number of stones used is %.1f%n", numberOfStonesUsed);
	System.out.printf("The weight built per year is  is %.2fKG%n", weightBuiltPerYear);
	System.out.printf("The weight built per hour is  is %.2fKG%n", weightBuiltPerHour);
	System.out.printf("The weight built per Minute is  is %.2fKG%n", weightBuiltPerMinute);

	
	}

}