
/**
 * Creates Aisle objects
 *
 * @author Bryan Lam
 * 
 */
public class AisleDriver
{
    public static void main(String[] args) {
     Item milk = new Item("Milk", 1.00, "Clover");
     Item icecream = new Item("Vanilla Ice Cream", 12.00, "Dreyers");
     Aisle dairy = new Aisle("Dairy", milk, 10);
     Aisle frozen = new Aisle("Frozen Food", icecream, 20);
     System.out.println(dairy.compareTo(frozen));
        
        
        
        
    }
}
