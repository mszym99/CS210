import java.util.Scanner; // imports scanner util

public class Homework4Part5 {

public static void main(String[] args) {

// Part 5 of HW
  
  	// Prompt the user to enter a 9 digit int
    	
  System.out.println();
  int min = 0;
  int max = 99999999;
  Scanner newinput = new Scanner(System.in);
  int newInput = 0;
  System.out.println("Please enter a positive integer");
  newInput = newinput.nextInt();
  // does first check to see if it is within range then calls reverse method
  if (newInput >= min && newInput <= max) {
  reverse(newInput);
  }
  // if input is negative or more, will repeat to prompt user to keep entering
  while (newInput < min || newInput > max) {
  
  System.out.println("Please enter a positive integer withat most nine decimal digits: ");
  newInput = newinput.nextInt();
  // then checks if it is compatable and prints the result if it is
  if (newInput >= min && newInput <= max) {
  reverse(newInput);
  // My program is treating zeros as like placeholders so it keeps them in storage and pulls them out during reverse method
  } 
  }
  
}
// create the custom reverse method for part 5 of hw
  public static void reverse (int newInput) {
  while (newInput > 0) {
  //Displays the results of the division
   System.out.println((newInput % 10));
      newInput /= 10;
  
  
  }
  }

}