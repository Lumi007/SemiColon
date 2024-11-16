import java.time.LocalDate;

public class ObjectOriented{
	public static void main(String... args){
	

	User User = new User();


	User.name = "Olumide D. Fakorede";
	User.dateOfBirth = LocalDate.parse("1993-05-17");



	System.out.printf("%s was born in %s, and he is now %s years old\n  ", User.name, User.dateOfBirth, User.age());



	}



}


