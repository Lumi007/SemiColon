import java.time.LocalDate;

public class ObjectOriented{
	public static void main(String... args){
	

	User user = new User();


	user.name = "Olumide D. Fakorede";
	user.dateOfBirth = LocalDate.parse("1993-05-17");

	
	Book book = new Book();


	book.title = "New Beginings";
	book.author = user.name;

	System.out.printf("%s was born in %s, and he is now %s years old\n", user.name, user.dateOfBirth, user.age());


	System.out.printf("%s is the writer of %s", book.author, book.title);

	}



}


