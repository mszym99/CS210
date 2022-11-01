// Matthew Szymanski 00894656
// Homework5 Part 4

public class Homework5Part4 {

   // Main
   public static void main(String[] args) {
      // Make array of 10 ints
      int count[] = new int[10];
      
      // Create and store the count of 100 random ints
      for (int i = 1; i <= 100; i++) {
         count[(int)(Math.random() * 10)]++;
      }
     
      // Display results
      System.out.println("Count for each int between 0 & 9: ");
      for (int i = 0; i < count.length; i++) {
         System.out.println(count[i] + " " + i + "s total.");
      }
      
   }
}
      