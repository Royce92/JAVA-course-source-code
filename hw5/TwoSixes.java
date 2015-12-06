public class TwoSixes{

   public static void main (String [] args){
   
     Die	die1	= new	Die();
     Die die2	= new	Die();
   	 int counter	= 0;
   	 while(die1.getFaceValue()== 6 && die2.getFaceValue() == 6)
       {
   		die1.roll();
   		die2.roll();
   		counter ++;
         System.out.println("It took a total of "+Counter);
   }
   }


}