import java.util.Scanner;
// Matthew Szymanski 00894656
// Imports scanner

public class Homework5Part2 {

   public static void main(String[] args) {
      // Create scanner
      Scanner input = new Scanner(System.in);
      // Now Prompt the user to enter n
      System.out.print("Enter n: ");
      int n = input.nextInt();
      
      if (n <= 20 && n >= 1) {
         printMatrix(n);
      }
      else {
         System.out.print("Please enter a number between 1-20 next time. Thanks!");
      }
   }
   
   // Create Matrix method
   public static void printMatrix(int n) {
      for (int rows = 0; rows < n; rows++) {
         for (int columns = 0; columns < n; columns++) {
            // Create a random number0,1,2
            System.out.print((int)(Math.random() * 3));
         }
         System.out.println();
      }
   }
}      