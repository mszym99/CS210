import java.util.Scanner; // imports scanner util

public class Homework4Part2 {

public static void main(String[] args) {

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
  }
  }
         
