public class Homework4Part4 {

public static void main(String[] args) {

// Part 4 of HW 4
   // First see if they are divisible by both
   int counter=0;
   
   System.out.println("Divisible by both 5 and 6");
   
    for (int i=100;i<=1000; i++) {
        if(i % 5==0 && i % 6==0) {
            System.out.print(i +" ");
            counter++;
        }
        if (counter==10) {
            System.out.println();
            
            
            counter=0;
        }
           }
           System.out.println();
   // Then see if they are divisible by only 5
   System.out.println("Divisible by only 5");
   
   for(int i = 100; i <= 1000; i++) {
      if (i % 5 == 0) {
         System.out.print(i + " ");
         counter++;
         }
         if(counter==10) {
            System.out.println();
            
            counter = 0;
            }      
   }
   System.out.println();
   // See if they are divisible by only 6
   System.out.println("Divisible by only 6");
   
   for(int i = 100; i <= 1000; i++) {
      if (i % 6 == 0) {
         System.out.print(i + " ");
         counter++;
         }
         if(counter==10) {
            System.out.println();
            counter = 0;
            }      
   }
}
}