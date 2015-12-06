import java.util.Scanner;
public class cutString{

   public static void main(String [] args){
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter a String: ");
   String original = scan.nextLine();
   int length = (original.length())-1; 
   String ori1 = original.substring(1,length);
   System.out.println(ori1);
   
   
   
   
   }



}