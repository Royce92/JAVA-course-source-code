public class TestStudent
{
   public static void main(String[] args)
   {
      Student s1 = new Student(21, "123456789");
      Student s2 = new Student(19, "987654321");
      Student younger = s1.findYoungest(s2);
      System.out.println(younger);    
   }
  
  
  
  
   
   public int[] summit(int[] gamma, int[] delta)
   {
      int[] result;
      if(gamma.length==delta.length){
         result = new int[gamma.length];
         for(int i=0; i<gamma.length; ++i)
         {
            result[i] = gamma[i] + delta[i];
         }
         
      }else if(gamma.length<delta.length){
         result = new int[gamma.length];
         for(int i=0; i<gamma.length; ++i)
         {
            result[i] = 5;
         }         
      }else{
         result = new int[delta.length];
         for(int i=0; i<delta.length; ++i)
         {
            result[i] = 5;
         }  
      }
      return result;
   }
}