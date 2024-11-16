import java.util.HashMap;


public class NewHashMapTest {
	public static void main(String... args){
		HashMap<String, Integer> examScores = new HashMap<String, Integer>();


		examScores.put("Maths", 75);
		examScores.put("Physics", 89);
		examScores.put("Programming", 90);
		examScores.put("Sciences", 100);

		examScores.putIfAbsent("Java", 90);
		examScores.replace("Programming", 50);

		examScores.forEach((subject, score) -> {
			examScores.replace(subject, score - 10);
		});

		System.out.println(examScores);



	}




}