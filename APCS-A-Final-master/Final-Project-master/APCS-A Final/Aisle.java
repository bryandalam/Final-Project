
/**
 * Creates an Aisle object that uses Item as an instance variable
 *
 * @author Bryan Lam
 *)
 */
public class Aisle
{
    //instance variables
    private String aisleName;
    private Item itemName;
    private int itemsStocked;
    public Aisle(String nm, Item n, int itstk) {
        //Sets the instance variables
        this.aisleName = nm;
        this.itemName = n;
        this.itemsStocked = itstk;
    }
    public String toString() {
        //toString method
        return "The " + aisleName + " aisle is stocked with " + itemName + " and has " + itemsStocked + " avaliable.";
    }
    public boolean compareTo(Aisle other) {
        //compares two Aisle objects using the compareTo method and by checking for numerical equality
        if(this.aisleName.equals(other.aisleName) && this.itemsStocked == other.itemsStocked) {
            return true;
        }
        else {
            return false;
        }
    }
}
        
