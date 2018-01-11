
/**
 * Creates an Aisle object that uses Item as an instance variable
 *
 * @author Bryan Lam
 *)
 */
public class Aisle implements Comparable<Aisle>
{
    //instance variables
    private String aisleName;
    private Item itemName;
    public Aisle(String nm, Item n) {
        //Sets the instance variables
        this.aisleName = nm;
        this.itemName = n;
    }
    public String toString() {
        //toString method
        return "The " + aisleName + " aisle is stocked with " + itemName + ".";
    }
    public int compareTo(Aisle other) {
        //compares two Aisle objects. Returns 0 if the Aisles are equal and -1 if not.
        if(this.aisleName.equals(other.aisleName) && this.itemName.equals(other.itemName)) {
            return 0;
        }
        else {
            return -1;
        }
    }
}
        
