// Matthew Szymanski
// Homework #2 Question #4

import java.util.Scanner; // Imports the java util scanner

// Creates a public class for the program
public class Homework2Question4 {

   public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   
   // prompt user to enter non negative integer
   System.out.println("Please enter a nonnegative integer: ");
   
   int usernum = input.nextInt();
   // logic for the int that was input into program
   // checking if its following directions for being nonnegative
   if (usernum > 0) {
      System.out.println("You picked a good number.");
      }
   else {
      System.out.println("You picked a bad number..");
      }
   // inside the first if statement now we check if its divisible by 6 first
   if (usernum % 6 == 0) {
         System.out.println("Your number is divisible by 6.");
      } 
   else {
   // if the number is not divisible by 6 then we go to the else statement and it checks for 7
      if (usernum % 7 == 0) {
         System.out.println("Your number is divisible by 7.");
      } 
      // if the number cannot be divisible by both it will result in this final check to print out that it cant
      else {
         System.out.println("Your number is not divisible by 7 or 6.");  
      }
      }
         
 }
 }

