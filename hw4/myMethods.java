
public class myMethods
{


		public int Surface(int length, int depth, int width)
	{
		return (2* length * width) + (2 *length * depth) + (2*width * depth);
	}

		public double rightTriangle(double SideA, double hypotenuseB)
		{
			return Math.sqrt((hypotenuseB * hypotenuseB) + (SideA * SideA));
		}
	
		

		public String cutString(String original)
		{
			return original.substring(1,original.length()-1);
		}
	
		
	}
//********************************************************************
//  Die.java       
//
//********************************************************************

public class Die
{
   private final int MAX = 6;  // maximum face value

   private int faceValue;  // current value showing on the die

   private String color;
   //-----------------------------------------------------------------
   //  Constructor: sets the initial face value.
   //-----------------------------------------------------------------
   public Die()
   {
      faceValue = 1;
   }

   	public void setColor(String color)
   	{
   		this.color = color;
   	}
   	
   	public String getColor()
   	{
   		return color;
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
   
   public String comboDie(Die A, Die B)
   {
	   return A.getColor() + "-" + B.getColor() + " FaceValue=" + ((A.getFaceValue() + B.getFaceValue())/2); 
   }
}

import java.util.*;
public class RealTestPairOfDice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a FaceValue for Dice one: ");
		int faceValue1 = scan.nextInt();
		System.out.println("Give me another FaceValue for Dice two: ");
		int faceValue2 = scan.nextInt();
		
		System.out.println("Give me a color for Dice one: ");
		String color1 = scan.next();
		System.out.println("Give me another color for Dice two: ");
		String color2 = scan.next();
		
		PairOfDice1 test = new PairOfDice1();
		PairOfDice1 test1 = new PairOfDice1();
		
		test.setfaceValue(faceValue1);
		test1.setfaceValue(faceValue2);
		
		test.setColor(color1);
		test1.setColor(color2);
		
		System.out.println(test.getfaceValue() * test1.getfaceValue() + " " + test.getColor().substring(0,1) + test1.getColor().substring(0,1));
		
		
		
		
		
		
		
		

	}

}



