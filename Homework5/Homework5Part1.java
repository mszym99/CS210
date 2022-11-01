
// Matthew Szymanski 00894656
// Homework 5 Part 1
// Creates a public class for the program
public class Homework5Part1 {

   // This is main method right here
   public static void main(String[] args) {
   // Print the ten characters per line from ch1 to ch2
   // This is declaring the number of characters per line
   final int numPerLine = 10;
   // Establishing starting and ending bounds
   char ch1 = '1';
   char ch2 = 'Z';
   
   printChars(ch1, ch2, numPerLine);
   System.out.println();
   }
   // Create the method that prints characters ch1 and ch2 with 10 chars per line and that is seperated by exactly one space
   public static void printChars (char ch1, char ch2, int numPerLine) {
      for (char c = ch1, count = 1; c <= ch2; c++, count++) {
         if (count % numPerLine == 0) 
            System.out.println(c);
         else 
            System.out.print(c + " ");
         
      }
   }
}