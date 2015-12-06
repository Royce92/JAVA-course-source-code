/*  
1:b
2:c
3:a
4:c
5:a
6:d
7:a
8:c
9:a
10:c
11:b
12:c
13:e
14:d
15:d









 */


public class Student{

   private int age;
   private String SID;



   public Student(int age, String SID)
   {
   this.age = age;
   this.SID = SID;
   
   
   } 
   public void setAge(int value)
   {
      this.age = value;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public void setSID(String value)
   {
      this.SID = value; 
   
   }
   public String getSID()
   {
      return SID;
   }
   public String toString()
   {
   
   return (age+ "years old" + " "+ "sid="+SID);
   
   
   }
   public boolean equals(Student s)
   {
      if( (this.age==s.age) && (this.SID.equals(s.getSID())) ){ return true; }
      else{ return false; }  
   }
   
   static Student findYoungest(Student[] students){
      Student min_s = students[0];
      for(int i=0; i<students.length; i++){
         if(min_s.age > students[i].age){
            min_s = students[i];
         }
      }
      
      return min_s;
   }
      
   public static void main(String[] args){
      Student s1 = new Student(21, "123456789");
      Student s2 = new Student(19, "987654321");
      System.out.println(s1.equals(s2));
      Student[] students = new Student[2];
      students[0] = s1;
      students[1] = s2;
      findYoungest(students);
   }
   
   
   public static void main (String[] args)
   {
   
   this.gamma = 0
   this.delta = 0
   int [] results;
   if (gamma.length==delta.length){
      results = new int [gamma.length];
      for(int i = 0; i<gamma.length; i++)
      {
      results[i] = gamma[i]+delta[i];
      
      }
   }else if (gamma.length<delta.length){
         results[i] = gamma[i]+delta[i];

   
   }
   
   }
   for (int i; i <  
   
   
     
   
   }

   
}

