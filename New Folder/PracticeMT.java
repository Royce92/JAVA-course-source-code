import java.util.Scanner;
public class CoinApp
{

   public static void main (String[] args){

      double quarters, dimes, nickels, pennies;
      int cents;
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the amount of Cents less than 100");
      cents = scan.nextInt();
      int Quarter_remainder = (int)Math.floor(cents/25);
      System.out.println("quarters "+ Quarter_remainder);
      int Dime_remainder = (int)Math.floor(cents/10);
      int Nickel_remainder = (int)Math.floor(cents/5);
      int Penny_remainder = (int)Math.floor(cents/1);
      int counterQ = 0;
      int counterD = 0;
      int counterN = 0;
      int counterP = 0;
         if (Quarter_remainder != 0 && cents >= 25)
            {
            counterQ = Quarter_remainder;          
            cents = (cents - Quarter_remainder*25);
            System.out.println(cents);

            }
         if (Dime_remainder != 0 && cents >= 10 && cents < 10)
            {
            counterD = Dime_remainder; 
            cents = (cents - Dime_remainder*10); 
            }
         if (Nickel_remainder != 0 && cents >= 5 && cents <=10)
            {
            counterN = Nickel_remainder;  
            cents = (cents - Nickel_remainder*5); 
            System.out.println(cents);
            }
         if (Penny_remainder != 0 && cents >=1 || Penny_remainder <= 4)
            {
            counterP = Penny_remainder;
            cents = (cents - Penny_remainder*1); 
            System.out.println(cents);
   
            }
      

      System.out.println("You have: "+counterQ+" Quaters "+counterD+" Dimes "+ counterN+" Nickles "+"and "+counterP+" Pennies");

   
   }




}