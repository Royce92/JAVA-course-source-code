import java.util.Scanner;

public class rightTriangle
{
   public static void main(String [] args)
   {
   
   double sideA,sideB,sideC; 
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter Side A: ");
   sideA = scan.nextInt();
   System.out.println("Enter Side B: ");
   sideB = scan.nextInt();
   sideC =(sideA*sideA)+(sideB*sideB);
   double sidec = Math.sqrt(sideC);
   System.out.println("Side C: =  "+sidec);

   
   
   }



}