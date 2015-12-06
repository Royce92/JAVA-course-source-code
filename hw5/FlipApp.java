import java.util.Scanner;
public class FlipApp 
{
   public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Enter a monetary value: ");
   int one = scan.nextInt();
   int two = scan.nextInt();

   
   MonetaryCoin coin1 = new MonetaryCoin("head", one);
   MonetaryCoin coin2 = new MonetaryCoin("head", two);
   int counter = 0;
   for (int num=1; num <=100; num++){
   
   coin1.flip();
   coin2.flip();
   if(coin1.getFace()==coin2.getFace())
   counter++;
   
   
   
   }
   
   System.out.println("The total number of ties was: "+counter);
     
   }





}