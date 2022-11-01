import java.util.Scanner; // imports scanner util

public class Homework4Part3 {

public static void main(String[] args) {

// Part 3 of HW 4
   Scanner numHexScan = new Scanner(System.in);
 // user prompt to enter a hexidecimal number
   System.out.println("Enter any hexadecimal num: ");
   String hexNum = numHexScan.nextLine();
   
   // Then parse it into a decimal equivelent
   
   int num = Integer.parseInt(hexNum, 16);
   
   // Display results
   
   System.out.println("Your decimal equivelent is: " + num);
}
}