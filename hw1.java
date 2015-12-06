//public class hw1{
 //-----------------------------------------------------------------
 // Prints a presidential quote.
 //-----------------------------------------------------------------
 //public static void main (String[] args)
// {
// System.out.println ("A quote by Abraham Lincoln:");
// System.out.println ("Whatever you are, be a good one.");
// }
//}
import java.util.Scanner;

public class hw1{

   public static void main (String[] args)
   {
   /* 1. Write an application that reads three integers
     and prints their average. (Use a variable for each integer and set them to your
     own values; use a variable for the average as well)*/
      int val1,val2,val3; 
      double averange;
      Scanner scan = new Scanner (System.in); //Scanner scan is the type of the class
      System.out.println("Please enter three intergers and " + "I will complete their average: ");
      int total;
      val1 = scan.nextInt();
      val2 = scan.nextInt();
      val3 = scan.nextInt();
      
      total = (val1 + val2 + val3) /3;
      System.out.println(total);
       
   /*2. Create a version of the TempConverter
application to convert from Fahrenheit to Celsius. Use a variable for the
Fahrenheit temperature and set it to your own value.*/    
  
      float temp;
      Scanner in = new Scanner (System.in);
      System.out.print("Please enter the Temperature in Fereheit:");
      temp = in.nextInt();
      temp = (temp - 32) * 5/9;
      System.out.println("Temperature in Celsius: " + temp );


/*3. Write an application that asks user for the amount (eg. 3 quarters)
of the coins in a jar and prints the total in dollars and cents. Use variables
that represent the number of quarters, dimes, nickels, and pennies and set them
to values entered from the keyboard.*/

   double quarters, dimes, nickels, pennies;
   double sum;
   Scanner ex = new Scanner(System.in);
   System.out.println("Enter the amount of quarters");
   quarters = ex.nextInt();
   System.out.println("Enter the amount of dimes");
   dimes = ex.nextInt();
   System.out.println("Enter the amount of nickels");
   nickels = ex.nextInt();
   System.out.println("Enter the amount of pennies");
   pennies = ex.nextInt();
   quarters = quarters*25;
   dimes = dimes*10;
   nickels = nickels*5;
   pennies = pennies*1;
System.out.println(quarters + " "+dimes + " "+ nickels +" "+ pennies);
   sum = quarters + dimes + nickels + pennies;
   System.out.println("Your total is: $"+ sum / 100);
   


   }

}