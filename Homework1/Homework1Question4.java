// CS-210 FALL 2020 11am Section
// Student: Matthew Szymanski.
// HW #1 Question Number 4

import java.util.Scanner; //imports the scanner

// Creates a public class for the program
public class Homework1Question4 {

   public static void main(String[] args) {
   
   // Creating a new scanner for part 4 of Homework #1
      Scanner input = new Scanner(System.in);
      
   // Starting part 4
      // Identifying the variables as next input
      System.out.println("Input a radius of a circle as a double: ");
      double radius = input.nextDouble();

      System.out.println("Input a height of a circle as a double: ");
      double height2 = input.nextDouble();
      
      // Gives a fresh line for organization purposes
      System.out.println(" ");
      
      // Naming as doubles
      double pi;
      double area2;
      double volume;
      
      // Identifying what pi is
      pi = 3.14159;
      
      // What the area is
      area2 = radius * radius * pi;
      
      // What volume is
      volume = area2 * height2;
      
      // System prints and rounds the math equations out
      System.out.println("The area of the inputed values is: " + Math.round(area2 * 100.00) / 100.00);
      System.out.println("The volume of the inputed values is: " + Math.round(volume * 100.00) / 100.00);
      
}
}