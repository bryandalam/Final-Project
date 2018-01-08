
/**
 * Creates an item with two instance variables
 *
 * @Bryan Lam
 * 
 */
public class Item
{
    private String name;
    private double price;
    private String brand;
    private static int totalItems;
    public Item(String nm, double pr, String bd) {
        //sets the instance variables
        this.name = nm;
        this.price = pr;
        this.brand = bd;
    }
    public double getPrice() {
        //additional method
        return this.price;
    }
    public boolean compareItem(Item other) {
        //compares the names and brand of the items using the compareTo() method and checks to see if the price is the same
        if(this.name.compareTo(other.name) == 0 && this.price == other.price && this.brand.compareTo(other.brand) == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public String toString() {
        //toString method
        return name + " costs: " + price + ". The brand is: " + brand;
    }
    
}
