
/**
 * Creates an item with two instance variables
 *
 * @author Bryan Lam
 * 
 */
public class Item implements Comparable
{
    private String name;
    private double price;
    private String brand;
    private static int totalItems = 50;
    public Item(String nm, double pr, String bd) {
        //sets the instance variables
        this.name = nm;
        this.price = pr;
        this.brand = bd;
    }
    public double setPrice(double pr) {
        //additional method that resets the price of the item
        return this.price = pr;
    }
    public boolean compareTo(Item other) {
        //compares the names and brand of the items using the compareTo() method and checks to see if the price is the same
        if(this.name.equals(other.name) && this.price == other.price && this.brand.equals(other.brand)) {
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
