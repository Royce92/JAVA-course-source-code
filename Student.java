// *********************************************
***************
// Student.java
//
// Define a student class that stores name, score on test 1, and
// score on test 2. Methods prompt for and read in grades,
// compute the average, and return a string containing student's info.
// ************************************************************
import java.util.Scanner;
public class Student
{
//declare instance data
private String name;
private double test1, test2;
// ---------------------------------------------
//constructor
// ---------------------------------------------
public Student(String studentName)
{
name = studentName;//add body of constructor
}
// ---------------------------------------------
//inputGrades: prompt for and read in student's grades for test1 and test2.
//Use name in prompts, e.g., "Enter's Joe's score for test1".
// ---------------------------------------------
public void inputGrades()
{
Scanner scan = new Scanner(System.in);
  System.out.println("Enter's Joe's score for test1");
  test1 = scan.nextInt();
  test2 = scan.nextInt();


//add body of inputGrades
}
// ---------------------------------------------
//getAverage: compute and return the student's test average
// ---------------------------------------------
//add header for getAverage

public double getAverage(){
return getAverage = (test1 + test2) / (2);
}
  //add body of getAverage

// ---------------------------------------------
//getName: print the student's name

public String getName(){
return ;
}
// ---------------------------------------------
//add header for printName

public void printName(){
System.out.println(printName);

}
//add body of printName
}
