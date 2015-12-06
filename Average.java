import java.util.Scanner;
public class Average
{
   public static void main (String[] args)
   {
      int val1,val2,val3;
      double averange;
      Scanner scan = new Scanner (System.in); //Scanner scan is the type of the class
      System.out.println("Please enter three intergers and " + "I will complete their average");
      int total;
      val1 = scan.nextInt();
      val2 = scan.nextInt();
      val3 = scan.nextInt();


      total = (val1) + (val2) + (val3) /3;
      System.out.println(total);
       

   }

}