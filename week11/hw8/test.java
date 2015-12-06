public class test{

public static void main(String[] args){


   int counter = 0;
   int sum = 0;
   for( int i=0; i <25; i++){
      MonetaryCoin coin = new MonetaryCoin(i);
      if(coin.isHeads())
      {}
      else{
         counter++;
         sum += coin.getValue();
         
      }
   }
      
    System.out.println("average monetary value of all coins with TAILS face was: "+(sum/counter));

}



}