public class Student
{
   private int age;
   private String sid;
   
   public Student(int age, String sid)
   {
      this.age = age;
      this.sid = sid;
   }
   
   public int getAge(){
    return age; }
   public String getSid(){
    return sid; }
   public void setAge(int a){
    age = a; }
   public void setSid(String s){
    sid = s; }
   
   public String toString(){
      return "Student ID: "+sid+"Age:"+age;
   }
   
   public boolean equals(Student other)
   {
      return sid.equals(other.getSid());
   }
   
   public Student findYoungest(Student other)
   {
      if(age<other.getAge())
      {
         return this;
      }else{
         return other;
      }
   }
}