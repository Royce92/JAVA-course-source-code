// **************************************************
// StringPlay.java
//
// Play with String objects
// **************************************************
import java.util.Random;
public class StringPlay
{
public static void main (String[] args)
{
String college = new String ("PoDunk College");
String town = new String("Any town, USA");// part (a)
int stringLength;
String change1, change2, change3;
stringLength = college.length(); // part (b)
System.out.println (college + " contains " + stringLength + " characters.");
change1 = college.toUpperCase(); // part (c)

change2 =change1.replace("()","*"); // part (d)
change3 = college.concat(town); // part (e)
System.out.println ("The final string is " + change3);
String s1 = new String ("Hello");
String s2 = new String ("Hello");
System.out.println(s1.equals(s2)); 
System.out.println(s1.compareTo(s2));


Random generator = new Random();
int diceOne;
int diceTwo;
diceOne = generator.nextInt(6)+1; 
diceTwo = generator.nextInt(6)+1; 
System.out.println("Diceone: "+ diceOne + " Dicetwo: "+ diceTwo+ " TheSum is: " + (diceOne+diceTwo));

}
}