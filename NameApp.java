import java.util.Scanner;
import java.util.Random;
public class NameApp{

public static void main(String[] args){


Random ran = new Random();
int random = ran.nextInt(90)+10;
String first, Last;
Scanner scan = new Scanner(System.in);
System.out.println("Enter your First and Last Name: ");
first = scan.nextLine();
String firstup = first.toUpperCase();
Last = scan.nextLine();
System.out.println(firstup.substring(0,1)+(Last.substring(0,5)+random));
}

}