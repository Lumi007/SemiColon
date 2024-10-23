import java.util.Scanner;

public class EarthDistanceCalculator {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double EARTH_RADIUS = 6371.01;
      
        System.out.print("Input the latitude of coordinate 1: ");
        double lat1 = scanner.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double long1 = scanner.nextDouble();
        
     
        System.out.print("Input the latitude of coordinate 2: ");
        double lat2 = scanner.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double long2 = scanner.nextDouble();
        
       
        double distance = EARTH_RADIUS * 
                         Math.acos(Math.sin(lat1) * Math.sin(lat2) + 
                                 Math.cos(lat1) * Math.cos(lat2) * 
                                 Math.cos(long1 - long2));
        
        System.out.println("The distance between those points is: " + distance + " km");
        
    }
}