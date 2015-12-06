// ***************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ***************************************************************
import java.util.Scanner;
public class Sales
{
   public static void main(String[] args)
{
   final int SALESPEOPLE = 5;
   int[] sales = new int[SALESPEOPLE];
   int sum;
   Scanner scan = new Scanner(System.in);
   for (int i=0; i<sales.length; i++)
 {
      System.out.print("Enter sales for salesperson " + i + ": ");
      sales[i] = scan.nextInt();
 }
 
    
    System.out.println("\nSalesperson Sales");
    System.out.println(" ------------------ ");
    sum = 0;
    int max_sales = 0;
    int max_id =0;
    int min_sales = sales[0];
    int min_id=0;
    for (int i=0; i<sales.length; i++)
 {
      System.out.println(" " + i + " " + sales[i]);
      sum += sales[i];
      if(sales[i] > max_sales){
      max_sales=sales[i];
      max_id = i;
      
      }
      if(min_sales[i] < min_sales){
      
      min_sales = sales[i];
      min_id = i;
      
      }
      
      
 }
System.out.println("\nTotal sales: " + sum);
System.out.println("\nAverage sales: " + sum/5);
System.out.println("\nSalesperson: " +max_id+ " had the highest sales with "+ max_sales);
System.out.println("\nSalesperson: " +min_id+ " had the highest sales with "+ min_sales);

System.out.println("Please enter a target sales");
int target_value = scan.nextInt();
int count = 0;
for(int i =1; i <sales.length; i++)
{
if (sales[i]> target.value)
{
   System.out.println("\nSalesperson: " +i+ " has"+ sales[i]+ "which exceed the target");
   counter++;


}

   System.out.println("There are "+ count + "that exceeded the sales target");

}



}
}