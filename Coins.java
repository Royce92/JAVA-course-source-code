import java.util.Scanner;
public class Coins{
   public static void main (String[] args){
   
   Scanner scan = new Scanner(System.in);
   int sum, quarters, dimes, nickels, cents, quater;
   System.out.println("Enter your total amount of cents ");
   sum = scan.nextInt();
   quarters = (sum)%(25);
   if (quarters == 0){
   quarters = (sum)/(25);
   }
   
   nickels = (quarters)%(5);
   if(nickel =)
   cents = (nickels)%(1);
   System.out.println("You enter "+sum+": You have "+quarters+" Quarters "+nickels+" Nickels "+" and  "+cents+" Cents");
   
   }


}