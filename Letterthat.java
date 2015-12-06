import java.util.Scanner;
public class Letterthat{

public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter a word of 2 letters: ");
String word = scan.nextLine();
String alphabet = "abcdefghijklmnopqrstuvwxyz";

String  letter1 = word.substring(0,1);
String  letter2 = word.substring(1,2);
int compare = letter2.compareTo(letter1);
int possition  = (compare)/(2);  
System.out.println(alphabet.charAt(possition));
}

}