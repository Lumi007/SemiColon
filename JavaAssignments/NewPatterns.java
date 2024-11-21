public class NewPatterns {
	public static void main(String... args){
	

		int rows = 9;
		for (int row = 1; row <= rows; row++){
			for (int star = 1; star <= row; star++){
				System.out.print("*");
			}
			for (int space = row; space <= rows; space++){
					System.out.print("  ");
			}	
			for (int star2 = 1; star2 <= row; star2++){
					System.out.print("*");
				
			}
			
			
		System.out.println();
		}
		for (int row = 1; row <= rows; row++){
			for (int star = row; star <= rows; star++){
				System.out.print("*");
			}
			for (int space = 1; space <= row; space++){
					System.out.print("  ");
			}
			for (int star = row; star <= rows; star++){
				System.out.print("*");
			}
		System.out.println();
		}






	}





}
