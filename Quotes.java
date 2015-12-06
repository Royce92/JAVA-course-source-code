import java.util.Scanner;
public class Quotes{
   public static void main(String[] args)
   
   {
   
String first, last;
Scanner scan = new Scanner(System.in);
System.out.println("Enter 2 String parameters named");
first = scan.nextLine();
last = scan.nextLine();   

String result = (first+" "+last);
String value = "\""+result+"\"";
System.out.println(value);
   
   
   }

}