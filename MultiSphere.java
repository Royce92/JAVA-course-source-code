import java.util.Scanner;

public class MultiSphere
{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the diameter ");
        int diameter = scan.nextInt();

            Sphere mySphere = new Sphere(diameter);
            Sphere sp = new Sphere(diameter);


            System.out.println("You enter: "+ diameter);

            System.out.println("First:\t"+diameter);

            mySphere.setDiameter(diameter);
            sp.setDiameter(diameter*2);

            System.out.println("First"+mySphere+"\n");
            System.out.println("Second"+sp);
            }
                   }
    
