public class TestPairOfDice{

   public static void main(String []args){
   int average;
   int die1, die2;
   
   Die die1 = new Die();
   Die die2 = new Die();
   die1.roll();
   die2.roll();
   die1.setcolor("Red");
   die2.setcolor("Blue");
   
   comboDie(die1, die2);

   }
   
  public Die comboDie(Die die1, Die die2)
   {
 Die die = new Die();
 int average = (die1.faceValue+die2.faceValue)/2;
 die.faceValue = average;
 string color = (die1 color)-(die2 color);
 die.color = color;
  }
   
}

