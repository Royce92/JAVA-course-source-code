import java.util.Scanner;
public class Triple {

public static void main(String[] args){


Scanner scan = new Scanner(System.in);
System.out.println(" enter one string parameter named alpha");
String parameter = scan.nextLine();
String trip = parameter.substring(0,1);
String triple = (trip+trip+trip);
System.out.println("Your alpha is "+ triple);
} 

}