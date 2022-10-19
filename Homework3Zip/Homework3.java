import java.util.Scanner;

public class Homework3 {

// Create a seperate method of boolean to determine prime num for part three of homework where the program prints 8 prime nums per line
public static boolean Prime(int n) {
if (n > 2 && (n & 1) == 0) {
   return false; }
   for (int i = 3; i * i <= n; i += 2)
      if (n % i == 0)
         return false;
         return true;
         }

public static void main(String[] args) {
Scanner input = new Scanner(System.in);



// Homework Part 1
// Prompt the user to enter a year and the first three letters of a specific month ie Mar Jun Jul

System.out.println("Enter a year between the years 1900-2100: ");
int year = input.nextInt();


// Prompt the user to enter a month now

System.out.println("Now enter your month in 3 letters: ");
String month = input.next();

// Test the year for a leap year now
boolean leapYear = ((year % 100 == 0) && (year % 4 != 0)) || (year % 400 == 0);

if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec"))
{ System.out.println(month + " " + year + " has ");
System.out.println(31 + " days"); }

else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov"))
{ System.out.println(month + " " + year + " has ");
System.out.println(30 + " days"); }

else {
System.out.println(month + " is not a proper month"); }


// Homework Part 2

// Prompt user to enter three cities
System.out.println("Enter first city: ");
String c1 = input.nextLine();
System.out.println("Enter second city: ");
String c2 = input.nextLine();
System.out.println("Enter three city: ");
String c3 = input.nextLine();

// Create temp city string
String temp;
if ((c2.compareTo(c1) < 0) && (c2.compareTo(c3) < 0))
{
   temp = c1;
   c1 = c2;
   c2 = temp;
}
else if ((c3.compareTo(c1) < 0) && (c3.compareTo(c2) < 0))
{
   temp = c1;
   c1 = c3;
   c3 = temp;
}
else if (c3.compareTo(c2) < 0)
{
   temp = c2;
   c2 = c3;
   c3 = temp;
}

// Display cities with ascending order
System.out.println("The cities in alphabetical order are " + c1 + ", " + c2 + ", " + c3);


// Part 3

// Define variables and counters to make sure when counters hit 8 they reset
int counter = 0;
String primeNum = "";
// Set range
for (int i = 1; i < 1000; i++) {
// Call up to the boolean  method of Prime
   if (Prime(i) == true) {
      System.out.print(i + " ");
      primeNum = " ";
      counter++;
      if (counter == 8) {
         System.out.println();
         counter = 0;
         primeNum = "";
        }
     }
 }



// Part 4
System.out.println("\n");
System.out.println("Please enter a string: ");
String string = input.nextLine();

// Define varaibles
int vowel = 0;

// Count the number of vowels
for (int i = 0; i < string.length(); i++) {
   if (Character.isLetter(string.charAt(i))) {
      if (Character.toUpperCase(string.charAt(i)) == 'A' || Character.toUpperCase(string.charAt(i)) == 'E' || Character.toUpperCase(string.charAt(i)) == 'I' || Character.toUpperCase(string.charAt(i)) == 'O' || Character.toUpperCase(string.charAt(i)) == 'U') {
         vowel++;
         // Displays outcome  
         System.out.println("The number of vowels are: " + vowel);
  
       }  

}
}

// Part 5

// Prompt user to enter string
System.out.println("Please enter a string at least 10 characters long: ");

// Identify what variables are being used for strings
Scanner newnew = new Scanner(System.in);
String str = newnew.nextLine();
String reverse = "";
// Time to reverse the inputted string
for (int i = str.length() - 1; i >= 0; i--) {
   reverse = reverse + str.charAt(i);
   }
System.out.println("Reveresed string is: " + reverse);


}
}