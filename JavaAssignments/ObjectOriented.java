import java.time.LocalDate;

public class ObjectOriented{
	public static void main(String... args){
	

	User user = new User("Olumide D. Fakorede", "1993-05-17");


	
	Book book = new Book();


	book.title = "New Beginings";
	book.author = user.getName(); 


	user.borrow(book);

	System.out.printf("%s was born in %s, and he is now %s years old\n", user.getName(), user.getDateOfBirth(), user.age());


	System.out.printf("%s is the writer of %s\n", book.author, book.title);

	
	System.out.printf("%s has borrowed these books: %s", user.getName(), user.books);
	}



}


