import java.util.Scanner; // imports scanner util
import java.util.Random; // Imports random util
public class Homework4Accumulative {

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
         
         
         System.out.println("Next Part of HW");
         
   // identify new values for part 2 of HW 4
   // have to have 3 variables for both pos and neg to keep track of counting, average and total
   int positiveVal = 0;
   int negativeVal = 0;
   int posTotal = 0;
   int negTotal = 0;
   int totalIntCount = positiveVal + negativeVal;
   int posAvg = 0;
   int negAvg = 0;
   // Only happens while count is not equal to 20
   while (totalIntCount != 20) {
   
   System.out.println("Please enter an integer: ");
   Scanner input = new Scanner(System.in);
   int valInt = input.nextInt();
   
   if (valInt > 0) {
      // Counter goes up
      positiveVal = positiveVal + 1;
      // Pos total adds onto each other
      posTotal = posTotal + valInt;
      }
   else if (valInt < 0) {
      // Neg counter goes up
      negativeVal = negativeVal + 1;
      // Neg total adds onto each other
      negTotal = negTotal + valInt;
      }
      //if user inputs 0, then the program will end and do final calculations
   else if (valInt == 0) {
      System.out.println("The total of positive integers: " + posTotal + " and the total of negative integers: " + negTotal);
    negAvg = negTotal / negativeVal;
      System.out.println("The average of the positive integers is: " + posAvg + " The average of the negative integers is: " + negAvg);
      break;
   
   }
   
   
   
   
         }
         
         
   // Part 3 of HW 4
   Scanner numHexScan = new Scanner(System.in);
 // user prompt to enter a hexidecimal number
   System.out.println("Enter any hexadecimal num: ");
   String hexNum = numHexScan.nextLine();
   
   // Then parse it into a decimal equivelent
   
   int num = Integer.parseInt(hexNum, 16);
   
   // Display results
   
   System.out.println("Your decimal equivelent is: " + num);
   
   
   // Part 4 of HW 4
   // First see if they are divisible by both
   int counter=0;
   
   System.out.println("Divisible by both 5 and 6");
   
    for (int i=100;i<=1000; i++) {
        if(i % 5==0 && i % 6==0) {
            System.out.print(i +" ");
            counter++;
        }
        if (counter==10) {
            System.out.println();
            
            
            counter=0;
        }
           }
           System.out.println();
   // Then see if they are divisible by only 5
   System.out.println("Divisible by only 5");
   
   for(int i = 100; i <= 1000; i++) {
      if (i % 5 == 0) {
         System.out.print(i + " ");
         counter++;
         }
         if(counter==10) {
            System.out.println();
            
            counter = 0;
            }      
   }
   System.out.println();
   // See if they are divisible by only 6
   System.out.println("Divisible by only 6");
   
   for(int i = 100; i <= 1000; i++) {
      if (i % 6 == 0) {
         System.out.print(i + " ");
         counter++;
         }
         if(counter==10) {
            System.out.println();
            counter = 0;
            }      
   }

  // Part 5 of HW
  
  	// Prompt the user to enter a 9 digit int
    	
  System.out.println();
  int min = 0;
  int max = 99999999;
  Scanner newinput = new Scanner(System.in);
  int newInput = 0;
  System.out.println("Please enter a positive integer");
  newInput = newinput.nextInt();
  // does first check to see if it is within range then calls reverse method
  if (newInput >= min && newInput <= max) {
  reverse(newInput);
  }
  // if input is negative or more, will repeat to prompt user to keep entering
  while (newInput < min || newInput > max) {
  
  System.out.println("Please enter a positive integer withat most nine decimal digits: ");
  newInput = newinput.nextInt();
  // then checks if it is compatable and prints the result if it is
  if (newInput >= min && newInput <= max) {
  reverse(newInput);
  // My program is treating zeros as like placeholders so it keeps them in storage and pulls them out during reverse method
  } 
  }
  
          
 }
 // create the custom reverse method for part 5 of hw
  public static void reverse (int newInput) {
  while (newInput > 0) {
  //Displays the results of the division
   System.out.println((newInput % 10));
      newInput /= 10;
  
  
  }
  }

 }       
         
         

