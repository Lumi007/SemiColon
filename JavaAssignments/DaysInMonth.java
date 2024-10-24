import java.util.Scanner;

public class DaysInMonth {
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	
	
	System.out.print("Enter a month Number: ");
	int monthNumber = input.nextInt();

	System.out.print("Enter a year: ");
	int year = input.nextInt();
	
	boolean leapYear = year % 4 == 0;

	
	String month = "";

	switch (monthNumber) {
		case 1: 
		month = "January";
		break;
		case 2: 
		month = "February";
		break;
		case 3: 
		month = "March";
		break;
		case 4:
		month = "April";
		break;
		case 5: 
		month =  "May";
		break;
		case 6:
		month = "June";
		break;
		case 7:
		month = "July";
		break;
		case 8:
		month = "August";
		break;
		case 9:
		month = "September";
		break;
		case 10: 
		month = "October";
		break;
		case 11:
		month = "November";
		break;
		case 12:
		month = "December";
		break;	
		default:
		month = "Not a valid month";

	}
	int  numberOfDays;

	if (month == "February" && leapYear == true){
		numberOfDays = 29;
	} else if (month == "September" || month == "April" || month == "June" || month == "November") {
		numberOfDays = 30; 
	} else if (month == "February" && leapYear != true){
		numberOfDays = 28;
	} else {
		numberOfDays = 31;
	}



	System.out.printf("%s %d has %d days", month,year,numberOfDays);
	}

}