
/**
 * Driver for the Item class and creates Item objects. It compares them too.
 *
 * @author Bryan Lam
 * 
 */
public class Store
{
    public static void main(String[] args) {
        Item orangejuice = new Item("Orange Juice", 1.00, "Tropicana");
        Item frozenpizza = new Item("Deep Dish Pizza", 12.00, "Dominos");
        Item chickensoup = new Item("Chicken Soup", 5.00, "Cambells");
        Aisle soup = new Aisle("Soup", chickensoup, 10);
        Aisle frozen = new Aisle("Frozen Food", frozenpizza, 20);
        System.out.println(orangejuice.compareItem(frozenpizza));
        System.out.println(soup.compareAisles(frozen));
        
        
        
    }
    public static void changeIt(Item obj1, Item obj2) {
        
        
    }
      
}
