public class NewMultiplicationTable {
	public static void main(String... args){
		for (int i =1; i <= 12; i++){
			for (int j = 1; j<= 12; j++){
				System.out.printf ("%2d * %2d = %3d\t", j,i,i*j);

			}
			System.out.println();
		}
 		
		
	  }
}