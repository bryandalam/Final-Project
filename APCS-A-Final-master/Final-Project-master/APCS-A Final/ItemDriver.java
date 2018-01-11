
/**
 * Driver for the Item class and creates Item objects. It compares them too.
 *
 * @author Bryan Lam
 * 
 */
public class ItemDriver
{
    public static void main(String[] args) {
        //main method that instatiates two Items from the Item class
        Item orangejuice = new Item("Orange Juice", 1.00, "Tropicana");
        Item frozenpizza = new Item("Deep Dish Pizza", 12.00, "Dominos");
        System.out.println(orangejuice.totalItems);
        //calling the toString method
        System.out.println(orangejuice);
        System.out.println(frozenpizza);
        //calls the changeIt method
        changeIt(orangejuice, frozenpizza);
        //calls toString method after changeIt method
        System.out.println(orangejuice);
        System.out.println(frozenpizza);
    }
    public static void changeIt(Item obj1, Item obj2) {
       //changes the price of the object, using set price as the setter for the new price
       obj1.setPrice(5.00);
       Item cookie = new Item("Chocolate Chip Cookies", 5.50, "Safeway");
       obj2 = cookie;
       obj2.setPrice(2.00);
       //calls toString method after setters
       System.out.println(obj1);
       System.out.println(obj2);
    }
    }
      

