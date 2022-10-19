// MAtthew Szymanski
// Homework #2 Question #1

import java.util.Scanner; // Imports the java util scanner

// Creates a public class for the program
public class Homework2Question1 {

   public static void main(String[] args) {
   
   // Creating a new scanner for part 1 of Homework #2
      Scanner input = new Scanner(System.in);
      
   // Prompts the user for weight
   System.out.println("What is your weight in lbs?");
   double weight = input.nextDouble();
   
   // Prompts the user for height
   System.out.println("What is your height in inches?");
   double height = input.nextDouble();
   
   // Converting values of the doubles just entered
   double weightKilo = weight * 0.45359;
   double heightMeters = height * 0.0254;
   
   // Prints the converted values
   System.out.println("Your weight in kilograms is: " + weightKilo);
   System.out.println("Your height in meters is: " + heightMeters);
   
   // Define and do calculations for BMI
   double bmiCalculator = weightKilo / Math.pow(heightMeters, 2);
   
   System.out.println("Your BMI is: " + bmiCalculator);
   }
   }
   