// Matthew Szymanski 00894656
// Homework5 Part 5

// Import scanner util
import java.util.Scanner;
// Import Array util to help with sorting user inputs of integers
import java.util.Arrays;


public class Homework5Part5 {
// This returns the new array
   public static int removeDuplicates(int arr[], int n) {
      if (n == 0 || n == 1) 
         return n;
      
          // Start to move the ints
      int j = 0; 
      for (int i = 0; i < n-1; i++)  
         if (arr[i] != arr[i+1]) 
            // Replaces new
            arr[j++] = arr[i];
            arr[j++] = arr[n-1];
         
      
      return j;
   }

   public static void main(String[] args) {
   
   int arr[] = new int[25];
   
   // Take user input of single digit ints
   System.out.println("Enter single digit integers. Upon entering a negative num, program will end. Enter: ");
   Scanner input = new Scanner(System.in);
   
   // For loop to check the max amount for the arr
   for (int i = 0; i < 25; i++) {
      int number = input.nextInt();
      // If number is less than 0 it ends the program because its negative
      if (number < 0) {
         break;
      }
      // Array spot i is equal to number entry i
      arr[i] = number;
      // Calling the array utility to sort 
      Arrays.sort(arr);
      }
      int n = arr.length;
      n = removeDuplicates(arr, n);
      
      // Print the updated arr
      for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
      }
   }
      
}      
      