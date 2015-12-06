import java.util.Scanner;

public class Surface
{

   public static void main (String[] args)
   {
   

   Scanner scan = new Scanner(System.in);
   System.out.println("Enter the length: ");
   int length= scan.nextInt();
   System.out.println("Enter the width: ");
   int width = scan.nextInt();
   System.out.println("Enter the depth: ");
   int depth = scan.nextInt();
   int totalSurface = (length * width + length * depth + width * depth) * 2; 
   System.out.println("The total surface Area is : "+totalSurface);

   
   }



   }