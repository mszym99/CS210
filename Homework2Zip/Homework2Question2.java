// Matthew Szymanski
// Homework #2 Question #2

import java.util.Scanner; // Imports the java util scanner

// Creates a public class for the program
public class Homework2Question2 {

   public static void main(String[] args) {
   
   // Creating a new scanner for part 2 of Homework #2
      Scanner input = new Scanner(System.in);
      
      System.out.println("Please enter a 3 digit positive integer: ");
      int number = input.nextInt();
      // explaining the ranges of this integer
      if (number < 100 || number > 999) {
         System.out.println("You didnt follow directions");
         }
         else {
            int left;
            int right;
            // define what the left and right are
            left = number / 100;
            right = number % 10;
            
            // Another if else logic to determine if its a palindrome or not
            if (left == right) {
               System.out.println(number + " is a palindrome.");
               }
            else {
               System.out.println(number + " isnt a palindrome.");
               }
            }
      }
  }