import java.util.Scanner;
public class FlipRace {
   public static void main(String [] args)
   {
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter a Monetary value: ");
   int one = scan.nextInt();
   System.out.println("Enter a Monetary value for second coin: ");
   int two = scan.nextInt();;
   MonetaryCoin coin1 = new MonetaryCoin("head", one);
   MonetaryCoin coin2 = new MonetaryCoin("head", two);
   
   
   System.out.println(coin1.flip());
   System.out.println(coin2.flip());


int x=0;
int y=0;
while(x !=3 && y!=3){
   if (coin1.flip()== "Head")
      x++;
   else
      x = 0;      

   if (coin2.flip()== "Head")
      y++;
   else
      x = 0;     
}
  if (x == 3)
  System.out.println("coin1 won!");
  else if (x ==y)
  System.out.println("Its a Tie!");
  else
  System.out.println("coin2 won!");

  
 
      
   
   }

}