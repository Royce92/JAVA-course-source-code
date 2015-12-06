import java.util.Scanner;
public class Shop{
   public static void main (String [] args){
   boolean keep_shopping = true;
   Scanner scan = new Scanner(System.in);
   ShoppingCart myCart = new ShoppingCart();

   while(keep_shopping){
      System.out.println("Do you want to continue shopping");
      String cont = scan.newLine();
      if (cont == yes){
         System.out.println("Please enter the item name");
         String name = scan.next();
         System.out.println("Please enter the item price");
         String price = scan.nextInt();
         System.out.println("Please enter the item quantity");
         int quantity = scan.nextInt();
         myCart.addToCart(name, price, quantity);
         
   }
   
      else{
         keep_shopping = false;
         break;
   }
   }
   
   
   
   }


}