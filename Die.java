//********************************************************************
//  Die.java       
//
//********************************************************************

public class Die
{
   private final int MAX = 6;  // maximum face value
   
   private String color;

   private int faceValue;  // current value showing on the die



   //-----------------------------------------------------------------
   //  Constructor: sets the initial face value.
   //-----------------------------------------------------------------
   public Die()
   {
      faceValue = 1;
   }

   //-----------------------------------------------------------------
   //  Rolls the die and returns the result.
   //-----------------------------------------------------------------
   public int roll()
   {
      faceValue = (int) (Math.random() * MAX) + 1;

      return faceValue;
   }

   //-----------------------------------------------------------------
   //  Face value mutator.
   //-----------------------------------------------------------------
   public void setFaceValue(int value)
   {
      faceValue = value;
   }

   //-----------------------------------------------------------------
   //  Face value accessor.
   //-----------------------------------------------------------------
   public int getFaceValue()
   {
      return faceValue;
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of this die.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = Integer.toString(faceValue);
      //String result="This die has face value "+faceValue;

      return result;
   }
   
   //equals method returs true if 2 dice have same face value
   //and false otherwise
   public boolean equals(Die other)
   {
      return this.faceValue==other.getFaceValue();
    }
    
    
   public void setcolor(String color)
   {
      this.color = color;
   }
   public String getcolor()
   {
      return this.color; 
   }
   

   public int comboDie(die); 


   public String PairOfDice(dice1 otherdice);
   
   //compareTo returns -1,0,1 if first die object has a face value
   //less then, equal to, bigger than (respectively)the face value of 
   //other die object
   public int compareTo(Die other)
   {
      if (this.faceValue < other.getFaceValue())
         return -1;
      else if (this.faceValue==other.getFaceValue())
         return 0;
      else
         return 1;
     }
   
}
