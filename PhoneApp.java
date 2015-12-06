import java.util.Random;
public class PhoneApp{

   public static void main(String[] args)
  {
  
  Random random = new Random();
  
  int one = random.nextInt(8);
  int two = random.nextInt(8);
  int three = random.nextInt(8);
  int four = random.nextInt(8);
  int five = random.nextInt(8);
  int six = random.nextInt(8);
  int seco = random.nextInt(748);
  String charac = seco+ "";
  while(charac.length() < 3){ 
  seco++;
  if (charac.length() == 3){

   break;
   
  }
    }

   System.out.println(one+""+two+""+three+"-"+seco+"-"+four+""+five+""+six);

  
  
  }

}