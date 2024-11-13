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
		int countA = 0;
		int countB = 0;	

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to MBTI Personality Test");
        	System.out.println("Please answer each question by selecting A or B");

		for (int i = 0; i < sectionA.length; i++)
		{	
			System.out.println(sectionA[i][0]);
			System.out.println(sectionA[i][1]);
			System.out.println("Please select A or B");
			System.out.print(">>>>>>>>>>>  ");
			char answer = input.next().charAt(0);
			

				if (answer == 'A')
				{
					countA++;
					sectionAAnswers.add(sectionA[i][0]);
					
				} else if (answer == 'B')
				{
					countB++;
					sectionAAnswers.add(sectionA[i][1]);

				} else {
					System.out.println("Please enter eithe A or B");			
				}

				personalityType += countA > countB ? "E" : "I";
			
		}
		
		for (int i = 0; i < sectionB.length; i++)
		{	
			System.out.println(sectionB[i][0]);
			System.out.println(sectionB[i][1]);
			System.out.println("Please select A or B");
			System.out.print(">>>>>>>>>>>  ");
			char answer = input.next().charAt(0);
			

				if (answer == 'A')
				{
					countA++;
					sectionBAnswers.add(sectionB[i][0]);
					
				} else if (answer == 'B')
				{
					countB++;
					sectionBAnswers.add(sectionB[i][1]);

				} else {
					System.out.println("Please enter either A or B");			
				}

				personalityType += countA > countB ? "S" : "N";
	
		}
		
		for (int i = 0; i < sectionC.length; i++)
		{	
			System.out.println(sectionC[i][0]);
			System.out.println(sectionC[i][1]);
			System.out.println("Please select A or B");
			System.out.print(">>>>>>>>>>>  ");
			char answer = input.next().charAt(0);
			
			

				if (answer == 'A')
				{
					countA++;
					sectionCAnswers.add(sectionC[i][0]);
					
				} else if (answer == 'B')
				{
					countB++;
					sectionCAnswers.add(sectionC[i][1]);

				} else {
					System.out.println("Please enter either A or B");			
				}

				personalityType += countA > countB ? "T" : "F";
		}
		
		for (int i = 0; i < sectionD.length; i++)
		{	
			System.out.println(sectionA[i][0]);
			System.out.println(sectionA[i][1]);
			System.out.println("Please select A or B");
			System.out.print(">>>>>>>>>>>  ");
			char answer = input.next().charAt(0);
			
		

				if (answer == 'A')
				{
					countA++;
					sectionDAnswers.add(sectionD[i][0]);
					
				} else if (answer == 'B')
				{
					countB++;
					sectionDAnswers.add(sectionD[i][1]);

				} else {
					System.out.println("Please enter eithe A or B");			
				}

				personalityType += countA > countB ? "J" : "P";
		}
	System.out.println(personalityType);

	}


}