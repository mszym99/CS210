// Matthew Szymanski
// Homework #2 Question #5

import java.util.Scanner; // Imports the java util scanner

// Creates a public class for the program
public class Homework2Question5 {

   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
   //Create a integer
   int userinput;
   // Prompt user to input a single hexadecimal number then scan it
   System.out.println("Input a single digit hexadecimal number: ");
   userinput = Integer.parseInt(input.nextLine(), 16);
   
   // Create an if statement to see if the person follows orders
   if(userinput <= 'f' && userinput >= 0) {
   
   // Compare and convert user input and display the binary conversion
   String binary = Integer.toBinaryString(userinput);
   System.out.println("The binary code value: " + binary);
         }
   else {
      System.out.println("You didnt follow directions");
      }
   
         
  

   
         }
      }