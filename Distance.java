// ************************************************************
// Distance.java
//
// Computes the distance between two points
// ************************************************************
import java.util.Scanner;
public class Distance
{
public static void main (String[] args)
{
double x1, y1, x2, y2; // coordinates of two points
double distance; // distance between the points
Scanner scan = new Scanner(System.in);
// Read in the two points

System.out.println("Enter your name");
String first = scan.nextLine();
String last = scan.nextLine();
first = first = first.toUpperCase();
last = last = last.toUpperCase();
System.out.print ("Enter the coordinates of the first point " +
"(put a space between them): ");
x1 = scan.nextDouble();
y1 = scan.nextDouble();
System.out.print ("Enter the coordinates of the second point: ");
x2 = scan.nextDouble();
y2 = scan.nextDouble();
distance = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)); 
System.out.println(distance);
System.out.println(first.charAt(0)+ " "+ (last.charAt(0)));
// Compute the distance
// Print out the answer
}
}