import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;




public class MBTIPersonalityTest {
	public static void main (String[] args)
	{
		String[][] sectionA = {{"A) Expend energy, enjoy groups","B) Conserve energy, enjoy one-on-one"},{"A) More Outgoing,think out loud","B) More reserved, think to yourself"},{"A) Seek many tasks, public activities, interaction with others","B) Seek private, solitary activities with quiet to concentrate"},{"A) External communicative, express yourself","B) Internal, reticent, Keep to yourself"},{"A) Active, initiate","B) Reflective, deliberated"}};
		String[][] sectionB = {{"A) Interpret literally","Look for meaning and possibilities"},{"A) Pratical, realistic, experiential","B) Imaginative, innovative, theoretical"},{"A) Standard, usual, conventional","B) Different, novel, unique"},{"A) Focus on here-and-now","B) Look to the future, global perpespective, big picture"},{"A) Facts, things, what is","B) Ideas, dreams, what could be, philosophical"}};
		String[][] sectionC = {{"A) Logical, thinking, questioning","B) Emphatic, feeling, accomodating"},{"A) Candid, straight forward, frank","B) Tactful, kind, encouraging"},{"A) Firm, tend to criticize, hold the line","B) Gentle, tend to appreciate, conciliate"},{"A) Tough minded, just","B) Tender hearted, merciful"},{"A) Matter of facts,issue-oriented","B) Sensitive, people-oriented, compassionate"}};
		String[][] sectionD = {{"A) Organized, orderly","B) Flexible, adaptable"},{"A) Plan, schedule","B) Unplanned, spontaneous"},{"A) Regulated, structured","B) Easy going, live and let live"},{"A) Preparation, plan ahead","B) Go with the flow, adapt as you go"},{"A) Control, govern","B) Latitude, freedom"}};

		ArrayList<String> sectionAAnswers = new ArrayList<>();
		ArrayList<String> sectionBAnswers = new ArrayList<>();
		ArrayList<String> sectionCAnswers = new ArrayList<>();
		ArrayList<String> sectionDAnswers = new ArrayList<>();

		String personalityType = "";
		int sectionACountA = 0;
		int sectionACountB = 0;
		int sectionBCountA = 0;
		int sectionBCountB = 0;	
		int sectionCCountA = 0;
		int sectionCCountB = 0;
		int sectionDCountA = 0;
		int sectionDCountB = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to MBTI Personality Test");
        	System.out.println("Please answer each question by selecting A or B");

		for (int i = 0; i < sectionA.length; i++)
		{	
			boolean validAnswer = false;
			while (!validAnswer) {	
				System.out.println(sectionA[i][0]);
				System.out.println(sectionA[i][1]);
				System.out.println("Please select A or B");
				System.out.print(">>>>>>>>>>>  ");
				String response = input.next().toUpperCase();
				
				char answer = response.charAt(0);

				if (answer == 'A')
				{
					sectionACountA++;
					sectionAAnswers.add(sectionA[i][0]);
					validAnswer = true;
					
				} else if (answer == 'B')
				{
					sectionACountB++;
					sectionAAnswers.add(sectionA[i][1]);
					validAnswer = true;

				} else {
					System.out.println("Please enter either A or B");			
				}
			}
		}
		personalityType += sectionACountA > sectionACountB ? "E" : "I";
		for (int i = 0; i < sectionB.length; i++)
		{	
			boolean validAnswer = false;
			while (!validAnswer) {	
				System.out.println(sectionB[i][0]);
				System.out.println(sectionB[i][1]);
				System.out.println("Please select A or B");
				System.out.print(">>>>>>>>>>>  ");
				String response = input.next().toUpperCase();
				
				char answer = response.charAt(0);


				if (answer == 'A')
				{
					sectionBCountA++;
					sectionBAnswers.add(sectionB[i][0]);
					validAnswer = true;
					
				} else if (answer == 'B')
				{
					sectionBCountB++;
					sectionBAnswers.add(sectionB[i][1]);
					validAnswer = true;

				} else {
					System.out.println("Please enter either A or B");			
				}

				
			}
	
		}
		personalityType += sectionBCountA > sectionBCountB ? "S" : "N";
		for (int i = 0; i < sectionC.length; i++)
		{	
			boolean validAnswer = false;
			while (!validAnswer) {	
				System.out.println(sectionC[i][0]);
				System.out.println(sectionC[i][1]);
				System.out.println("Please select A or B");
				System.out.print(">>>>>>>>>>>  ");
				String response = input.next().toUpperCase();
				
				char answer = response.charAt(0);

				if (answer == 'A')
				{
					sectionCCountA++;
					sectionCAnswers.add(sectionC[i][0]);
					validAnswer = true;
					
				} else if (answer == 'B')
				{
					sectionCCountB++;
					sectionCAnswers.add(sectionC[i][1]);
					validAnswer = true;

				} else {
					System.out.println("Please enter either A or B");			
				}

			}
		}
		personalityType += sectionCCountA > sectionCCountB ? "T" : "F";
		for (int i = 0; i < sectionD.length; i++)
		{	
			boolean validAnswer = false;
			while (!validAnswer) {	
				System.out.println(sectionD[i][0]);
				System.out.println(sectionD[i][1]);
				System.out.println("Please select A or B");
				System.out.print(">>>>>>>>>>>  ");
				String response = input.next().toUpperCase();
				
				char answer = response.charAt(0);

				if (answer == 'A')
				{
					sectionDCountA++;
					sectionDAnswers.add(sectionD[i][0]);
					validAnswer = true;
					
				} else if (answer == 'B')
				{
					sectionDCountB++;
					sectionDAnswers.add(sectionD[i][1]);
					validAnswer = true;

				} else {
					System.out.println("Please enter eithe A or B");			
				}

			}
		}
		personalityType += sectionDCountA > sectionDCountB ? "J" : "P";
	System.out.println(personalityType);

	}


}