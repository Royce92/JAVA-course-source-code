import java.util.*;

public class CoinAPP
{
   public static void main(String[] args)
   {
      Scanner scan  = new Scanner(System.in);
      System.out.println("Please enter a integer: ");
      int amount = scan.nextInt();
      
      int q = amount / 25;
      amount = amount % 25; 
      int d = amount / 10;
      amount = amount % 10;
      int n = amount / 5;
      amount = amount % 5;
      
      System.out.println("quarter: "+q+ ""+d+n+amount);
      
   }
}