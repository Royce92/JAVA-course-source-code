public class SortedIntList extends IntList{

   public SortedIntList(int size){
      super(size);
   }
   
   public void add(int value) 
   {
      if (numElements == list.length)
          System.out.println("Can't add, list is full"); 
      else 
       {
          int i=0;
          while(list[i]<value){
            i++;
          }
          
          //shift from i
          for(int j=numElements; j>i; j--){
            list[j] = list[j-1];
          }
          
          list[i] = value;
          
          numElements++;
          
       }
          
   }
    public SortedIntList merge(SortedIntList val){
      SortedIntList newList = new SortedIntList(numElements+val.numElements);
      for (int i=0; i<(numElements); i++){
         newList.add(list[i]);
         }
      for (int j=0; j<val.numElements; j++){
         newList.add(val.list[j]);
         }
         
         return newList;

   
   
   
   }

}