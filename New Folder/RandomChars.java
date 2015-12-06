import java.util.Scanner;
import java.util.Random;
public class RandomChars{

   public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   Random ran1 = new Random();
   Random ran2 = new Random();

   System.out.println("Enter a String");
   String input = scan.nextLine();
   int char1 = ran1.nextInt(input.length());
   int char2 = ran2.nextInt(input.length());
   System.out.print("could be: " + heinput.charAt(char1)+input.charAt(char2));
   
   
   
   
   }


}