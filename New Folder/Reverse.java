import java.util.Scanner;

public class Reverse{
   public static void main(String [] args){

Scanner scan = new Scanner(System.in);
System.out.println("Enter the size of the array");
int size = scan.nextInt();
int[] s = new int[size];

for (int i = 0;  i < s.length; i++){
   s[i] = i;
System.out.println(s[i]);



}


for(int i = 0; i < s.length / 2; i++){
   s[i] = i;
System.out.println(s[i]);

}

}
}