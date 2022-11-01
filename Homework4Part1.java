import java.util.Scanner; // imports scanner util
import java.util.Random; // Imports random util
public class Homework4Part1 {

public static void main(String[] args) {

// Creating a new scanner part 1 of hw
      Scanner userinput = new Scanner(System.in);
      Random random = new Random();
      int yourWins = 0;
      int botWins = 0;
      int ties = 0;
      String userchoice = "";
      // 0 is scissors, 1 is rock and 2 is paper
      while (yourWins != 3 || botWins != 3) {
      // This is gathering the user input for rock paper scissors
      System.out.println("Enter rock paper or scissors");
      userchoice = userinput.next();
      
      // 0 is rock
      // 1 is paper
      // 2 is scissors      
      int number = 0; 
      if (userchoice.equals("rock")) {
      number = 0;
      }
      else if (userchoice.equals("paper")) {
      number = 1;
      }
      else if (userchoice.equals("rock")) {
      number = 2;
      }
      
      // Computer then picks a random number between 0 and 2
      
      int computersNumber = random.nextInt(3);
      // Now if else checks through all possibilities
      if (computersNumber == 0 && number == 0) {
         System.out.println("You tied with scissors!");
         ties = ties + 1;
         System.out.println("Score(You vs Bot): " + yourWins + " " + botWins + " " + ties); 
         }
      else if (computersNumber == 0 && number == 1) {
         System.out.println("You win rock beats scissors!");
         yourWins = yourWins + 1;
         System.out.println("Score(You vs Bot): " + yourWins + " " + botWins + " " + ties);
         }
      else if (computersNumber == 0 && number == 2) {
         System.out.println("You lose scissors beats paper!");
         botWins = botWins + 1;
         System.out.println("Score(You vs Bot): " + yourWins + " " + botWins + " " + ties);
         }
      else if (computersNumber == 1 && number == 1) {
         System.out.println("You tied with rock!");
         ties = ties + 1;
         System.out.println("Score(You vs Bot): " + yourWins + " " + botWins + " " + ties);
         }
      else if (computersNumber == 1 && number == 0) {
         System.out.println("You lose rock beats scissors!");
         botWins = botWins + 1;
         System.out.println("Score(You vs Bot): " + yourWins + " " + botWins + " " + ties);
         }       
      else if (computersNumber == 1 && number == 2) {
         System.out.println("You win paper beats rock!");
         yourWins = yourWins + 1;
         System.out.println("Score(You vs Bot): " + yourWins + " " + botWins + " " + ties);
         }
      else if (computersNumber == 2 && number == 2) {
         System.out.println("You tied with paper!");
         ties = ties + 1;
         System.out.println("Score(You vs Bot): " + yourWins + " " + botWins + " " + ties);
         }  
      else if (computersNumber == 2 && number == 1) {
         System.out.println("You lose paper beats rock!");
         botWins = botWins + 1;
         System.out.println("Score(You vs Bot): " + yourWins + " " + botWins + " " + ties);
         }   
      else if (computersNumber == 2 && number == 0) {
         System.out.println("You win scissors beat paper!");
         yourWins = yourWins + 1;
         System.out.println("Score(You vs Bot): " + yourWins + " " + botWins + " " + ties);
         }
      if (yourWins == 3) {
         System.out.println("You win");
         break;
         }
      else if (botWins == 3) {
         System.out.println("Bot wins");
         break;
         }
         }
}
}