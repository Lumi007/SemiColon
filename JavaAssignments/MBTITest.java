import java.util.Scanner;

public class MBTITest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        String[][] questions = {
            {"When you go somewhere for the day, would you rather", "Plan what you will do and when", "Just go!!", "J"},
            {"If you were a teacher, would you rather teach", "Facts-based courses", "Courses involving opinion or theory", "S"},
            {"Are you usually", "A \"good mixer\" with groups of people", "Rather quiet and reserved", "E"},
            {"Do you more often let", "Your head rule your heart", "Your heart rule your head", "T"},
            {"Would you rather", "Arrange dates, parties etc, well in advance", "Be free to do whatever looks like fun when the time comes", "J"}
           
        };
        
        
        char[] answers = new char[20];
        
        
        int[] counts = {0, 0, 0, 0};
        int[] questionCounts = {0, 0, 0, 0}; 
        
        
        System.out.println("Welcome to MBTI Personality Test");
        System.out.println("Please answer each question by selecting A or B");
        
        
        for(int i = 0; i < questions.length; i++) {
            boolean validAnswer = false;
            
            
            while(!validAnswer) {
                
                System.out.println("\nQuestion " + (i + 1) + ":");
                System.out.println(questions[i][0] + "?");
                System.out.println("A) " + questions[i][1]);
                System.out.println("B) " + questions[i][2]);
                System.out.print("Your answer (A/B): ");
                
                
                String response = input.nextLine().toUpperCase();
                
                
                if(response.equals("A") || response.equals("B")) {
                    answers[i] = response.charAt(0);
                    validAnswer = true;
                    
                    
                    String category = questions[i][3];
                    int dimensionIndex = -1;
                    
                   
                    if(category.equals("E")) dimensionIndex = 0;
                    else if(category.equals("S")) dimensionIndex = 1;
                    else if(category.equals("T")) dimensionIndex = 2;
                    else if(category.equals("J")) dimensionIndex = 3;
                    
                    if(dimensionIndex != -1) {
                        questionCounts[dimensionIndex]++;
                        if(response.equals("A")) {
                            counts[dimensionIndex]++;
                        }
                    }
                } else {
                    System.out.println("Invalid input! Please enter only A or B.");
                }
            }
        }
        
        
        System.out.println("\n=== Your MBTI Test Results ===");
        
      
        System.out.println("\nYour answers:");
        for(int i = 0; i < answers.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + answers[i]);
        }
        
        
        StringBuilder personalityType = new StringBuilder();
        
       
        personalityType.append(counts[0] > questionCounts[0]/2 ? "E" : "I");
        
        
        personalityType.append(counts[1] > questionCounts[1]/2 ? "S" : "N");
        
       
        personalityType.append(counts[2] > questionCounts[2]/2 ? "T" : "F");
        
        
        personalityType.append(counts[3] > questionCounts[3]/2 ? "J" : "P");
        
        // Display personality type
        System.out.println("\nYour personality type is: " + personalityType.toString());
        
        
        System.out.println("\nDimension breakdowns:");
        for(int i = 0; i < 4; i++) {
            double percentage = (counts[i] * 100.0) / questionCounts[i];
            String dimensionName = "";
            switch(i) {
                case 0: dimensionName = "Extraversion/Introversion"; break;
                case 1: dimensionName = "Sensing/Intuition"; break;
                case 2: dimensionName = "Thinking/Feeling"; break;
                case 3: dimensionName = "Judging/Perceiving"; break;
            }
            System.out.printf("%s: %.1f%% vs %.1f%%\n", 
                dimensionName, 
                percentage, 
                100 - percentage);
        }
        
        System.out.println("\nFor more information about your personality type, visit:");
        System.out.println("https://www.16personalities.com/");
        
        input.close();
    }
}