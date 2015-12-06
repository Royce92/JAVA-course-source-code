public class MonetaryCoin extends Coin {

   private int value;

   public MonetaryCoin(int value)
   {
      super();
      setValue(value);
   }
   
   public int getValue(){
    return value;
    }
   public void setValue(int a){
   value = a;
   }


}
