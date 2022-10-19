// CS-210 FALL 2020 11am Section
// Student: Matthew Szymanski.
// HW #1 Question Number 5

import java.util.Scanner; //imports the scanner

// Creates a public class for the program
public class Homework1Question5 {

   public static void main(String[] args) {
   
   // Creating a new scanner for part 5 of Homework #1
      Scanner input = new Scanner(System.in);
      
      // Prompts the user for the cost of their meal without tax.
      System.out.println("What was the cost of your meal? Please enter cost: ");
      double cost = input.nextDouble();
      
      // Prompts the user for tip
      System.out.println(" Please tip 10% - 20% for hospitality. Thank you!");
      double tippercent = input.nextDouble();
      
      // Math for the tiptotal multiplying by 0.1  at the end to convert tippercent double to a decimal
      double tiptotal = cost * tippercent * 0.01;
      
      // Creates double for total and completes math to complete the complete total
      double total;
      total = tiptotal + cost;
      // Print the outcome of all the converstions * 100.00 and / 100.00 to print to the nearest 2 decimals rounded
      System.out.println(" Total cost is: " + Math.round(total * 100.00) / 100.00);
      
}

}