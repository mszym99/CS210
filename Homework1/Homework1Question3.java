// CS-210 FALL 2020 11am Section
// Student: Matthew Szymanski.
// HW #1 Question Number 3


// Creates a public class for the program
public class Homework1Question3 {

   public static void main(String[] args) {
   
   // Starting part 3 of Homework 
      // Fahrenheit = (9/5) * Celsius + 32
      // Defining variables as doubles
      double celsius;
      double degrees;
      
      // Giving these value
      celsius = 0;
      degrees = (9/5) * celsius + 32;
      System.out.println("0 degrees celsius is equal to: " + degrees + " fahrenheiht.");  
      
      // changing celsius value double to 18
      celsius = 18;
      degrees = (9/5) * celsius + 32;
      System.out.println("18 degrees celsius is equal to: " + degrees + " fahrenheiht.");  
      
      // changing celsius value again
      celsius = 36;
      degrees = (9/5) * celsius + 32;
      System.out.println("36 degrees celsius is equal to: " + degrees + " fahrenheiht.");  
      
      // changing celsius value again
      celsius = -12.5;
      degrees = (9/5) * celsius + 32;
      System.out.println("-12.5 degrees celsius is equal to: " + degrees + " fahrenheiht.");  
      
      // changing celsius value again
      celsius = -40;
      degrees = (9/5) * celsius + 32;
      System.out.println("-40 degrees celsius is equal to: " + degrees + " fahrenheiht.");  
      System.out.println(" ");
}
}