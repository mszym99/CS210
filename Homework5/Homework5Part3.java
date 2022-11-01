// Matthew Szymanski 00894656
// Homework5 Part 3
// Import Java util
import java.util.Scanner;

public class Homework5Part3 {
   public static void main(String[] args) {
     
          
      // Create the ints for storing the scores and averages into an array that we can pull from
      int scores[] = new int[100];
      int count = 0;
      int total = 0;
      
      // Give user a chance to enter an int or have 0 be an exit
      Scanner input = new Scanner(System.in);
      System.out.println("Enter scores, this process ends if the input is negative.");
            
      for (int i = 0; i < 100; i++) {
         int number = input.nextInt();
         if (number < 0) {
         break;
         }
         // If num is not neg it is put into scores[]
         scores[i] = number;
         // Then total number gets added to by the number entered
         total += number;
         // Number gets +1 per entry
         count++;
      }
      // Determines average
      total /= count;
      
      // Create record of entrys above and below arithmetic average
      int aboveAverage = 0;
      int belowAverage = 0;
      
      // Count the records that are above and below
      for (int i = 0; i < count; i++) {
         if (scores[i] >= total) {
            aboveAverage++;
         }
         else {
            belowAverage++;
         }
      }
      
      // Now display the final records
      
      System.out.println("The number of scores above the average is " + aboveAverage);
      System.out.println("The number of scores below the average is " + belowAverage);
      System.out.println("The average score was " + total);

      
      
}    
}

