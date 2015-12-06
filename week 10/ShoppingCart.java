import java.text.NumberFormat;
public class ShoppingCart
{
private int itemCount; // total number of items in the cart
private double totalPrice; // total price of items in the cart
private int capacity; // current cart capacity
private Item[] cart;
// ---------------------------------------------------------
// Creates an empty shopping cart with a capacity of 5 items.
// ---------------------------------------------------------
public ShoppingCart()
{
capacity = 5;
itemCount = 0;
totalPrice = 0.0;
cart = new item[capacity];


}
// -----------------------------------------------------
// Adds an item to the shopping cart.
// -----------------------------------------------------
public void addToCart(String itemName, double price, int quantity)
{
   if (itemCount == capacity){
      increaseSize();
   }
   Item item = new Item(itemName, price, quantity);
   cart[itemCount] = item;
   
   itemCount++;
   totalPirce += item.getPrice()*item.getQuantity();
}
// -----------------------------------------------------
// Returns the contents of the cart together with
// summary information.
//Chapter 8: Arrays 132
// -----------------------------------------------------
public String toString()
{
NumberFormat fmt = NumberFormat.getCurrencyInstance();
String contents = "\nShopping Cart\n";
contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";
for (int i = 0; i < itemCount; i++)
contents += cart[i].toString() + "\n";
contents += "\nTotal Price: " + fmt.format(totalPrice);
contents += "\n";
return contents;
}
// -----------------------------------------------------
// Increases the capacity of the shopping cart by 3
// -----------------------------------------------------
private void increaseSize()
{
Item[] cart_new = new Item[capacity+3];
capacity = cart_new.length

   for(int i = 0; i <itemCount; i++){
   cart_new[i]= cart[i];
   }
   cart= cart_new;
}
}