import java.util.Scanner;
import java.util.Random;
public class Rock
{
 public static void main(String[] args)
{
String personPlay; //User's play -- "R", "P", or "S"
String computerPlay=""; //Computer's play -- "R", "P", or "S"
int computerInt; //Randomly generated number used to determine
//computer's play
Scanner scan = new Scanner(System.in);
Random generator = new Random();
//Get player's play -- note that this is stored as a string
System.out.println("Enter a value: R, "P" or "S");
personPlay=scan.nextLine();
personPlay.toUpperCase();
//Make player's play uppercase for ease of comparison
//Generate computer's play (0,1,2)
computerInt = generator.nextInt(3);

//Translate computer's randomly generated play to string
switch (computerInt)
{
   Case 0: 
      computerPlay = "R";
      break;
   Case 1: 
      computerPlay = "P";
      break;
   Case 2: 
      computerPlay = "S";
      break;

}
//Print computer's play
//See who won. Use nested ifs instead of &&.
if (personPlay.equals(computerPlay))
{
   System.out.println("It's a tie!");
}
else if (personPlay.equals("R"))
{

   if (computerPlay.equals("S"))

      System.out.println("You win rock crushes Scissors");

   else
      System.out.println("you lose");
   }

else if (personaPlay.equals("P"))
{
   if(computerPlay.equals("S"))
   System.out.println("You lose. Scissor wins");
   else
      System.out.println("You win");
      
}



else if()
//... Fill in rest of code
}
}