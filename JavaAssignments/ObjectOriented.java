import java.time.LocalDate;

public class ObjectOriented{
	public static void main(String... args){
	

	User youngerUser = new User();


	youngerUser.name = "Olumide D. Fakorede";
	youngerUser.dateOfBirth = LocalDate.parse("1993-05-17");



	System.out.printf("%s was born in %s, and he is now %s years old", youngerUser.name, youngerUser.dateOfBirth, youngerUser.age());


	User olderUser = new User();

	olderUser.name = "Bankole S. Fakorede";
	olderUser.dateOfBirth = LocalDate.parser("1968-02-28");

	System.out.printf("%s was born in %s, and he is now %s years old", olderUser.name, OlderUser.dateOfBirth, olderUser.age());
	}



}


