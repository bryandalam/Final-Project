
/**
 * Driver for the Item class and creates Item objects. It compares them too.
 *
 * @author Bryan Lam
 * 
 */
public class ItemDriver
{
    public static void main(String[] args) {
        Item orangejuice = new Item("Orange Juice", 1.00, "Tropicana");
        Item frozenpizza = new Item("Deep Dish Pizza", 12.00, "Dominos");
        System.out.println();
        System.out.println(orangejuice.toString());
        System.out.println(frozenpizza.toString());
        changeIt(orangejuice, frozenpizza);
        System.out.println(orangejuice.toString());
        System.out.println(frozenpizza.toString());
        
        
        
    }
    public static void changeIt(Item obj1, Item obj2) {
       obj1.setPrice(5.00);
       Item cookie = new Item("Chocolate Chip Cookie", 5.50, "Safeway");
       obj2 = cookie;
       obj2.setPrice(2.00);
       System.out.println(obj1.toString());
       System.out.println(obj2.toString());
    }
    
        
        
    }
      

