import java.util.*;

public class RandomChars
{
   public static void main(String[] args)
   {
      Scanner scan  = new Scanner(System.in);
      System.out.println("Please enter a string: ");
      String text = scan.nextLine();
      int position1 = (int)(Math.random()*text.length());
      int position2 = (int)(Math.random()*text.length());
      System.out.println(""+text.charAt(position1) +" "+ text.charAt(position2));
   }
}   