public class AmericanKlingonDictionary extends Dictionary 
{ 
   protected String publisher; 
   protected int year; 
   protected String isbn; 
   
   public String getPublisher(){
   return this.publisher; 
  }
  
  public void setPublisher(String value){
  this.publisher = value;
  
  }
  
  public int getYear(){
  return this.year;
  }
  
  public void setYear(int value){
  this.year = value;
 }
 
 public String getisbn(){
  return this.isbn;
 }
 public void setisbn(String value){
 this.isbn = value;
}
}