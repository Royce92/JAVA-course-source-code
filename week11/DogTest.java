// **************************************************************** 
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// **************************************************************** 
public class DogTest 
{
   public static void main(String[] args) 
   {
      Dog dog = new Dog("Spike");
      System.out.println(dog.getName() + " says " + dog.speak());
      
      Labrador d2 = new Labrador("Treat", "Gold");
      System.out.println(d2.getName() + " says " + d2.speak());

      Yorkshire d3 = new Yorkshire("D3");
      System.out.println(d3.getName() + " says " + d3.speak());

      System.out.println(Labrador.avgBreedWeight());                 
   }
} 