
/**
 * Creates an item with two instance variables
 *
 * @author Bryan Lam
 * 
 */
public class Item implements Comparable<Item>
{
    private String name;
    private double price;
    private String brand;
    static int totalItems = 50;
    public Item(String nm, double pr, String bd) {
        //sets the instance variables
        this.name = nm;
        this.price = pr;
        this.brand = bd;
    }
    public double setPrice(double pr) {
        //additional method that changes the price of the item
        return this.price = pr;
    }
    public int compareTo(Item other) {
        //compares two Item objects. Returns 0 if the two Items are equal and -1 if not.
        if(this.name.equals(other.name) && this.price == other.price && this.brand.equals(other.brand)) {
            return 0;
        }
        else {
            return -1;
        }
    }
    public String toString() {
        //toString method
        return name + " costs: " + price + ". The brand is: " + brand;
    }
    
}
