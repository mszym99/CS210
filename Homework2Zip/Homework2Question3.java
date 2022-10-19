// Matthew Szymanski
// Homework #2 Question #3

import java.util.Scanner; // Imports the java util scanner
import java.util.Random; // Imports random util
// Creates a public class for the program
public class Homework2Question3 {

   public static void main(String[] args) {
   
   
   // Creating a new scanner for part 3 of Homework #2
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter 0, 1, or 2");
      int number = input.nextInt();
      
      // Create a random number gen
      Random random = new Random();
      
      // 0 is scissors, 1 is rock and 2 is paper
      
      // Computer then picks a random number between 0 and 2
      int computersNumber = random.nextInt(3);
      // Now if else checks through all possibilities
      if (computersNumber == 0 && number == 0) {
         System.out.println("You tied with scissors!");
         }
      else if (computersNumber == 0 && number == 1) {
         System.out.println("You win rock beats scissors!");
         }
      else if (computersNumber == 0 && number == 2) {
         System.out.println("You lose scissors beats paper!");
         }
      else if (computersNumber == 1 && number == 1) {
         System.out.println("You tied with rock!");
         }
      else if (computersNumber == 1 && number == 0) {
         System.out.println("You lose rock beats scissors!");
         }       
      else if (computersNumber == 1 && number == 2) {
         System.out.println("You win paper beats rock!");
         }
      else if (computersNumber == 2 && number == 2) {
         System.out.println("You tied with paper!");
         }  
      else if (computersNumber == 2 && number == 1) {
         System.out.println("You lose paper beats rock!");
         }   
      else if (computersNumber == 2 && number == 0) {
         System.out.println("You win scissors beat paper!");
         } 
         }
         }