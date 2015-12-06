/*
DEFINE A METHOD         

*/

   public int DieGame(Die die1, Die die2){
   
    int counter = 0;
    while(die1.getFaceValue()!= die2.getFaceValue()){
      die1.roll();
      die2.roll();
      counter ++;

    return "It took "+ counter + "for both dice to be equal";

   }

}
/*Creating an array read chapter 8W
int [] scores = new int [10]
Score [0]= 79;
Scores.length

for (int i=0; < Score.length; i++)

for(int score : scores)
   system.out.println()scio
   
public class Test;   
   
public static int oddValues(int[] a){
   int count = 0
   for (int i =0; i<a.length;i++)
      if (a[i])%2 ==1)
         count++;
   return count;
   public static void  main (String[] args)
   {
   int [] myArray = new int [30];
   for (int i = 0; i<myArray.length; i++)
      myArray[i]=(int)(Math.random()*6+1);
      System.out.println(oddValues(myArray));
   }
   }
   
   
   
   }
]   


}

   



*/ 