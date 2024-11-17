import java.time.LocalDate;

public class ObjectOriented{
	public static void main(String... args){
	

	User user = new User("Olumide D. Fakorede", "1993-05-17");
 

	
	Book book = new Book("New Beginings", user.getName(), 120);

	AudioBook audioBook = new AudioBook("New Beginings", user.getName(), 30000);



	user.borrow(book);

	System.out.printf("%s was born in %s, and he is now %s years old\n", user.getName(), user.getDateOfBirth(), user.age());


	System.out.printf("%s is the writer of %s, which has %d pages\n", book.getAuthor(), book.getTitle(), book.getPageCount());

	
	System.out.printf("%s has borrowed these books: %s\n", user.getName(), user.borrowedBooks());

	System.out.println(audioBook);
	}



}


