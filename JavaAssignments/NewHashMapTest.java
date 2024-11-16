import java.util.HashMap;


public class NewHashMapTest {
	public static void main(String... args){
		HashMap<String, Integer> examScores = new HashMap<String, Integer>();


		examScores.put("Maths", 75);
		examScores.put("Physics", 89);
		examScores.put("Programming", 90);


		System.out.println(examScores.toString());



	}




}