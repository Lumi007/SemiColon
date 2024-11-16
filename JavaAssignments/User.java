import java.time.LocalDate;
import java.time.Period;

public class User {

	public String name;
	public LocalDate dateOfBirth;

	public int age(){

		int age	= Period.between(this.dateOfBirth, LocalDate.now()).getYears();
		return age;
	}

}